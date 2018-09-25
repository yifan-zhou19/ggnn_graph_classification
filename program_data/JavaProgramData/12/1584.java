package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[17];
		int num = 0;
		int i = 1;
		int j;
		int m;
		char c;
		while (true)
		{
			num = 0;
			i = 1;
			do
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				c = System.in.read();
				i++;
			}while (c != '\n');
			m = i - 2;
			if (m == 0)
			{
				break;
			}
			for (i = 1;i <= m;i++)
			{
				for (j = i + 1;j <= m;j++)
				{
					if (a[i] * 2 == a[j] || a[i] == 2 * a[j])
					{
						num++;
					}
				}
			}
			System.out.printf("%d\n",num);
		}
		return 0;
	}
}

