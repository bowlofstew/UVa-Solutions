package v114;
	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MusicalLoop_UVa11496{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();StringTokenizer st;
		int n; 
		while((n = Integer.parseInt(br.readLine()))!=0)
		{
			st = new StringTokenizer(br.readLine());
			int[] x = new int[n];int count = 0;
			for(int i = 0; i < n; i++)
				x[i] = Integer.parseInt(st.nextToken());
			for(int i = 0; i < n; i++)
			{
				int pre = i - 1;
				if(pre<0)
					pre = n - 1;
				int next = (i+1)%n;
				if(x[i]>x[pre]&&x[i]>x[next]||x[i]<x[pre]&&x[i]<x[next])
					count++;
			}
			sb.append(count+"\n");
		}
		System.out.print(sb);
	
		
	}
	
	
}	