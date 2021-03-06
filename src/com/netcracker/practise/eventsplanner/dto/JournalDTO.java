package com.netcracker.practise.eventsplanner.dto;

import com.netcracker.practise.eventsplanner.model.TaskJournal;

import java.io.Serializable;
import java.util.List;

/**
 * @author A.Belousow
 */
public class JournalDTO implements Serializable {

    private List<TaskDTO> taskDTOList;

    public List<TaskDTO> getTaskDTOList() {
        return taskDTOList;
    }

    public JournalDTO(List<TaskDTO> taskDTOList) {
        this.taskDTOList = taskDTOList;
    }
}
