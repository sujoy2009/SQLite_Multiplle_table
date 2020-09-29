package com.sujoykar.sqlite_projectt.Features.SubjectCRUD.UpdateSubjectInfo;

import com.sujoykar.sqlite_projectt.Features.SubjectCRUD.CreateSubject.Subject;

public interface SubjectUpdateListener {
    void onSubjectInfoUpdate(Subject subject, int position);
}
