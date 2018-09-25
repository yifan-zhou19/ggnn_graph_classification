package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int i;
		int j;
		int m;
		int number1;
		int number2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		int[] a = new int[12];
		int[] b = new int[12];
		int[] c = new int[12];
		int[] d = new int[12];
		i = 1;
		a[0] = x;
		while (a[i - 1] > 1)
		{
			m = 1;
			for (j = 1;j <= i + 1;j++)
			{
				m *= 2;
			}
			m = m / 4;
			a[i] = x / m;
			i++;
		}
		number1 = i;

		for (i = 0;i <= number1 - 1;i++)
		{
			c[i] = a[number1 - 1 - i];
		}


		i = 1;
		b[0] = y;
		while (b[i - 1] > 1)
		{
			m = 1;
			for (j = 1;j <= i + 1;j++)
			{
				m *= 2;
			}
			m = m / 4;
			b[i] = y / m;
			i++;
		}
		number2 = i;

		for (i = 0;i <= number2 - 1;i++)
		{
			d[i] = b[number2 - 1 - i];
		}


		if (number1 != number2)
		{
			for (i = 1;i < 12;i++)
			{
				if (c[i] != d[i])
				{
					if (c[i] > d[i] || c[i] == d[i] + 1 || c[i] == 2 * d[i])
					{
						System.out.printf("%d",d[i - 1]);
						break;
					}
					if (d[i] > c[i] || d[i] == c[i] + 1 || d[i] == 2 * c[i])
					{
						System.out.printf("%d",c[i - 1]);
						break;
					}


				}
			}
		}
		if (number1 == number2)
		{
			  for (i = 1;i < 12;i++)
			  {
				if (c[i] != d[i])
				{
					if (c[i] > d[i] || c[i] == d[i] + 1 || c[i] == 2 * d[i])
					{
						System.out.printf("%d",d[i - 1]);
						break;
					}
					if (d[i] > c[i] || d[i] == c[i] + 1 || d[i] == 2 * c[i])
					{
						System.out.printf("%d",c[i - 1]);
						break;
					}


				}
			  }
			if (i = number1 - 1)
			{
				if (c[i] == d[i])
				{
					System.out.printf("%d",c[i - 1]);
				}

			}

		}
	}
}

