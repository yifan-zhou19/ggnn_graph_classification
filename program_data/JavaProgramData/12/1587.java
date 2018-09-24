package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		while (true)
		{
			int i = 0;
			int[] a = new int[16];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[i] == -1)
			{
				break;
			}

			int[] b = new int[105];
			b[a[i]] = 1;

			while (true)
			{
				i++;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				if (a[i] == 0)
				{
					break;
				}
				b[a[i]] = 1;
			}

			int j;
			int total = 0;
			for (j = 1; j < 50; j++)
			{
				if (b[j] == 1 && b[j * 2] == 1)
				{
					total++;
				}
			}
			System.out.printf("%d\n", total);
		}
		return 0;
	}
}

