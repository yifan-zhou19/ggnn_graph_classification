package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int[] a = new int[365];
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		a[0] = w;
		for (i = 0;i < 364;i++)
		{
			if (a[i] == 7)
			{
				a[i] = 0;
			}
			a[i + 1] = a[i] + 1;
		}
		for (i = 0;i < 365;i++)
		{
			if (a[i] == 5)
			{
				if (i == 12)
				{
					System.out.print("1\n");
					c++;
				}
				if (i == 43)
				{
					System.out.print("2\n");
					c++;
				}
				if (i == 71)
				{
					System.out.print("3\n");
					c++;
				}
				if (i == 102)
				{
					System.out.print("4\n");
					c++;
				}
				if (i == 132)
				{
					System.out.print("5\n");
					c++;
				}
				if (i == 163)
				{
					System.out.print("6\n");
					c++;
				}
				if (i == 193)
				{
					System.out.print("7\n");
					c++;
				}
				if (i == 224)
				{
					System.out.print("8\n");
					c++;
				}
				if (i == 255)
				{
					System.out.print("9\n");
					c++;
				}
				if (i == 285)
				{
					System.out.print("10\n");
					c++;
				}
				if (i == 316)
				{
					System.out.print("11\n");
					c++;
				}
				if (i == 346)
				{
					System.out.print("12\n");
					c++;
				}
			}
		}
		return 0;
	}

}

