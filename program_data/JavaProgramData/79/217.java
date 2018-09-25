package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int a;
		int b;
			  a = 0;
			  b = 0;
		for (;;b++)
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
			for (i = 2;i <= n; i++)
			{
				a = (a + m) % i;
			}
				System.out.printf("%d\n",a + 1);
				a = 0;
		}
	return 0;
	}
}

