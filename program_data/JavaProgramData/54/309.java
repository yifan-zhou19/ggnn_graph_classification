package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m;
		int i = 1;
		int a = 1;
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
		m = a * n + k;
			do
			{
			if (m % (n - 1) == 0)
			{
				m = m * n / (n - 1) + k;
				i = i + 1;
			}
			else
			{
				a++;
				m = a * n + k;
				i = 1;
			}
			} while (i <= (n - 1));

		System.out.printf("%d\n",m);
	}
}

