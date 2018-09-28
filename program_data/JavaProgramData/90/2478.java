package <missing>;

public class GlobalMembers
{
	public static int function(int n,int m)
	{
			int f;
			if (n == 1 || m == 0 || n == 0 || m == 1)
			{
				f = 1;
			}
			else if (m < 0)
			{
				f = 0;
			}
			else
			{
				f = function(n - 1, m) + function(n, m - n);
			}
			return (f);
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < t;i++)
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
		if (m < n)
		{
				n = m;
				k = function(n, m);
		}
		else
		{
				k = function(n, m);
		}

		System.out.printf("%d\n",k);
		}
	}

}

