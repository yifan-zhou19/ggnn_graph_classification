package <missing>;

public class GlobalMembers
{
	public static int power(int a,int b)
	{
		int result = 1;
		int i;
		for (i = 1;i <= b;i++)
		{
			result = result * a;
		}
		return result;
	}
	public static int Main()
	{
		int count;
		int i;
		int j;
		int k;
		int max;
		int submax;
		int sum;
		String a = new String(new char[1000]);
		final String b = "0000";
		final String c = "0123456789";
		final String d = ",0";
		max = 0;
		submax = 0;
		sum = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		count = 0;
		j = 0;

		for (i = 0;i < 1000;i++)
		{

			if (a.charAt(i) != d.charAt(0) && a.charAt(i) != d.charAt(3))
			{
				b = tangible.StringFunctions.changeCharacter(b, count, a.charAt(i));
				count = count + 1;

			}
			if (a.charAt(i) == d.charAt(0) || a.charAt(i) == d.charAt(3))
			{

				for (j = 0;j <= count;j++)
				{


					if (b.charAt(j) == c.charAt(0))
					{
						sum = sum + 0 * power(10, (count - j - 1));

					}
					if (b.charAt(j) == c.charAt(1))
					{
						sum = sum + 1 * power(10, (count - j - 1));

					}
					if (b.charAt(j) == c.charAt(2))
					{
						sum = sum + 2 * power(10, count - j - 1);

					}
					if (b.charAt(j) == c.charAt(3))
					{
						sum = sum + 3 * power(10, count - j - 1);

					}
					if (b.charAt(j) == c.charAt(4))
					{
						sum = sum + 4 * power(10, count - j - 1);

					}
					if (b.charAt(j) == c.charAt(5))
					{
						sum = sum + 5 * power(10, count - j - 1);

					}
					if (b.charAt(j) == c.charAt(6))
					{
						sum = sum + 6 * power(10, count - j - 1);

					}
					if (b.charAt(j) == c.charAt(7))
					{
						sum = sum + 7 * power(10, count - j - 1);

					}
					if (b.charAt(j) == c.charAt(8))
					{
						sum = sum + 8 * power(10, count - j - 1);

					}
					if (b.charAt(j) == c.charAt(9))
					{
						sum = sum + 9 * power(10, count - j - 1);

					}
				}

				if (sum > max)
				{
					submax = max;
					max = sum;
				}
				if (sum < max && sum >= submax)
				{
					submax = sum;
				}

			for (k = 0;k < 4;k++)
			{
								 b = tangible.StringFunctions.changeCharacter(b, k, c.charAt(0));
			}

					   count = 0;
			sum = 0;

			}
							   if (a.charAt(i) == d.charAt(3))
							   {
				break;
							   }

		}
		if (submax != 0)
		{
			System.out.print(submax);
			System.out.print("\n");
		}
		else
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

