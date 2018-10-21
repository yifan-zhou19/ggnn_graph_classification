package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		int[] a = new int[365];
		for (i = 1;i < 365;i++)
		{
			if (i % 7 == 0)
			{
				a[i] = w;
			}
			if (i % 7 == 1 && w <= 6)
			{
				a[i] = w + 1;
			}
			if (i % 7 == 1 && w == 7)
			{
				a[i] = w - 6;
			}
			if (i % 7 == 2 && w <= 5)
			{
				a[i] = w + 2;
			}
			if (i % 7 == 2 && w > 5)
			{
				a[i] = w - 5;
			}
			if (i % 7 == 3 && w <= 4)
			{
				a[i] = w + 3;
			}
			if (i % 7 == 3 && w > 4)
			{
				a[i] = w - 4;
			}
			if (i % 7 == 4 && w <= 3)
			{
				a[i] = w + 4;
			}
			if (i % 7 == 4 && w > 3)
			{
				a[i] = w - 3;
			}
			if (i % 7 == 5 && w <= 2)
			{
				a[i] = w + 5;
			}
			if (i % 7 == 5 && w > 2)
			{
				a[i] = w - 2;
			}
			if (i % 7 == 6 && w <= 1)
			{
				a[i] = w + 6;
			}
			if (i % 7 == 6 && w > 1)
			{
				a[i] = w - 1;
			}
			a[0] = w;
		}
		for (i = 0;i < 365;i++)
		{
			if (a[i] == 5 && i == 12)
			{
				System.out.print("1\n");
			}
			if (a[i] == 5 && i == 43)
			{
				System.out.print("2\n");
			}
	if (a[i] == 5 && i == 71)
	{
				System.out.print("3\n");
	}
			if (a[i] == 5 && i == 102)
			{
				System.out.print("4\n");
			}
			if (a[i] == 5 && i == 132)
			{
				System.out.print("5\n");
			}
			if (a[i] == 5 && i == 163)
			{
				System.out.print("6\n");
			}
			if (a[i] == 5 && i == 193)
			{
				System.out.print("7\n");
			}
			if (a[i] == 5 && i == 224)
			{
				System.out.print("8\n");
			}
			if (a[i] == 5 && i == 255)
			{
				System.out.print("9\n");
			}
			if (a[i] == 5 && i == 285)
			{
				System.out.print("10\n");
			}
			if (a[i] == 5 && i == 316)
			{
				System.out.print("11\n");
			}
			if (a[i] == 5 && i == 346)
			{
				System.out.print("12\n");
			}
		}
	return 0;
	}
}

