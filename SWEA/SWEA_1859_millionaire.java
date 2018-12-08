package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// Ʋ���ڵ��Դϴ�.
public class swea_1859_millionaire {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t = 0; t < T; t++) {
            int n = Integer.parseInt(bf.readLine()); 
            
            String line = bf.readLine();
            StringTokenizer st = new StringTokenizer(line);
            
            int[] prices = new int[n];
            //�������� ����
            for(int i = 0; i < n; i++) {
                prices[i] = Integer.parseInt(st.nextToken(" "));
            }
            
            //�� ��츶�� �춧, �ȶ��� ������ ����
            Long[][] calculate = new Long[n][2];
            Long costBuy = (long) 0;
            Long costSell = (long) 0;
            for(int i = 0; i < n; i++) {
                if(i == 0) {
                    costBuy = (long) prices[i];
                    costSell = (long) 0;

                    calculate[i][0] = costBuy; //�춧�� ��հ�
                    calculate[i][1] = costSell; //�ȶ��� �Ѽ���
                } else if(i == 1) {
                    costBuy = (long) prices[i] + prices[i-1]; 
                    costSell = (long) prices[i] - prices[i-1];
                    
                    calculate[i][0] = costBuy;
                    calculate[i][1] = costSell;
                }
                else {
                    costSell = (prices[i] * i) - costBuy;
                    costBuy = calculate[i-1][0] + prices[i];
                    
                    calculate[i][0] = costBuy;
                    calculate[i][1] = costSell;
                }
            }
            
            long maxCost = calculate[0][1]; //
            for(int i = 0; i < n; i++) {
                if(maxCost < calculate[i][1]) {
                    maxCost = calculate[i][1];
                }
            }
            
            System.out.println("#" + (t+1) + " " + maxCost);
        }
        
    }

}
