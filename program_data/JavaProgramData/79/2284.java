package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int num;
		int[] s = new int[300];
		int[] b = new int[300];
		int q;
		int w;
		for (i = 1;;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
		if (s[i] == 0)
		{
			w = i - 1;
			break;
		}
		}
		int[] x = new int[w];

	  for (q = 1;q <= w;q++)
	  {
		int[[]] a = new int[s[q] + 1];
		for (i = 1;i <= s[q];i++)
		{
			a[i] = 1;
		}
		j = 0;
		k = 0;
	for (i = 1;i <= s[q];i++)
	{
		if (a[i] == 1)
		{
			j++;
			if (j == b[q])
			{
				a[i] = 0;
				j = 0;
				k++;
			}
			if (k == s[q])
			{
				x[q] = i;
				break;
			}
		}
		if (i == s[q])
		{
		i = 0;
		}
	}

	  }
	  for (q = 1;q <= w;q++)
	  {
		  System.out.printf("%d\n",x[q]);
	  }

	}

}

