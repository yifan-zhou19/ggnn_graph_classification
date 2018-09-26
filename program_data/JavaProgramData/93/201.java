package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[4];
		int m;
		int i;
		int j;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3,b = 0,j = 1;j <= 3;j++)
		{
			a[j] = m % i;
			if (a[j] == 0)
			{
			b = b + i;
			}
			i = i + 2;
		}
		switch (b)
		{
		case 0:
			System.out.print("n");
			break;
		case 3:
			System.out.print("3");
			break;
		case 5:
			System.out.print("5");
			break;
		case 7:
			System.out.print("7");
			break;
		case 8:
			System.out.print("3 5");
			break;
		case 10:
			System.out.print("3 7");
			break;
		case 12:
			System.out.print("5 7");
			break;
		case 15:
			System.out.print("3 5 7");
			break;
		}
		return 0;
	}
}

