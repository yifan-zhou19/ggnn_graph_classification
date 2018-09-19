package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int[] a = new int[16];
		for (;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[i] == 0)
			{
				System.out.printf("%d\n",k);
				i = -1;
				k = 0;
			}

			if (a[0] == -1)
			{
				break;
			}

			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j] * 2 || a[j] == a[i] * 2)
				{
					k++;
				}
			}
		}
	}
}

