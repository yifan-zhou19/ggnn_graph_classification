package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j = 0;
		int k = 0;
		int l = 0;
		int m = 0;
		int n;
		int p = 0;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n - 100 >= 0)
		{
			n = n - 100;
			j++;
		}
		while (n - 50 >= 0)
		{
			n = n - 50;
			k++;
		}
		while (n - 20 >= 0)
		{
			n = n - 20;
			l++;
		}
		while (n - 10 >= 0)
		{
			n = n - 10;
			m++;
		}
		while (n - 5 >= 0)
		{
			n = n - 5;
			q++;
		}
		while (n - 1 >= 0)
		{
			n = n - 1;
			p++;
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",j,k,l,m,q,p);
		return 0;
	}

}

