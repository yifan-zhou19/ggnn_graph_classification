package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int M = -1;
		int j;
		char[][] a = new char[1000][100];
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
				a[i] = tempVar2.charAt(0);
			}
		}
		while (true)
		{
			for (j = k;j < n;j++)
			{
				M += String.valueOf(a[j]).length() + 1;
				if (j == k)
				{
					System.out.printf("%s",a[j]);
				}
				else if (M < 81)
				{
					System.out.printf(" %s",a[j]);
				}
				else
				{
					System.out.print("\n");
					M = -1;
					k = j;
					break;
				}
			}
			if (j == n)
			{
				break;
			}
		}
		return 0;
	}
}

