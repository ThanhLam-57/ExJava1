package FinalExamSDS.Exam3;

public class VanBan {
    private String noiDung;
    private char SPACE = ' ';
    private char TAB = '\t';
    private char BREAK_LINE = '\n';
    public VanBan(){};
    public VanBan(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
    public int demSotu(){
        if (noiDung == null) {
            return -1;
        }
        int count = 0;
        int size = noiDung.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (noiDung.charAt(i) != SPACE && noiDung.charAt(i) != TAB
                    && noiDung.charAt(i) != BREAK_LINE) {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }
    public String chuanHoa() {
        noiDung = noiDung.trim();
        noiDung = noiDung.replaceAll("\\s+", " ");
        return noiDung;
    }
    public String chuanHoaVietHoa(){
        noiDung = noiDung.toUpperCase();
        return noiDung;
    }
    public String chuanHoaVietThuong(){
        noiDung=noiDung.toLowerCase();
        return noiDung;
    }
    public String vietHoaChuDauTien(){
        char[] charArray = noiDung.toCharArray();
        boolean foundSpace = true;
        //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for(int i = 0; i < charArray.length; i++) {
            // nếu phần tử trong mảng là một chữ cái
            if(Character.isLetter(charArray[i])) {
                // kiểm tra khoảng trắng có trước chữ cái
                if(foundSpace) {
                    //đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
        }
        noiDung = String.valueOf(charArray);
        return noiDung;
    }
}
