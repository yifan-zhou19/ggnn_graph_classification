package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] f = new int[30000];
		int i;
		int j;
		int k;
		int l;
		int a = 0;
		int b = 0;
		int c;
		int temp;
		int x;
		int y;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 6;i <= n;i++)
		{
			if (i % 2 == 0)
			{
				f[a++] = i;
			}
		}

		for (i = 0;i <= a;i++)
		{
			for (j = 3;j < f[i];j += 2)
			{
				x = Math.sqrt(j);

				for (k = 2;k <= x;k++)
				{
					if (j % k == 0)
					{
						break;
					}
				}
				if (k >= x + 1)
				{
					temp = f[i] - j;
					y = Math.sqrt(temp);
					for (l = 2;l <= y;l++)
					{
						if (temp % l == 0)
						{
							break;
						}
					}
					if (l >= y + 1)
					{
						System.out.printf("%d=%d+%d\n",f[i],j,temp);
						break;
					}
				}

			}
		}
	}
}

