package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int t;
		int count;
		int baifang = new int(int m,int n);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= t;k++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 n = Integer.parseInt(tempVar3);
		 }
		 j = baifang(m, n);
		 System.out.printf("%d\n",j);
		}
	}

	public static int baifang(int m,int n)
	{
	int count;
	if (n == 1)
	{
		count = 1;
	}
	else if (m == 0 || m == 1)
	{
		count = 1;
	}
	else if (m > 1 && m < n)
	{
		count = baifang(m, n - 1);
	}
	else if (m >= n)
	{
		count = baifang(m - n, n) + baifang(m, n - 1);
	}
	return count;
	}

}

