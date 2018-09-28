package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[310];
		int l;
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
				l = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= i - 1;j++)
			{
				if (a[j] == l)
				{
					l = -1;
					break;
				}
			}
			a[i] = l;
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] == -1)
			{
				continue;
			}
			else
			{
				System.out.printf("%d",a[i]);
				i++;
				break;
			}
		}
		for (;i <= n;i++)
		{
			if (a[i] == -1)
			{
				continue;
			}
			else
			{
				System.out.printf(",%d",a[i]);
			}
		}
	}
}

