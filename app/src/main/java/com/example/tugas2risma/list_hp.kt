package com.example.tugas2risma

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas2risma.databinding.ListHpBinding

class list_hp : AppCompatActivity() {
    private lateinit var binding: ListHpBinding

    private lateinit var hpRecyclerView: RecyclerView
    private lateinit var hpAdapter: hpAdapter
    private lateinit var listhp : ArrayList<item_hp>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ListHpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listhp = ArrayList()
        listhp.add(
            item_hp(
                R.drawable.oppo,
                "Oppo Reno 13",
                "harga: 1.500.000",
                "stock 20",
                R.drawable.oppo,
                "Oppo Reno 13",
                "Oppo Reno 13 memiliki desain yang stylish dan modern, dengan bodi ramping dan material premium. Layar AMOLED 6,59 inci menawarkan warna yang cerah dan kontras yang tajam, serta mendukung resolusi tinggi 2760 x 1256 piksel. Dengan refresh rate 120Hz, pengguna dapat menikmati pengalaman visual yang sangat mulus, baik saat scrolling maupun bermain game."
            )
        )

        listhp.add(
            item_hp(
                R.drawable.vivo,
                "Vivo Y12",
                "harga: 2.300.000",
                "stock 20",
                R.drawable.vivo,
                "Vivo Y12",
                "Vivo Y12 adalah smartphone yang menawarkan kombinasi desain ramping dan performa handal. Ditenagai oleh prosesor Octa-core dan dilengkapi layar 6,35 inci, ponsel ini juga memiliki baterai besar 5000 mAh, menjadikannya ideal untuk penggunaan sehari-hari dan gaming."
            )
        )

        listhp.add(
            item_hp(
                R.drawable.samsung,
                "Samsung S23",
                "harga: 5.000.000",
                "stock 25",
                R.drawable.samsung,
                "Samsung S23",
                "Samsung Galaxy S23 hadir dengan desain elegan dan fitur canggih, termasuk kamera 200 MP yang luar biasa untuk foto malam. Ditenagai oleh layar Dynamic AMOLED 2X, ponsel ini menawarkan pengalaman visual yang memukau dan performa yang handal untuk kebutuhan sehari-hari."
            )
        )

        listhp.add(
            item_hp(
                R.drawable.nokia,
                "Nokia 6.1 Price",
                "harga: 2.300.000",
                "stock 27",
                R.drawable.nokia,
                "Nokia 6.1 Price",
                "Nokia 6.1 untuk varian 3GB RAM + 32GB penyimpanan. Ponsel ini menawarkan spesifikasi yang baik dengan desain yang menarik."
            )
        )

        listhp.add(
            item_hp(
                R.drawable.asus,
                "Asus Rog 8 Pro",
                "harga: 7.500.000",
                "stock 7",
                R.drawable.asus,
                "Asus Rog 8 Pro",
                "Asus ROG Phone 8 Pro adalah smartphone gaming yang mengesankan dengan prosesor Snapdragon® 8 Gen 3 dan layar AMOLED 6,78 inci yang mendukung refresh rate 165Hz. Dikenal dengan desain tahan air dan debu (IP68), ponsel ini juga dilengkapi dengan kamera utama 50MP dan baterai 5500mAh untuk pengalaman bermain yang optimal."
            )
        )

        listhp.add(
            item_hp(
                R.drawable.lenovo,
                "Lenovo Z6 Price",
                "harga: 1.000.000",
                "stock 37",
                R.drawable.lenovo,
                "Lenovo Z6 Price",
                "Lenovo Z6 Pro memiliki layar 6,39 inci Super AMOLED dengan resolusi 1080 x 2340 piksel. Ditenagai oleh chipset Snapdragon 855, tersedia dalam varian RAM 8GB atau 12GB, serta penyimpanan 128GB, 256GB, atau 512GB, dan dilengkapi dengan baterai 4000 mAh."
            )
        )

        listhp.add(
            item_hp(
                R.drawable.iphone,
                "Iphone 11",
                "harga: 6.300.000",
                "stock 17",
                R.drawable.iphone,
                "Iphone 11",
                "iPhone 11 hadir dengan layar Liquid Retina HD 6,1 inci dan ditenagai oleh chip A13 Bionic yang sangat cepat. Dikenal dengan kamera ganda yang luar biasa, desain elegan, serta daya tahan baterai yang baik, iPhone 11 menawarkan pengalaman pengguna yang memuaskan dan fitur-fitur canggih."
            )
        )

        listhp.add(
            item_hp(
                R.drawable.poco,
                "Poco M3",
                "harga: 2.000.000",
                "stock 27",
                R.drawable.poco,
                "Poco M3",
                "POCO M3 adalah smartphone yang diluncurkan pada November 2020, dilengkapi dengan layar 6.53 inci, chipset Snapdragon 662, dan baterai besar 6000 mAh. Memiliki kamera utama 48MP dan tersedia dalam varian memori 4GB RAM + 64GB ROM serta 6GB RAM + 128GB ROM."
            )
        )


        hpRecyclerView = findViewById(R.id.tampilan_list_hp)
        hpRecyclerView.setHasFixedSize(true)
        hpRecyclerView.layoutManager = LinearLayoutManager(this)

        hpAdapter = hpAdapter (listhp)
        hpRecyclerView.adapter = hpAdapter
        hpAdapter.onItemClick = {
            val intent = Intent(this, tampilan_detail_list_hp::class.java)
            intent.putExtra("hp", it)
            startActivity(intent)
        }
    }
}