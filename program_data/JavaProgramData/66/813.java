package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;

		int a;
		int y;
		int[] c = new int[13];
		String tempVar = ConsoleInput.scanfRead(null, 16);
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a = Integer.parseInt(tempVar3);
		}



		c[1] = 0;
		c[2] = 31;
		if ((x % 4 == 0) && (x % 100 != 0) || (x % 400 == 0))
		{
			c[3] = 60;
		}
		else
		{
			c[3] = 59;
		}
		c[4] = c[3] + 31;
		c[5] = c[4] + 30;
		c[6] = c[5] + 31;
		c[7] = c[6] + 30;
		c[8] = c[7] + 31;
		c[9] = c[8] + 31;
		c[10] = c[9] + 30;
		c[11] = c[10] + 31;
		c[12] = c[11] + 30;
		if ((x % 4 == 0) && (x % 100 != 0) || (x % 400 == 0))
		{
			x = (x - 1) + (x / 4 - 1 - x / 100 + x / 400) + c[y] + a;
		}
		else
		{
			x = (x - 1) + (x / 4 - x / 100 + x / 400) + c[y] + a;
		}

		switch (x % 7)
		{
		case 1:
			System.out.print("Mon.\n");
			break;
		case 2:
			System.out.print("Tue.\n");
			break;
		case 3:
			System.out.print("Wed.\n");
			break;
		case 4:
			System.out.print("Thu.\n");
			break;
		case 5:
			System.out.print("Fri.\n");
			break;
		case 6:
			System.out.print("Sat.\n");
			break;
		case 0:
			System.out.print("Sun.\n");
			break;
		}
		return 0;

	}

}

