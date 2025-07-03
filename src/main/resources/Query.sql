CREATE DATABASE RegalosDB;
GO

USE RegalosDB;
GO

CREATE TABLE RegaloDigital
(
    RegaloID INT IDENTITY(1,1) PRIMARY KEY,
    Destinatario NVARCHAR(100) NOT NULL,
    Remitente NVARCHAR(100) NOT NULL,
    Mensaje NVARCHAR(MAX) NOT NULL,
    TipoRegalo NVARCHAR(50) NOT NULL,
    FechaEnvio DATE NOT NULL,
    EnlaceDescarga NVARCHAR(200) NOT NULL
);
GO

INSERT INTO RegaloDigital
    (Destinatario, Remitente, Mensaje, TipoRegalo, FechaEnvio, EnlaceDescarga)
VALUES
    ('Ana P�rez', 'Carlos L�pez', N'�Feliz cumplea�os!', 'LibroDigital', '2025-07-01', 'https://mi-tienda.com/download/ebook123'),
    ('Luis Mart�nez', 'Mar�a G�mez', N'Disfruta tu regalo musical', 'Suscripci�n Spotify', '2025-07-02', 'https://spotify.com/redeem/XYZ789'),
    ('Elena Ruiz', 'Javier Sol�s', N'Un detalle para ti', 'LibroDigital', '2025-07-03', 'https://mi-tienda.com/download/ebook456'),
    ('Marcela D�az', 'Andr�s Toro', N'Que lo disfrutes mucho', 'Suscripci�n Spotify', '2025-07-04', 'https://spotify.com/redeem/ABC123'),
    ('Fernando Ortiz', 'Alicia Vega', N'�Sorpresa para ti!', 'LibroDigital', '2025-07-05', 'https://mi-tienda.com/download/ebook789');
GO

SELECT *
FROM RegaloDigital;
GO
