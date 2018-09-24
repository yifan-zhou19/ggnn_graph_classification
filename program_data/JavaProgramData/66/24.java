package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int y;
		int m;
		int d;
		int total;
		int i;
		int[] md = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		total = 0;
		if (y > 400)
		{
			y = 400 + (y - 400) % 400;
		}
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			md[1] = (29);
		}
		for (i = 1;i < m;i++)
		{
			total += (md[i - 1] % 7);
		}
		total = total + (d % 7);
		int n;
		int j;
		n = total;
		for (j = 1;j < y;j++)
		{
			   if ((j % 4 == 0 && j % 100 != 0) || (j % 400 == 0))
			   {
				n = n + (366 % 7);
			   }
			else
			{
				n = n + (365 % 7);
			}
		}
		switch (n % 7)
		{
		case 0 :
		{
			System.out.print("Sun.\n");
			break;
		}
		case 1 :
		{
			System.out.print("Mon.\n");
			break;
		}
		case 2 :
		{
			System.out.print("Tue.\n");
			break;
		}
		case 3 :
		{
			System.out.print("Wed.\n");
			break;
		}
		case 4 :
		{
			System.out.print("Thu.\n");
			break;
		}
		case 5 :
		{
			System.out.print("Fri.\n");
			break;
		}
		case 6 :
		{
			System.out.print("Sat.\n");
			break;
		}
		}
	}

}

