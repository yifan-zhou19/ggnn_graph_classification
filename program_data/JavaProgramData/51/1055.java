package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		String a = new String(new char[500]);
		char[][] b = new char[500][5];
		int[] c = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		for (i = 0;a.charAt(i + n - 1);i++)
		{
			m = i + n - 1;
		 for (j = 0;j < n;j++)
		 {
		  b[i][j] = a.charAt(i + j);
		 }
		}
		for (i = 0;i < m - n + 2;i++)
		{
			c[i] = 0;
		 for (j = i + 1;j < m - n + 2;j++)
		 {
			 int t = 0;
			 int k;
		  for (k = 0;k < n;k++)
		  {
			  if (b[i][k] == b[j][k])
			  {
				  t++;
			  }
		  }
		  if (t == n)
		  {
		   c[i] = c[i] + 1;
		  }
		 }
		}
		int max = 0;
		for (i = 0;i < m - n + 2;i++)
		{
			if (max <= c[i])
			{
				max = c[i];
			}
		}
		if (max > 0)
		{
		System.out.printf("%d\n",max + 1);
		for (i = 0;i < m - n + 2;i++)
		{
			if (max == c[i])
			{
			 for (j = 0;j < n;j++)
			 {
		   System.out.printf("%c",b[i][j]);
			 }
		  System.out.print("\n");
			}
		}
		}
		  else
		  {
			  System.out.print("NO");
		  }

		return 0;
	}
}

