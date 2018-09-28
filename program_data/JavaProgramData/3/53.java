package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] a = new int[10000];
		int b;
		int j;
		int d = 0;
		for (i = 0;i < 10000;i++)
		{
			a[i] = 0;
		}
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (d != 0)
			{
				break;
			}
			for (j = i + 1;j < n;j++)
			{
				b = 0;
				b = a[i] + a[j];
				if (k == b)
				{
					System.out.print("yes\n");
					d++;
					break;
				}

			}

		}

		if (d == 0)
		{
			System.out.print("no\n");
		}
			return 0;
	}
}

