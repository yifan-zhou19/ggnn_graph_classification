package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m;
		int l;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		m = n - 1;
		do
		{
			l = m;
			for (i = 1;i <= n - 1;i++)
			{
				l = l * n / (n - 1) + k;
				if (l % (n - 1) != 0)
				{
					break;
				}
			}
			m = m + n - 1;
		} while (l % (n - 1) != 0);
		l = l * n / (n - 1) + k;
		System.out.printf("%d",l);
	}
}

