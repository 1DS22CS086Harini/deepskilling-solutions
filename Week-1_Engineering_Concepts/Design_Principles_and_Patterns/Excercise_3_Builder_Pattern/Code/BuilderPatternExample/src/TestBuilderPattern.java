public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setOperatingSystem("Windows 11 Pro")
                .build();
        Computer officePC = new Computer.Builder("Intel i5", "8GB")
                .setOperatingSystem("Windows 10 Home")
                .build();
        gamingPC.showConfig();
        officePC.showConfig();
    }
}
