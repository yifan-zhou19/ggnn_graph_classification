package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] xq = new int[365];
		int i;
		int w;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 365;i++)
		{
			xq[i] = (w + i) % 7;
			if (xq[i] == 0)
			{
				xq[i] = 7;
			}
		}
		if (xq[12] == 5)
		{
			if (f != 0)
			{
				System.out.print("\n");
			}
			System.out.print("1");
			f++;
		}
		if (xq[43] == 5)
		{
			if (f != 0)
			{
				System.out.print("\n");
			}
			f++;
			System.out.print("2");
		}
		if (xq[71] == 5)
		{
			if (f != 0)
			{
				System.out.print("\n");
			}
			f++;
			System.out.print("3");
		}
		if (xq[102] == 5)
		{
			if (f != 0)
			{
				System.out.print("\n");
			}
			f++;
			System.out.print("4");
		}
		if (xq[132] == 5)
		{
			if (f != 0)
			{
				System.out.print("\n");
			}
			f++;
			System.out.print("5");
		}
		if (xq[163] == 5)
		{
			if (f != 0)
			{
				System.out.print("\n");
			}
			f++;
			System.out.print("6");
		}
		if (xq[193] == 5)
		{
			if (f != 0)
			{
				System.out.print("\n");
			}
			f++;
			System.out.print("7");
		}
		if (xq[224] == 5)
		{
			if (f != 0)
			{
				System.out.print("\n");
			}
			f++;
			System.out.print("8");
		}
		if (xq[255] == 5)
		{
			if (f != 0)
			{
				System.out.print("\n");
			}
			f++;
			System.out.print("9");

		}
		if (xq[285] == 5)
		{
			if (f != 0)
			{
				System.out.print("\n");
			}
			f++;
			System.out.print("10");
		}
		if (xq[316] == 5)
		{
			if (f != 0)
			{
				System.out.print("\n");
			}
			f++;
			System.out.print("11");
		}
		if (xq[346] == 5)
		{
			if (f != 0)
			{
				System.out.print("\n");
			}
			f++;
			System.out.print("12");
		}
	}






}

