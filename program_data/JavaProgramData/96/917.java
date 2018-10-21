package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int s;
		int p;
		s = c.length();
		int[] a = new int[105];
		int[] b = new int[105];
		for (i = 0;i < s;i++)
		{
			a[i] = c[i] - 48;
		}
		if (s == 1)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(a[0]);
		}
		else if ((s == 2) && (10 * a[0] + a[1] < 13))
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print((10 * a[0] + a[1]));

		}
		else if ((s == 2) && (10 * a[0] + a[1] == 13))
		{
			System.out.print(1);
			System.out.print("\n");
			System.out.print(0);



		}
		else
		{
			if (10 * a[0] + a[1] > 13)
			{
				b[0] = (10 * a[0] + a[1]) / 13;

				p = (10 * a[0] + a[1]) % 13;
				for (i = 1;i < s - 1;i++)
				{
					b[i] = (p * 10 + a[i + 1]) / 13;
					p = (p * 10 + a[i + 1]) % 13;
				}

				for (i = 0;i < s - 1;i++)
				{
					System.out.print(b[i]);
				}
				System.out.print("\n");
				System.out.print(p);


			}
			else
			{
				b[0] = (100 * a[0] + 10 * a[1] + a[2]) / 13;
				p = (100 * a[0] + 10 * a[1] + a[2]) % 13;
				for (i = 1;i < s - 2;i++)
				{
					b[i] = (p * 10 + a[i + 2]) / 13;
					p = (p * 10 + a[i + 2]) % 13;
				}
				for (i = 0;i < s - 2;i++)
				{
					System.out.print(b[i]);
				}
				System.out.print("\n");
				System.out.print(p);










			}





		}


		return 0;

	}
}

