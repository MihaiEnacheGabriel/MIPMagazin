USE [master]
GO
/****** Object:  Database [MagazinDeArticoleSportive]    Script Date: 11/26/2023 3:35:20 AM ******/
CREATE DATABASE [MagazinDeArticoleSportive]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'MagazinDeArticoleSportive', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\MagazinDeArticoleSportive.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'MagazinDeArticoleSportive_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\MagazinDeArticoleSportive_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [MagazinDeArticoleSportive].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET ARITHABORT OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET  DISABLE_BROKER 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET RECOVERY FULL 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET  MULTI_USER 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET DB_CHAINING OFF 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'MagazinDeArticoleSportive', N'ON'
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET QUERY_STORE = ON
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [MagazinDeArticoleSportive]
GO
/****** Object:  Table [dbo].[Achizitii]    Script Date: 11/26/2023 3:35:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Achizitii](
	[achizitie_id] [int] NOT NULL,
	[suma] [float] NULL,
	[metoda_de_plata] [nchar](15) NOT NULL,
	[data] [date] NOT NULL,
	[produs_id] [int] NOT NULL,
	[client_id] [int] NOT NULL,
 CONSTRAINT [PK_Achizitii] PRIMARY KEY CLUSTERED 
(
	[achizitie_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Adresa]    Script Date: 11/26/2023 3:35:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Adresa](
	[cod_postal] [int] NOT NULL,
	[judet] [nchar](20) NOT NULL,
	[oras] [nchar](20) NOT NULL,
	[strada] [nchar](25) NOT NULL,
	[nr_strada] [int] NOT NULL,
 CONSTRAINT [PK_Adresa] PRIMARY KEY CLUSTERED 
(
	[cod_postal] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Angajat]    Script Date: 11/26/2023 3:35:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Angajat](
	[angajat_id] [int] NOT NULL,
	[nume] [nchar](15) NOT NULL,
	[prenume] [nchar](20) NOT NULL,
	[email] [char](40) NOT NULL,
	[data_nasterii] [date] NOT NULL,
	[data_angajarii] [date] NOT NULL,
	[telefon] [nchar](15) NOT NULL,
	[cod_postal] [int] NOT NULL,
	[magazin_id] [int] NOT NULL,
 CONSTRAINT [PK_Angajat] PRIMARY KEY CLUSTERED 
(
	[angajat_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Client]    Script Date: 11/26/2023 3:35:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Client](
	[client_id] [int] NOT NULL,
	[nume] [nchar](15) NOT NULL,
	[prenume] [nchar](20) NOT NULL,
	[telefon] [nchar](15) NOT NULL,
	[email] [nchar](40) NOT NULL,
	[data_nasterii] [date] NOT NULL,
 CONSTRAINT [PK_Client] PRIMARY KEY CLUSTERED 
(
	[client_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Cont]    Script Date: 11/26/2023 3:35:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cont](
	[client_id] [int] NOT NULL,
	[card_bancar] [nchar](30) NULL,
	[achizitie_id] [int] NULL,
 CONSTRAINT [PK_Cont] PRIMARY KEY CLUSTERED 
(
	[client_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Magazin]    Script Date: 11/26/2023 3:35:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Magazin](
	[magazin_id] [int] NOT NULL,
	[cod_postal] [int] NOT NULL,
	[Nume] [nchar](25) NOT NULL,
 CONSTRAINT [PK_Magazin] PRIMARY KEY CLUSTERED 
(
	[magazin_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Manager]    Script Date: 11/26/2023 3:35:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Manager](
	[manager_id] [int] NOT NULL,
	[angajat_id] [int] NOT NULL,
 CONSTRAINT [PK_Manager] PRIMARY KEY CLUSTERED 
(
	[manager_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Produs]    Script Date: 11/26/2023 3:35:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Produs](
	[produs_id] [int] NOT NULL,
	[nume] [nchar](20) NOT NULL,
	[nr_bucati] [int] NULL,
	[valoare] [float] NULL,
	[greutate] [int] NULL,
	[marime] [int] NULL,
	[rand_id] [int] NOT NULL,
	[in_stoc] [bit] NULL,
 CONSTRAINT [PK_Produs] PRIMARY KEY CLUSTERED 
(
	[produs_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Raion]    Script Date: 11/26/2023 3:35:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Raion](
	[raion_id] [int] NOT NULL,
	[categorie] [nchar](20) NOT NULL,
	[nr_randuri] [int] NOT NULL,
	[magazin_id] [int] NULL,
 CONSTRAINT [PK_Raion] PRIMARY KEY CLUSTERED 
(
	[raion_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Rand]    Script Date: 11/26/2023 3:35:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Rand](
	[rand_id] [int] NOT NULL,
	[raion_id] [int] NULL,
 CONSTRAINT [PK_Rand] PRIMARY KEY CLUSTERED 
(
	[rand_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Salariu]    Script Date: 11/26/2023 3:35:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Salariu](
	[angajat_id] [int] NOT NULL,
	[venit_net] [float] NULL,
	[bonusuri] [float] NULL,
 CONSTRAINT [PK_Salariu] PRIMARY KEY CLUSTERED 
(
	[angajat_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Tranzactii]    Script Date: 11/26/2023 3:35:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tranzactii](
	[tranzactie_id] [int] NOT NULL,
	[suma] [float] NULL,
	[data] [date] NOT NULL,
	[manager_id] [int] NOT NULL,
 CONSTRAINT [PK_Tranzactii] PRIMARY KEY CLUSTERED 
(
	[tranzactie_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Achizitii]  WITH CHECK ADD  CONSTRAINT [FK_Achizitii_Client] FOREIGN KEY([client_id])
REFERENCES [dbo].[Client] ([client_id])
GO
ALTER TABLE [dbo].[Achizitii] CHECK CONSTRAINT [FK_Achizitii_Client]
GO
ALTER TABLE [dbo].[Achizitii]  WITH CHECK ADD  CONSTRAINT [FK_Achizitii_Produs] FOREIGN KEY([produs_id])
REFERENCES [dbo].[Produs] ([produs_id])
GO
ALTER TABLE [dbo].[Achizitii] CHECK CONSTRAINT [FK_Achizitii_Produs]
GO
ALTER TABLE [dbo].[Angajat]  WITH CHECK ADD  CONSTRAINT [FK_Angajat_Adresa] FOREIGN KEY([cod_postal])
REFERENCES [dbo].[Adresa] ([cod_postal])
GO
ALTER TABLE [dbo].[Angajat] CHECK CONSTRAINT [FK_Angajat_Adresa]
GO
ALTER TABLE [dbo].[Angajat]  WITH CHECK ADD  CONSTRAINT [FK_Angajat_Magazin] FOREIGN KEY([angajat_id])
REFERENCES [dbo].[Magazin] ([magazin_id])
GO
ALTER TABLE [dbo].[Angajat] CHECK CONSTRAINT [FK_Angajat_Magazin]
GO
ALTER TABLE [dbo].[Cont]  WITH CHECK ADD  CONSTRAINT [FK_Cont_Cont] FOREIGN KEY([achizitie_id])
REFERENCES [dbo].[Achizitii] ([achizitie_id])
GO
ALTER TABLE [dbo].[Cont] CHECK CONSTRAINT [FK_Cont_Cont]
GO
ALTER TABLE [dbo].[Magazin]  WITH CHECK ADD  CONSTRAINT [FK_Magazin_Adresa] FOREIGN KEY([cod_postal])
REFERENCES [dbo].[Adresa] ([cod_postal])
GO
ALTER TABLE [dbo].[Magazin] CHECK CONSTRAINT [FK_Magazin_Adresa]
GO
ALTER TABLE [dbo].[Manager]  WITH CHECK ADD  CONSTRAINT [FK_Manager_Angajat] FOREIGN KEY([angajat_id])
REFERENCES [dbo].[Angajat] ([angajat_id])
GO
ALTER TABLE [dbo].[Manager] CHECK CONSTRAINT [FK_Manager_Angajat]
GO
ALTER TABLE [dbo].[Produs]  WITH CHECK ADD  CONSTRAINT [FK_Produs_Rand] FOREIGN KEY([rand_id])
REFERENCES [dbo].[Rand] ([rand_id])
GO
ALTER TABLE [dbo].[Produs] CHECK CONSTRAINT [FK_Produs_Rand]
GO
ALTER TABLE [dbo].[Raion]  WITH CHECK ADD  CONSTRAINT [FK_Raion_Magazin] FOREIGN KEY([magazin_id])
REFERENCES [dbo].[Magazin] ([magazin_id])
GO
ALTER TABLE [dbo].[Raion] CHECK CONSTRAINT [FK_Raion_Magazin]
GO
ALTER TABLE [dbo].[Rand]  WITH CHECK ADD  CONSTRAINT [FK_Rand_Raion] FOREIGN KEY([raion_id])
REFERENCES [dbo].[Raion] ([raion_id])
GO
ALTER TABLE [dbo].[Rand] CHECK CONSTRAINT [FK_Rand_Raion]
GO
ALTER TABLE [dbo].[Salariu]  WITH CHECK ADD  CONSTRAINT [FK_Salariu_Angajat] FOREIGN KEY([angajat_id])
REFERENCES [dbo].[Angajat] ([angajat_id])
GO
ALTER TABLE [dbo].[Salariu] CHECK CONSTRAINT [FK_Salariu_Angajat]
GO
ALTER TABLE [dbo].[Tranzactii]  WITH CHECK ADD  CONSTRAINT [FK_Tranzactii_Manager] FOREIGN KEY([manager_id])
REFERENCES [dbo].[Manager] ([manager_id])
GO
ALTER TABLE [dbo].[Tranzactii] CHECK CONSTRAINT [FK_Tranzactii_Manager]
GO
USE [master]
GO
ALTER DATABASE [MagazinDeArticoleSportive] SET  READ_WRITE 
GO
