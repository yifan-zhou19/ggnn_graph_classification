package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int x;
		int y;
		int[] a = new int[11];
		int[] b = new int[11];
		int i;
		int j;
		int m;
		int n;
		i = 0;
		j = 0;
		int flag;
		flag = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		do
		{
			a[i] = x;
			x = x / 2;
			i = i + 1;
		} while (x >= 1);
			do
			{
			b[j] = y;
			y = y / 2;
			j = j + 1;
			} while (y >= 1);
				for (m = 0;m < 11 && flag != 0;m++)
				{
					for (n = 0;n < 11 && flag != 0;n++)
					{
					if (a[m] == b[n])
					{
					System.out.printf("%d",a[m]);
					flag = 0;
					}
					}
				}
	}
}

