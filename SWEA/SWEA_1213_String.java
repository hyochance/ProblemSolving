package swea;

import java.util.Scanner;

public class SWEA_1213_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int t = 1; t <= 10; t++) {
            //�Է¿��� �־����� �׽�Ʈ ���̽� ��ȣ�� �ʿ� �����Ƿ�, �� �� �о �����͸� �ű�⸸ �Ѵ�.
            scan.nextLine();
            String toFind = scan.nextLine();
            String line = scan.nextLine();
            
            int count = 0;
            for(int i = 0; i <= line.length()-toFind.length(); i++) {
                String temp = line.substring(i, i+toFind.length());
                if(temp.equals(toFind))
                    count+=1;
            }
            
            System.out.println("#" + t + " " + count);
            
        }
        scan.close();
        
    }

}
