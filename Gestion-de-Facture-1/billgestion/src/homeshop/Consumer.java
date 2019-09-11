package homeshop;

public class Consumer {
        private String fullname;
        private String address;

    public Consumer(String fullname, String address) {
        this.fullname = fullname;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public String getAddress() {
        return address;
    }
}
