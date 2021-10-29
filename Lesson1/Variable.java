public class Variable {
    public static void main(String[] args) {
        byte coresNumber = 4;
        short exploringTimeMin = 32_600;
        int cpuKhz = 2_400_000;
        long ramKb = 7_982_712;
        float ssdGb = 476.94f;
        double costOfSecond = 0.0426179604262;
        char videoAdapter = 'N';
        boolean processorIntel = true;
        System.out.println("Число ядер: " + coresNumber + "\nВремя эксплуатации (мин.): " 
                + exploringTimeMin + "\nЧастота процессора: " + cpuKhz + "\nОбъем RAM KB: " 
                + ramKb + "\nОбъем жестеого диска SSD GB: " + ssdGb 
                + "\nСтоимость секунды эксплуатации (руб.): " + costOfSecond 
                + "\nПроизводитель видеочипа (I - Intel, N - Nvidia, A - ATI): " + videoAdapter 
                + "\nПроизводитель процессора Intel (да - true, нет - false): " + processorIntel);
    }
}