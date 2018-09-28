package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10000];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		if (a[0] == 1)
		{
			System.out.print("End\n");
		}
		else
		{
			for (i = 0;a[i] != 1;i++)
			{
				if (a[i] % 2 == 1)
				{
					a[i + 1] = a[i] * 3 + 1;
					System.out.printf("%d*3+1=%d\n",a[i],a[i + 1]);
				}
				else
				{
					a[i + 1] = a[i] / 2;
					System.out.printf("%d/2=%d\n",a[i],a[i + 1]);
				}

			}
			System.out.print("End\n");
		}
	}
}

