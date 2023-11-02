package com.anshpatel.MAD_Assignment_2_21012011066

import com.anshpatel.MAD_Assignment_2_21012011066.TaskItem

interface TaskItemClickListener
{
    fun editTaskItem(taskItem: TaskItem)
    fun completeTaskItem(taskItem: TaskItem)
}