package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
		int i = 0;
		int n = 0;
		int j;
		int count = 0;
		do
		{
			n = 0;
			count = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0] = Integer.parseInt(tempVar);
			}
			if (a[0] != -1)
			{
				i = 1;
				do
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i] = Integer.parseInt(tempVar2);
					}
					i++;
					count++;
				}while (a[i - 1] != 0);

				for (i = 0;i < count;i++)
				{
					for (j = i + 1;j < count;j++)
					{
						if (a[i] == 2 * a[j] || 2 * a[i] == a[j])
						{
							n++;
						}
					}
				}
				System.out.printf("%d\n",n);
			}

		}while (a[0] != -1);
		return 0;
	}
}

