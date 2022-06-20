package example.com.githubconnect.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import example.com.githubconnect.data.model.Repository
import example.com.githubconnect.databinding.RepositoryItemBinding

class RepositoryListAdapter :
    ListAdapter<Repository, RepositoryListAdapter.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RepositoryItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(private val binding: RepositoryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

            fun bind(item: Repository) {
                binding.tvRepositoryName.text = item.name
                binding.tvRepositoryDescription.text = item.description
                binding.tvRepositoryLanguage.text = item.language?.name
                binding.tvRepositoryStars.text = item.stargazersCount.toString()

                Glide.with(binding.root.context)
                    .load(item.owner.avatarURL).into(binding.ivOwnerAvatar)

            }

    }


}

class DiffCallback : DiffUtil.ItemCallback<Repository>() {
    override fun areItemsTheSame(oldItem: Repository, newItem: Repository) = oldItem == newItem
    override fun areContentsTheSame(oldItem: Repository, newItem: Repository) =
        oldItem.id == newItem.id
}