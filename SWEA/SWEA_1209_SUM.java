package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class SWEA_1209_SUM {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for(int t = 1; t <= 10; t++) {
            //�Է°��� �׽�Ʈ ���̽��� ��ȣ�� �˷��ִ� ������ �ʿ� �����Ƿ� �� �� �о Ŀ���� �ű�⸸ ��.
            bf.readLine();
            
            int[][] map = new int[100][100];
            for(int i = 0; i < 100; i++) {
                String tempLine = bf.readLine();
                StringTokenizer st = new StringTokenizer(tempLine, " ");
                int tempi = 0;
                while(st.hasMoreTokens()) {
                    map[i][tempi] = Integer.parseInt(st.nextToken());
                    tempi++;
                }
            }
            LinkedList<Integer> sumList = new LinkedList<>();
            
            //���δ��ϱ�
            for(int i = 0; i < 100; i++) {
                int sum = 0;
                for(int j = 0; j < 100; j++) {
                    sum += map[i][j];
                }
                sumList.add(sum);
            }
            
             
            //���δ��ϱ�
            for(int i = 0; i < 100; i++) {
                int sum = 0; 
                for(int j =0; j < 100; j++) {
                    sum += map[j][i];
                }
                sumList.add(sum);
            }
            
            //�밢�����ϱ�(������ -> �����ʾƷ�)
            int sum1 = 0;
            for(int i = 0; i < 5; i++) {
                sum1 += map[i][i];
            }
            sumList.add(sum1);
            
            
            //�밢�����ϱ�(�������� -> ���ʾƷ�)
            int sum2 = 0;
            for(int i = 4; i >= 0; i--) {
                sum2 += map[i][i];
            }
            sumList.add(sum2);
            
            //�ִ� ã��
            int max = sumList.get(0);
            for(int i = 1; i < sumList.size(); i++) {
                if(sumList.get(i)>max)
                    max = sumList.get(i);
            }
            System.out.println("#" + t + " " + max);
        }
    }

}
