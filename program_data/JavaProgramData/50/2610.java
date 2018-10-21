package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int k;
		int l;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		switch (w)
		{
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
				k = w - 1;
				break;
			case 1:
				k = 7;
				break;
			default:
				break;
		}


		l = 13 % 7 + k;
		if (l > 7)
		{
			l = l - 7;
		}
		if (l == 5)
		{
			System.out.print('1');
			System.out.print("\n");
		}

		l = 44 % 7 + k;
		if (l > 7)
		{
			l = l - 7;
		}
		if (l == 5)
		{
			System.out.print('2');
			System.out.print("\n");
		}

		l = 72 % 7 + k;
		if (l > 7)
		{
			l = l - 7;
		}
		if (l == 5)
		{
			System.out.print('3');
			System.out.print("\n");
		}

		l = 103 % 7 + k;
		if (l > 7)
		{
			l = l - 7;
		}
		if (l == 5)
		{
			System.out.print('4');
			System.out.print("\n");
		}

		l = 133 % 7 + k;
		if (l > 7)
		{
			l = l - 7;
		}
		if (l == 5)
		{
			System.out.print('5');
			System.out.print("\n");
		}

		l = 164 % 7 + k;
		if (l > 7)
		{
			l = l - 7;
		}
		if (l == 5)
		{
			System.out.print('6');
			System.out.print("\n");
		}

		l = 194 % 7 + k;
		if (l > 7)
		{
			l = l - 7;
		}
		if (l == 5)
		{
			System.out.print('7');
			System.out.print("\n");
		}

		l = 225 % 7 + k;
		if (l > 7)
		{
			l = l - 7;
		}
		if (l == 5)
		{
			System.out.print('8');
			System.out.print("\n");
		}

		l = 256 % 7 + k;
		if (l > 7)
		{
			l = l - 7;
		}
		if (l == 5)
		{
			System.out.print('9');
			System.out.print("\n");
		}

		l = 286 % 7 + k;
		if (l > 7)
		{
			l = l - 7;
		}
		if (l == 5)
		{
			System.out.print("10");
			System.out.print("\n");
		}

		l = 317 % 7 + k;
		if (l > 7)
		{
			l = l - 7;
		}
		if (l == 5)
		{
			System.out.print("11");
			System.out.print("\n");
		}

		l = 347 % 7 + k;
		if (l > 7)
		{
			l = l - 7;
		}
		if (l == 5)
		{
			System.out.print("12");
			System.out.print("\n");
		}

		return 0;
	}
}

