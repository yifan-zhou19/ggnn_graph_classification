package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int s;
		while (true)
		{
			s = 0;
			for (i = 0;;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				if (a[i] == -1)
				{
					return 0;
				}
				else if (a[i] == 0)
				{
					break;
				}
			}
			for (j = 0;j <= i - 1;j++)
			{
				for (k = 0;k <= i - 1;k++)
				{
					if (a[j] == a[k] * 2)
					{
						s++;
						break;
					}
				}
			}
			System.out.printf("%d\n",s);
		}
	}
}

