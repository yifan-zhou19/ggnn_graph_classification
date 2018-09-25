public class Pa
{
	public String num = new String(new char[20]);
	public int year;
}

package <missing>;

public class GlobalMembers
{
	public static Pa[] pa = tangible.Arrays.initializeWithDefaultPaInstances(100);
	public static void Main()
	{
		int i;
		int j;
		int x = 0;
		int d = 0;
		int m;
		int n;
		int[] b = new int[100];


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
				pa[i].num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pa[i].year = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			b[i] = pa[i].year;
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (b[j] < b[j + 1])
				{
					d = b[j];
					b[j] = b[j + 1];
					b[j + 1] = d;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 60)
			{
			if (i == 0)
			{
				for (j = 0;j < n;j++)
				{
					if (pa[j].year == b[i])
					{
						System.out.printf("%s\n",pa[j].num);
					}
				}
			}
			else
			{
			if (b[i] != b[i - 1])
			{
				for (j = 0;j < n;j++)
				{
				if (pa[j].year == b[i])
				{
						System.out.printf("%s\n",pa[j].num);
				}
				}
			}
			}
			}
			if (b[i] < 60)
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
		if (pa[i].year < 60)
		{
			System.out.printf("%s\n",pa[i].num);
		}
		}

	}


}

