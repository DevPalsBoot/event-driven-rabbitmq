package org.devpalsboot.backend.report.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.devpalsboot.backend.report.domain.RequestEventReport;
import org.devpalsboot.backend.report.service.ReportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/report")
public class ReportController {
    private ReportService reportService;

    @PostMapping("/event")
    public ResponseEntity<?> createEventReport(@RequestBody @Valid RequestEventReport requestEventReport) {
        return new ResponseEntity<>(reportService.createEventReport(requestEventReport), HttpStatus.OK);
    }

}
