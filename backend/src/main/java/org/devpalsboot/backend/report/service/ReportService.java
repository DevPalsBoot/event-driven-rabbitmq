package org.devpalsboot.backend.report.service;

import lombok.RequiredArgsConstructor;
import org.devpalsboot.backend.report.domain.RequestEventReport;
import org.devpalsboot.backend.report.domain.ResponseEventReport;
import org.devpalsboot.backend.storage.service.StorageService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReportService {

    private final StorageService storageService;

    public String createEventReport(RequestEventReport requestEventReport) {
        // todo s3 업로드
        // todo MQ에 메시지 발행
        return "";
    }

    public ResponseEventReport downloadAnalysisReport(RequestEventReport requestEventReport) {
        // todo s3에 접근해서 보고서 다운로드
        return null;
    }
}
