package com.example.recycleviewtablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"



/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment1 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapter: MyAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var itemArrayList: ArrayList<item>

    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    lateinit var desk : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val inflate = inflater.inflate(R.layout.fragment_blank1, container, false)
        return inflate
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MyAdapter(itemArrayList)
        recyclerView.adapter = adapter
    }


    private fun dataInitialize(){
        itemArrayList = arrayListOf<item>()

        imageId = arrayOf(
            R.drawable.pura_besakih,
            R.drawable.kepulauan_derawan,
            R.drawable.taman_nasional_way_kambas,
            R.drawable.pantai_parai_tenggiri,
            R.drawable.nusa_dua_bali,
            R.drawable.gunung_rinjani,
            R.drawable.danau_toba,
            R.drawable.nusa_penida


        )
heading = arrayOf(
   getString(R.string.head_1),
   getString(R.string.head_2),
   getString(R.string.head_3),
   getString(R.string.head_4),
   getString(R.string.head_5),
   getString(R.string.head_6),
   getString(R.string.head_7),
   getString(R.string.head_8),



)
        desk = arrayOf(
            getString(R.string.item_1),
            getString(R.string.item_2),
            getString(R.string.item_3),
            getString(R.string.item_4),
            getString(R.string.item_5),
            getString(R.string.item_6),
            getString(R.string.item_7),
            getString(R.string.item_8),
        )

for(i in imageId.indices){
    val desk = item(imageId[i],heading[i])
    itemArrayList.add(desk)
}







    }
}