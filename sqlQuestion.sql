-- Untuk menampilkan data berupa kode nasabah, nama nasabah, frekuensi transaksi, dan total nilai transaksi
SELECT
    T.Kode AS Kode,
    N.Nama AS NamaNasabah,
    COUNT(T.Kode) AS Frekuensi,
    SUM(T.HargaSatuan * T.Kuantitas) AS TotalTransaksi
FROM
    Transaksi T
JOIN
    Nasabah N ON T.Kode = N.Kode
GROUP BY
    T.Kode, N.Nama
ORDER BY
    TotalTransaksi DESC
LIMIT 3;


-- Untuk menampilkan data produk dengan harga satuan yang paling murah
SELECT
    Produk,
    MIN(HargaSatuan) AS HargaSatuan
FROM
    Transaksi
GROUP BY
    Produk;

