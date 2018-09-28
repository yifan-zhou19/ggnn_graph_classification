package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int a;
		int b;
		int i;
		int t;
		a = b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m >= a)
			{
				b = a;
				a = m;
			}
			else if ((m < a) && (m >= b))
			{
				b = m;
			}
		}
		System.out.printf("%d\n%d",a,b);
		return 0;
	}
}

