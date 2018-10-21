package <missing>;

public class GlobalMembers
{
	//*********************
	//???6            **
	//??????       **
	//???2013/10/23   **
	//*********************
	public static int Main()
	{
		int n;
		int a;
		int b;
		int num;
		int leap;
		int max1;
		int max;

		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		max = max1 = 0;

		n = 0;

		for (int i = 1; i <= num; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			leap = (a <= 140) && (a >= 90) && (b <= 90) && (b >= 60);

			if (leap != 0)
			{
				n++;

				max = n;
			}
			else
			{
				if (max1 > max)
				{
					max = max1;

					n = 0;
				}
				else
				{
					n = 0;

					max1 = max;
				}
			}
		}
		if (max > max1)
		{

			System.out.print(max);
			System.out.print("\n");
		}

		else
		{

			System.out.print(max1);
		}

		return 0;
	}
}

