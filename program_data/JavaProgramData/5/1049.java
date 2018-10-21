package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int a;
		int b;

		double n = 0;
		double r;

		String x = new String(new char[500]);
		String y = new String(new char[500]);
		char z;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			z = tempVar2.charAt(0);
		}

		x = new Scanner(System.in).nextLine();

		a = x.length();

		y = new Scanner(System.in).nextLine();

		b = y.length();

		if (a != b)
		{

			System.out.print("error");

		}

		else
		{

			for (i = 0;i < a;i++)
			{

				if ((x.charAt(i) != 'A' && x.charAt(i) != 'T' && x.charAt(i) != 'C' && x.charAt(i) != 'G') || (y.charAt(i) != 'A' && y.charAt(i) != 'T' && y.charAt(i) != 'C' && y.charAt(i) != 'G'))
				{

					System.out.print("error");

					n = -1;
					break;


				}

				else
				{

					if (x.charAt(i) == y.charAt(i))
					{

						n++;

					}

				}

			}
	n = n / a;

		if (n > r)
		{

			System.out.print("yes");

		}

		else if (n >= 0)
		{

			System.out.print("no");

		}
		}



		return 0;

	}
}

