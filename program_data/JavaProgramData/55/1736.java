package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int n;
		int b;
		int[] c = new int[60];
		int[] d = new int[60];
		int i = 0;
		int j = 0;
		int x;
		int y;
		int z;
		int sum1 = 0;
		int sum2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}

		while ((n = System.in.read()) != ' ') //*??n*//
		{
			i++;
			c[i] = n;
		}
		x = i;

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}

		for (i = 1;i <= x;i++) //* n??????????? *//
		{
			for (y = 'A';y <= 'Z';y++)
			{
				if (c[i] == y)
				{
					c[i] = c[i] - 7;
					break;
				}
			}
			for (y = 'a';y <= 'z';y++)
			{
				if (c[i] == y)
				{
					c[i] = c[i] - 39;
				}
			}

		}
		for (i = 1;i <= x;i++)
		{
			c[i] = c[i] - 48;
		}

		for (i = 1;i <= x;i++) //* a??n???10?? *//
		{
			sum1 = sum1 + c[i] * Math.pow(a,x - i);
		}

		if (sum1 == 0)
		{
		System.out.print("0");
		}

		while (sum1 != 0) //* 10??n???b??*//
		{
			j++;
			d[j] = sum1 % b;
			sum1 = sum1 / b;
		}

		z = j;
		for (j = z;j >= 1;j--) //*?????????*//
		{
			if (d[j] >= 10)
			{
				System.out.printf("%c",d[j] + 55);
			}
			else
			{
				System.out.printf("%d",d[j]);
			}
		}
		System.out.print("\n");
	}


}

