package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		while (true)
		{
			int[] a = {-2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			int i;
			int j;
			int count = 0;
			for (i = 0; ; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				if (a[0] == -1 || a[i] == 0)
				{
					break;
				}
			}
			if (a[0] == -1)
			{
				break;
			}
			for (i = 0; a[i + 1] != 0; i++)
			{
				for (j = i + 1; a[j] != 0; j++)
				{
					if (a[i] == 2 * a[j] || a[i] * 2 == a[j])
					{
						count++;
					}
				}
			}
			System.out.printf("%d\n", count);
		}
	}
}

