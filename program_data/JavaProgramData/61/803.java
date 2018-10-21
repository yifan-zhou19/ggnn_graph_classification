package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		if (n == 1 || n == 2)
		{
		return 1;
		}
		else
		{
		return f(n - 1) + f(n - 2);
		}
	}
	public static int Main()
	{
		int n;
		int num;
		int ans;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   num = Integer.parseInt(tempVar2);
		   }
		ans = f(num);
		System.out.printf("%d\n",ans);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			num = Integer.parseInt(tempVar3);
		}
		ans = f(num);
		System.out.printf("%d",ans);
	}
}

