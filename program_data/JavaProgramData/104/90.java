package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		int x;
		int y;
		int i;
		int j;
		int num1;
		int num2;
		int[] xline = new int[11];
		int[] yline = new int[11];


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

		xline[0] = x;
		yline[0] = y;

		i = 1;
		while (x > 1)
		{
			x = x / 2;
			xline[i] = x;
			i = i + 1;
		}
		num1 = i - 1;

		i = 1;
		while (y > 1)
		{
			y = y / 2;
			yline[i] = y;
			i = i + 1;
		}
		num2 = i - 1;

		for (i = 0;i <= num1;i++)
		{
			for (j = 0;j <= num2;j++)
			{
				if (xline[i] == yline[j])
				{
					System.out.printf("%d\n", xline[i]);
					i = num1 + 1;
				}
			}
		}
	}


}

