package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k = 1;
	int m = 0;
	int x = 0;
		int[] cs = new int[100];
		int[] sz = new int[100];
		int[] a = new int[100];
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
			  cs[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  sz[i] = Integer.parseInt(tempVar3);
		  }
		}
		for (i = 0;i < n;i++)
		{
		  if (cs[i] <= 140 && cs[i] >= 90 && sz[i] <= 90 && sz[i] >= 60)
		  {
			a[i] = 1;
		  }
		  else
		  {
			a[i] = 0;
		  }
		}
		if (n == 1)
		{
		  if (a[0] == 1)
		  {
			m = 1;
		  }
		}
		else
		{
		  for (i = 1;i < n;i++)
		  {
			j = i - 1;
			if (a[j] == 1 && a[i] == 1)
			{
			  k++;
			  if (k > m)
			  {
				m = k;
			  }
			}
			else
			{
			  k = 1;
			  if (k > m)
			  {
				m = k;
			  }
			}
		  }
		}
		for (i = 0;i < n;i++)
		{
		  if (a[i] == 1)
		  {
			x++;
		  }
		}
		if (x == 0)
		{
		  m = 0;
		}
		System.out.printf("%d",m);
	return 0;
	}
}

