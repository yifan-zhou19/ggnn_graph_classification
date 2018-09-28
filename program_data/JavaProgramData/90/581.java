package <missing>;

public class GlobalMembers
{
	//?? - ?????   

		public static int sum = 0;
	public static int Main()
	{
		int t;
		int n;
		int m;
		int i;
		int j;
		int num = new int(int m,int n);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
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
						System.out.printf("%d\n",num(m, n));
		}
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}
	public static int num(int m,int n)
	{
		if (n == 1 || m == 0)
		{
			return 1;
		}
		if (m < n)
		{
			return num(m, m);
		}
		return num(m, n - 1) + num(m - n, n);
	}


}

