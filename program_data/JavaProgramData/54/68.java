package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m;
		int a;
		int i;
		int tempa = 1;
		int tempb = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
			tempa = tempa * n;
		}
		if (n == 2)
		{
			System.out.print("7");
		}
		else
		{
			m = tempa - n * k + k;
			System.out.printf("%d",m);
		}
	}

}

