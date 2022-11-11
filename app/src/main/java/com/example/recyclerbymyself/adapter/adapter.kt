package com.example.recyclerbymyself.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerbymyself.R
import com.example.recyclerbymyself.model.modelAnime
import org.w3c.dom.Text

class AdapterAnime(private val context: Context, private val produtos: MutableList<modelAnime>): RecyclerView.Adapter<AdapterAnime.AnimeViewHolder>() {

    inner class AnimeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.iv)
        val nome = itemView.findViewById<TextView>(R.id.tvNome2)
        val episodio = itemView.findViewById<TextView>(R.id.tvEp2)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {

        val itemLista = LayoutInflater.from(context).inflate(R.layout.anime_item,parent,false)
        val holder = AnimeViewHolder(itemLista)
        return holder

    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {

        holder.foto.setImageResource(produtos[position].foto)
        holder.nome.text = produtos[position].nome
        holder.episodio.text = produtos[position].numeroEp
    }

    override fun getItemCount(): Int = produtos.size




}