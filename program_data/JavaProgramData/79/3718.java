package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int[] a = new int[1000];
		int i;
		int t = 0;
		int k;
	for (;;)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
	if (n == 0 && m == 0)
	{
	break;
	}
	k = n;
	for (i = 1;i <= n;i++)
	{
	a[i] = 1;
	}
	for (i = 1;;i++)
	{
		if (i == n + 1)
		{
	i = 1;
		}
	if (a[i] == 1)
	{
	t++;
	}
	   if (t == m)
	   {
		   a[i] = 0;
	   k--;
	   t = 0;
	   }
	if (k == 0)
	{
	break;
	}


	}
	System.out.printf("%d\n",i);




	}





	}
}

