package com.example.googleplaystore.book

import android.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(private val bookList: List<Book>) :
    RecyclerView.Adapter<BookAdapter.BookViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.book_item, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = bookList[position]
        holder.bind(book)
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

    inner class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var titleTextView: TextView

        init {
            titleTextView =
                itemView.findViewById<TextView>(R.id.titleTextView) // Replace with your TextView ID
        }

        fun bind(book: Book) {
            titleTextView.text = book.title
            // Bind other data to views here
        }
    }
}