package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[16];
	public static int Main()
	{
		int n;
		while (true)
		{
			int i = 0;
			int s = 0;
			int j;
			while (true)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				if (a[i] == 0 || a[i] == -1)
				{

					n = i;
					break;
				}
				i++;
			}
			if (a[i] == -1)
			{
				break;
			}
			for (i = 0;i < n - 1;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if ((a[i] == 2 * a[j]) || (a[j] == 2 * a[i]))
					{
						s++;

					}
				}
			}
			System.out.printf("%d\n",s);
				s = 0;
		}
		return 0;
	}


}

