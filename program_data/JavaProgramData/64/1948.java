package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[110][3];
		int n;
		int k;
		int i;
		int j;
		int s = 0;
		int[][] flag = new int[1000][2];
		int temp2;
		float[] b = new float[110];
		float temp1;
		double m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		  for (j = 0;j < 3;j++)
		  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][j] = Integer.parseInt(tempVar2);
			}
		  }
		}
		for (i = 0;i < n;i++)
		{
		  for (k = i + 1;k < n;k++)
		  {
			m = 0;
			for (j = 0;j < 3;j++)
			{
			  m += (a[k][j] - a[i][j]) * (a[k][j] - a[i][j]);
			}
			b[s] = Math.sqrt(m);
			flag[s][0] = i;
			flag[s][1] = k;
			s++;
		  }
		}
		for (j = 0;j < s - 1;j++)
		{
		  for (i = 0;i < s - j - 1;i++)
		  {
			if (b[i] < b[i + 1])
			{
			  temp1 = b[i];
			  b[i] = b[i + 1];
			  b[i + 1] = temp1;
			  for (k = 0;k < 2;k++)
			  {
				temp2 = flag[i][k];
				flag[i][k] = flag[i + 1][k];
				flag[i + 1][k] = temp2;
			  }
			}
		  }
		}
		 for (i = 0;i < s;i++)
		 {
		   System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a[flag[i][0]][0],a[flag[i][0]][1],a[flag[i][0]][2],a[flag[i][1]][0],a[flag[i][1]][1],a[flag[i][1]][2],b[i]);
		 }
		 return 0;
	}
}

