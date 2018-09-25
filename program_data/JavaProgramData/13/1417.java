package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int h;
		int i;
		int d;
		int j;
		int[] a = new int[20001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= h;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[1]);
		for (i = 2;i <= h;i++)
		{
			d = 0;
			for (j = 1;j < i;j++)
			{
				if (a[i] == a[j])
				{
					d = 1;
					break;
				}
			}
			if (d == 0)
			{
				System.out.printf(" %d",a[i]);
			}
		}
	}
}

