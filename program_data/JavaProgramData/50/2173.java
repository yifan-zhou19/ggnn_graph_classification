package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		int day = 1;

		w = (w + 12) % 7;
		if (w == 0)
		{
			w = 7;
		}
		if (w == 5)
		{
			System.out.print("1\n");
		}

		w = (w + 31) % 7;
		if (w == 0)
		{
			w = 7;
		}
		if (w == 5)
		{
			System.out.print("2\n");
		}

		w = (w + 28) % 7;
		if (w == 0)
		{
			w = 7;
		}
		if (w == 5)
		{
			System.out.print("3\n");
		}

		w = (w + 31) % 7;
		if (w == 0)
		{
			w = 7;
		}
		if (w == 5)
		{
			System.out.print("4\n");
		}

		w = (w + 30) % 7;
		if (w == 0)
		{
			w = 7;
		}
		if (w == 5)
		{
			System.out.print("5\n");
		}

		w = (w + 31) % 7;
		if (w == 0)
		{
			w = 7;
		}
		if (w == 5)
		{
			System.out.print("6\n");
		}

		w = (w + 30) % 7;
		if (w == 0)
		{
			w = 7;
		}
		if (w == 5)
		{
			System.out.print("7\n");
		}

		w = (w + 31) % 7;
		if (w == 0)
		{
			w = 7;
		}
		if (w == 5)
		{
			System.out.print("8\n");
		}

		w = (w + 31) % 7;
		if (w == 0)
		{
			w = 7;
		}
		if (w == 5)
		{
			System.out.print("9\n");
		}

		w = (w + 30) % 7;
		if (w == 0)
		{
			w = 7;
		}
		if (w == 5)
		{
			System.out.print("10\n");
		}

		w = (w + 31) % 7;
		if (w == 0)
		{
			w = 7;
		}
		if (w == 5)
		{
			System.out.print("11\n");
		}

		w = (w + 30) % 7;
		if (w == 0)
		{
			w = 7;
		}
		if (w == 5)
		{
			System.out.print("12\n");
		}
	}

}

