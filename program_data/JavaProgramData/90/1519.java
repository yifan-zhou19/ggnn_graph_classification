package <missing>;

public class GlobalMembers
{
	public static int pg(int m,int n)
	{
		if (m == 1 || n == 1)
		{
			return 1;
		}
		if (m == 0 || m == 0)
		{
			return 0;
		}
		if (m < n)
		{
			return pg(m, m);
		}
		if (m == n)
		{
			return pg(m, n - 1) + 1;
		}
		return pg(m, n - 1) + pg(m - n, n);
	}

	public static int Main()
	{
		  int s;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = Integer.parseInt(tempVar);
		  }
		  int[] m = new int[s];
		  int[] n = new int[s];
		  for (i = 0;i < s;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  n[i] = Integer.parseInt(tempVar3);
		  }
		  }
		  for (i = 0;i < s;i++)
		  {
		  System.out.printf("%d\n",pg(m[i], n[i]));
		  }
	}

}

