package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int i;
		int j;
		int n;
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
		System.out.printf("%d",a[0]);

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i] == a[j])
				{
					break;
				}

			if (j == i - 1)
			{
				System.out.print(" ");
				System.out.printf("%d",a[i]);
			}
			}
		}



		return 0;
	}
}

