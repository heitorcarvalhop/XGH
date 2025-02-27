public class GodClassViolation {
    public static void main(String[] args) {
        Application app = new Application(new AuthService(), new DashboardService(), new PaymentService(), new ReportService());
        app.run();
    }
}

class Application {
    private AuthService authService;
    private DashboardService dashboardService;
    private PaymentService paymentService;
    private ReportService reportService;

    public Application(AuthService auth, DashboardService dash, PaymentService pay, ReportService rep) {
        this.authService = auth;
        this.dashboardService = dash;
        this.paymentService = pay;
        this.reportService = rep;
    }

    public void run() {
        System.out.println("Running application...");
        authService.authenticateUser();
        dashboardService.loadDashboard();
        paymentService.processPayments();
        reportService.generateReports();
    }
}

class AuthService {
    public void authenticateUser() { System.out.println("Authenticating user..."); }
}

class DashboardService {
    public void loadDashboard() { System.out.println("Loading dashboard..."); }
}

class PaymentService {
    public void processPayments() { System.out.println("Processing payments..."); }
}

class ReportService {
    public void generateReports() { System.out.println("Generating reports..."); }
}