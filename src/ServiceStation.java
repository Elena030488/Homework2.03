public class ServiceStation {
    public void check(Service service) {
        service.doService();
    }
    public void check(Transport transport) {
        transport.doService();
    }
}

