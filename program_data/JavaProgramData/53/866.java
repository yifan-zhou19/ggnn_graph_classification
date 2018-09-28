package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[301];
		int[] b = new int[301];
		int j;
		int h = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		b[0] = a[0];
		for (i = 1;i <= n - 1;i++)
		{
			for (j = 0;j <= i - 1;j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
			}
			if (j == i)
			{
				b[h] = a[i];
				h++;
			}
		}
		for (i = 0;i <= h - 1;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",b[i]);
			}
			else
			{
				System.out.printf(",%d",b[i]);
			}
		}
		System.out.print("\n");
	}


}

