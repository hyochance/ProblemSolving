package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1204_MostNumber {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int students = 1000;    //�л���
        int T = Integer.parseInt(bf.readLine());    //�׽�Ʈ ���̽� ����
        String[] nums = new String[T];  //�׽�Ʈ ���̽� ��ȣ

        for(int i=0; i < T; i++) {
            int[] scores = new int[101]; //0~100�������� �迭�� �����,    
            for(int a=0; a < scores.length; a++) {  //�� �迭�� ���� ���� 0���� �ʱ�ȭ��
                scores[a] = 0;
            }
            nums[i] = bf.readLine();
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);
            
            int max = 0;
            int maxTick = 0;
            // �� ������ �������� �о�鿩�� �ش� ���� �迭(scores[])�� ī��Ʈ�� 1�� �÷���
            for(int k=0; k<students; k++) {
                int tick = Integer.parseInt(st.nextToken(" "));
                scores[tick] = scores[tick] + 1;
            }
            
            // ��� �迭�� Ž���ϸ� scores[f]�� ���� ���� ���� ���� ã��. �װ��� �� �ֺ��. 
            for(int f=0; f<scores.length; f++) {
                // ���� �󵵷� ������ ���, ���� ū ������ ����ؾ� �ϹǷ�, max<=scores[f]
                if(max <= scores[f]) {
                    max = scores[f];
                    maxTick = f;
                }
            }
            System.out.println("#" + nums[i] + " " + maxTick);  //�� : #1 71
        }
        bf.close();
        }
}