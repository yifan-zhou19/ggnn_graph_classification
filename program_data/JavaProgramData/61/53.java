package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		if (n == 1)
		{
		return 1;
		}
		if (n == 2)
		{
		return 1;
		}
		return (f(n - 1) + f(n - 2));
	}
	public static int Main()
	{
		int n;
		int i;
		int a;
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
				 a = Integer.parseInt(tempVar2);
			 }
			 System.out.printf("%d\n",f(a));
		}
		System.in.read();
		System.in.read();
	}
}

