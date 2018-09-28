package <missing>;

public class GlobalMembers
{
	public static int F(int m)
	{
	  int[] f = new int[m];
	  int i;
	  for (i = 0;i < m;i++)
	  {
		if (i == 1 || i == 0)
		{
		  f[i] = 1;
		}
		else
		{
		f[i] = f[i - 1] + f[i - 2];
		}
	  }
	  return f[m - 1];
	}
	public static int Main()
	{
	  int n;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] s = new int[n];
	  int[] r = new int[n];
	  for (j = 0;j < n;j++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[j] = Integer.parseInt(tempVar2);
		}
		r[j] = F(s[j]);
	  }
	  for (j = 0;j < n;j++)
	  {
		System.out.printf("%d\n",r[j]);
	  }
	  return 0;
	}
}

