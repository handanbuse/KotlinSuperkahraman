import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.kotlinsuperkahraman.TanitimActivity
import com.example.kotlinsuperkahraman.databinding.SuperkahramannBinding


class superkahramanAdapter(val superkahramanListesi: ArrayList<superkahraman>)  :
    RecyclerView.Adapter<superkahramanAdapter.superkahramanViewHolder>() {

    class superkahramanViewHolder(val binding: SuperkahramannBinding):RecyclerView.ViewHolder(binding.root)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): superkahramanViewHolder {
       val binding=SuperkahramannBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return superkahramanViewHolder(binding)
    }


    override fun getItemCount(): Int {
        return  superkahramanListesi.size

    }

    override fun onBindViewHolder(holder: superkahramanViewHolder, position: Int) {
      holder.binding.superkahramanTextview.text=superkahramanListesi[position].isim

        holder.itemView.setOnClickListener(){
            val intent= Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("secilenkahraman",superkahramanListesi[position])
            holder.itemView.context.startActivity(intent)
        }

    }
}