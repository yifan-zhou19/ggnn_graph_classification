package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j = 1;
		int h = 0;
		int[] a = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;(System.in.read()) == ' ';i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n - 1;j++)
			{
				if (a[i] == a[j])
				{
					a[j] = ' ';

				}
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i <= n - 1;i++)
		{
			if (a[i] == ' ')
			{
				continue;
			}
				System.out.printf(",%d",a[i]);

		}
		System.out.print("\n");
	}


}

