package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int t = 0;
		  int i;
		  int m;
		  int k = 0;
		  char[][] a = new char[100][9];
		  String e = new String(new char[9]);
		  float[] b = new float[100];
		  float[] g = new float[100];
		  float[] c = new float[100];
		  float d;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		 for (i = 0;i < n;i++)
		 {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = tempVar2.charAt(0);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  b[i] = Float.parseFloat(tempVar3);
			  }
		 }
		 for (i = 0;i < n;i++)
		 {
			if (a[i][0] == 'm')
			{
				c[t] = b[i];
				t++;
			}
		   else
		   {
			   g[k] = b[i];
			   k++;
		   }
		 }
		for (i = 0;i < t;i++)
		{
			for (m = 0;m < t - 1;m++)
			{
			if (c[m + 1] > c[m])
			{
			d = c[m];
			c[m] = c[m + 1];
			c[m + 1] = d;
			}
			}
		}
		for (i = t - 1;i > 0;i--)
		{
			System.out.printf("%.2f ",c[i]);
		}
		System.out.printf("%.2f",c[0]);
		 for (i = 0;i < k;i++)
		 {
			for (m = 0;m < k - 1;m++)
			{
			if (g[m] < g[m + 1])
			{
			d = g[m];
			g[m] = g[m + 1];
			g[m + 1] = d;
			}
			}
		 }
		for (i = 0;i <= k - 1;i++)
		{
			System.out.printf(" %.2f",g[i]);
		}
		   System.in.read();
		   System.in.read();
		   System.in.read();
		   System.in.read();
		   System.in.read();
		   System.in.read();
		   System.in.read();
		   System.in.read();
	}
}

