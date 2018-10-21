package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int c;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		int j = 0;
		for (i = 0;i < n;i++)
		{
			b[j] = a[i];
			j++;
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < n;j++)
		{
			if (i != j)
			{
				c = a[i] + b[j];
				if (c == k)
				{
					System.out.print("yes");
					break;
				}
				else
				{
					if (i == n - 1 && j == n - 2)
					{
						System.out.print("no");
						break;
					}
				}
			}
		}
		if (c == k)
		{
			break;
		}
		else
		{
			if (i == n - 1 && j == n - 2)
			{
				break;
			}
		}
		}
		return 0;
	}
}

