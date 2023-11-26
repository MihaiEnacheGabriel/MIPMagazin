import java.sql.*;

public class DbUtils {

    public static int isWorking()
    {
        if(getConnection()==null)
        {
            return 0;
        }

        return 1;
    }

    public static void insertAdresa(Adresa adresa) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = getConnection();
            String sql = "INSERT INTO Adresa (cod_postal, judet, oras, strada, nr_strada) VALUES (?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, adresa.getCodPostal());
            pstmt.setString(2, adresa.getJudet());
            pstmt.setString(3, adresa.getOras());
            pstmt.setString(4, adresa.getStrada());
            pstmt.setInt(5, adresa.getNrStrada());
            pstmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
    public static Connection getConnection()
    {
        Connection conn;

        String connectionUrl;

        //connectionUrl = ApplicationProperties.getProperties().getProperty(Constants.CONNECTION_STRING);
        connectionUrl = "jdbc:sqlserver://localhost:1433;database=MagazinDeArticoleSportive;encrypt=false;integratedSecurity=true";

        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(connectionUrl);

            if(conn==null)
            {
                return null;
            }

            Statement statement = conn.createStatement();

           /* ResultSet resultSet = statement.executeQuery("spStudentSelectAllActive");
            while (resultSet.next())
            {
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
            }*/

        }
        catch(Exception ex) {
            ex.printStackTrace();
            return null;
        }
        return conn;
    }

}