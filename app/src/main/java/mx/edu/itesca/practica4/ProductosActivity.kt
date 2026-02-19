package mx.edu.itesca.practica4

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProductosActivity : AppCompatActivity() {
    var menu: ArrayList<Product> = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_productos)

        var menuOption: String? = intent.getStringExtra("menuType")
        agregarProductos(menuOption)

        var imagen: ImageView = findViewById(R.id.imageView)

        when(menuOption) {
            "Antojitos" -> {
                imagen.setImageResource(R.drawable.antojitos)
            }
            "Especialidades" -> {
                imagen.setImageResource(R.drawable.especialidades)
            }
            "Combinaciones" -> {
                imagen.setImageResource(R.drawable.combinations)
            }
            "Tortas" -> {
                imagen.setImageResource(R.drawable.tortas)
            }
            "Sopas" -> {
                imagen.setImageResource(R.drawable.sopas)
            }
            "Drinks" -> {
                imagen.setImageResource(R.drawable.drinks)
            }
        }

        var listView: ListView = findViewById(R.id.listView) as ListView

        var adaptador: AdaptadorProductos = AdaptadorProductos(this, menu)
        listView.adapter = adaptador
    }

    fun agregarProductos(option:String?) {
        when(option) {
            "Antojitos" -> {
                menu.add(Product("Quesadillas", R.drawable.quesadillas, 6.29, "Rellenas con su carne favorita, servidas con ensalada - Filled with your choice of meat, served with salad."))
                menu.add(Product("Huaraches", R.drawable.huaraches, 11.49, "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema - Big thick tortilla with beans, your choice of meat, fresh cheese, and sour cream."))
                menu.add(Product("Gringas", R.drawable.gringas, 8.39, "Tortilla de harina con queso, carne al pastor y piña. Flour tortilla filled with cheese, marinated pork and pineapple."))
                menu.add(Product("Sincronizadas", R.drawable.sincronizadas, 7.99, "Tortilla de harina rellena con queso y jamón. Acompañada de lechuga, crema y guacamole. Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole."))
                menu.add(Product("Sopes", R.drawable.sopes, 3.99, "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema. Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, and sour cream."))
                menu.add(Product("Tostadas", R.drawable.tostadas, 5.49, "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate. Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes."))
            }
            "Especialidades" -> {
                menu.add(Product("Mojarra Frita", R.drawable.mojarra, 17.99, "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas. Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas."))
                menu.add(Product("Ceviche", R.drawable.ceviche, 6.99, "Tilapia, camarones, aguacate y pico de gallo servido con chips. Tilapia, shrimp, avocado and pico de gallo, served with chips."))
                menu.add(Product("Botana camarones al mojo de ajo", R.drawable.botanacamarones, 19.99, ""))
            }
            "Combinaciones" -> {
                menu.add(Product("Taco Tradicional Combo", R.drawable.taco, 6.99, "Tortilla de maíz y tu carne favorita. Servido con arroz y frijoles. Corn taco, your choice of meat, served with rice and beans."))
                menu.add(Product("Mexican Burritos", R.drawable.burritos, 13.69, "Tu carne favorita en una tortilla grande de harina rellena con cebolla frita, pico de gallo, sour cream, frijoles y acompañado de arroz. Your choice of meat on a big burrito made of flour tortilla with rice, beans, lettuce, grilled onions, pico de gallo, and sour cream."))
                menu.add(Product("Los Portales Burritos", R.drawable.burritosportales, 14.59, "Large flour tortilla filled with grilled cactus, steak, pastor (seasoned pork), grilled onions, rice and beans. Served with a side of lettuce salad, tomatoes, sour cream and guacamole."))
                menu.add(Product("Cinco", R.drawable.cinco, 10.99, "One hard sell taco with your choice of meat, lettuce and cheese. One burrito with your choice of meat, pico de gallo, sour cream, and beans. Served with rice and beans."))
                menu.add(Product("Dos Amigos", R.drawable.dosamigos, 3.99, "Two hard shell tacos with your choice of meat topped with lettuce and shredded cheese. Served with a side of rice and beans."))
            }
            "Tortas" -> {
                menu.add(Product("Torta Regular", R.drawable.torta, 13.39, "All tortas come with lettuce, onions, tomatoes, avocado, sour cream, jalapeno pepper and your choice of meat."))
                menu.add(Product("Torta Milanesa de Res o Pollo", R.drawable.tortamilanesa, 13.99, "Breaded steak - Chicken."))
                menu.add(Product("Torta Cubana", R.drawable.tortacubana, 14.49, "Chorizo, asada, jamon, pastor y queso. Mexican sausage, steak, marinated pork, ham, and cheese."))
                menu.add(Product("Torta Mixta", R.drawable.tortamixta, 13.99, "Chorizo, asada y pastor. Mexican sausage, steak and marinated por."))
                menu.add(Product("Small Mexican Torta", R.drawable.smallmexican,  11.99, "Bolillo bread sandwich with your of meat, shredded lettuce, avocado, tomato, onion and sour cream."))
            }
            "Sopas" -> {
                menu.add(Product("Pozole", R.drawable.pozole, 13.99, "WEDNSDAY - SUNDAY Pork ribs and bonston butt stew with homminy and oregano. DO NOT FORGET OUR SALSA BAR TO MAKE IT MORE FLAVORFULL."))
                menu.add(Product("Menudo", R.drawable.menudo, 7.99, ""))
                menu.add(Product("Caldo de Res", R.drawable.caldores, 14.39, "Beef ribs and chuck stew with corn, potato, chayote (squash family), cabage, cilantro, onion, zuccini, carrots, lime, and tortillas. DO NOT FORGET OUR SALSA BAR TO MAKE IT MORE FLAVORFULL."))
                menu.add(Product("Caldo de Camaron", R.drawable.caldocamaron, 13.99, "Shrimp soup."))
                menu.add(Product("Sopa de Mariscos", R.drawable.sopamariscos, 21.99, "Seafood soup."))
            }
            "Drinks" -> {
                menu.add(Product("Michelada", R.drawable.michelada, 3.75, ""))
                menu.add(Product("Jarritos", R.drawable.jarritos, 2.75, ""))
                menu.add(Product("Caguamas", R.drawable.caguama, 5.75, ""))
                menu.add(Product("Caguamas Micheladas", R.drawable.caguamamichelada, 2.75, ""))
                menu.add(Product("Charolazo", R.drawable.charolazo, 9.75, ""))
                menu.add(Product("Cubeta Six", R.drawable.cubetasix, 9.75, ""))
                menu.add(Product("Cubetazo", R.drawable.cubetazo, 9.75, ""))
                menu.add(Product("Mexican Beer", R.drawable.mexicanbeer, 2.75, ""))
                menu.add(Product("Sodas", R.drawable.sodas, 2.75, ""))
            }
        }
    }

    private class AdaptadorProductos: BaseAdapter {
        var product = ArrayList<Product>()
        var context: Context ?= null

        constructor(contexto: Context, product: ArrayList<Product>) {
            this.product = product
            this.context = contexto
        }

        override fun getCount(): Int {
            return product.size
        }

        override fun getItem(position: Int): Any? {
            return product[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var prod = product[position]
            var inflador = LayoutInflater.from(context)
            var vista = inflador.inflate(R.layout.producto_view, null)

            var imagen = vista.findViewById(R.id.product_img) as ImageView
            var nombre = vista.findViewById(R.id.product_name) as TextView
            var desc = vista.findViewById(R.id.product_desc) as TextView
            var precio = vista.findViewById(R.id.product_price) as TextView

            imagen.setImageResource(prod.image)
            nombre.setText(prod.name)
            desc.setText(prod.descripcion)
            precio.setText("$${prod.price}")

            return vista
        }
    }
}