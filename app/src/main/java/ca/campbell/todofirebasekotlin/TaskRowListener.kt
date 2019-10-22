package ca.campbell.todofirebasekotlin

interface TaskRowListener {
    fun onTaskChange(objectId: String, isDone: Boolean)
}