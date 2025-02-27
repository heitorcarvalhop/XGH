public class HardCodeDependecies {
    public static void main(String[] args) {
        ReportGenerator pdfReport = new PDFReportGenerator();
        Report report = new Report(pdfReport);
        report.generate();
    }
}

interface ReportGenerator {
    void generate();
}

class PDFReportGenerator implements ReportGenerator {
    public void generate() { System.out.println("Generating PDF Report..."); }
}

class CSVReportGenerator implements ReportGenerator {
    public void generate() { System.out.println("Generating CSV Report..."); }
}

class Report {
    private ReportGenerator reportGenerator;

    public Report(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generate() {
        reportGenerator.generate();
    }
}