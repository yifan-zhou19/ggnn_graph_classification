package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[20001];
		int j;
		int l;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (l = (i + 1);l < n;l++)
			{
				if (a[l] == a[i])
				{
					for (j = (l + 1);j < n;j++)
					{
						a[j - 1] = a[j];
					}
				l -= 1;
				n--;
				}
			}

		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
				System.out.printf(" %d",a[i]);
			}
		}

		return 0;

	}
}

