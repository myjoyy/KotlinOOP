data class Post(
    val ownerId: Long,
    val fromId: Long,
    val createdBy: Long,
    val attachments: Array<Attachment> = emptyArray(),
    val original: Post? = null,
    val text: String = "",
    val friendsOnly: Boolean = false,
    val likes: Int = 0,
    val reposts: Int = 0,
    val postType: String = "Simple",
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = false,
    val isFavorite: Boolean = false,
    val id: Int = 0
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Post

        if (ownerId != other.ownerId) return false
        if (fromId != other.fromId) return false
        if (createdBy != other.createdBy) return false
        if (!attachments.contentEquals(other.attachments)) return false
        if (original != other.original) return false
        if (text != other.text) return false
        if (friendsOnly != other.friendsOnly) return false
        if (likes != other.likes) return false
        if (reposts != other.reposts) return false
        if (postType != other.postType) return false
        if (canPin != other.canPin) return false
        if (canDelete != other.canDelete) return false
        if (canEdit != other.canEdit) return false
        if (isPinned != other.isPinned) return false
        if (isFavorite != other.isFavorite) return false
        if (id != other.id) return false
        return true
    }

    override fun hashCode(): Int {
        var result = ownerId.hashCode()
        result = 31 * result + fromId.hashCode()
        result = 31 * result + createdBy.hashCode()
        result = 31 * result + attachments.contentHashCode()
        result = 31 * result + (original?.hashCode() ?: 0)
        result = 31 * result + text.hashCode()
        result = 31 * result + friendsOnly.hashCode()
        result = 31 * result + likes
        result = 31 * result + reposts
        result = 31 * result + postType.hashCode()
        result = 31 * result + canPin.hashCode()
        result = 31 * result + canDelete.hashCode()
        result = 31 * result + canEdit.hashCode()
        result = 31 * result + isPinned.hashCode()
        result = 31 * result + isFavorite.hashCode()
        result = 31 * result + id
        return result
    }
}