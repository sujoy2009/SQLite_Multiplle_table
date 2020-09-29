package com.sujoykar.sqlite_projectt.Features.StudentCRUD.UpdateStudentInfo;

import com.sujoykar.sqlite_projectt.Features.StudentCRUD.CreateStudent.Student;

public interface StudentUpdateListener {
    void onStudentInfoUpdated(Student student, int position);
}
