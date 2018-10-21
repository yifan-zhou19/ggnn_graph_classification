package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[] a = new int[60];
		int s;
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
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
			s = a[j - 1];
			for (j = m - 1;j >= 0;j--)
			{
				if (s + 3 * (j + 1) > 63)
				{
					s = a[j - 1];
				}
				else
				{
					break;
				}
			}
			if (s + 3 * (j + 1) >= 60)
			{
				System.out.printf("%d\n",s);
			}
			else
			{
				System.out.printf("%d\n",60 - 3 * (j + 1));
			}
		}
		return 0;
	}
}

