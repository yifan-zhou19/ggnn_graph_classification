package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int r = 0;
		int q = 0;
		int q1 = 0;
		String num = new String(new char[100]);

		num = ConsoleInput.readToWhiteSpace(true).charAt(0);

		if ((num.charAt(1) == '\0') || (num.charAt(2) == '\0' && (((num.charAt(0) - '0') * 10 + num.charAt(1) - '0') < 13)))
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
			q = ((num.charAt(0) - '0') * 10 + num.charAt(1) - '0') / 13;
			if (q != 0)
			{
				System.out.print(q);
				r = ((num.charAt(0) - '0') * 10 + num.charAt(1) - '0') % 13;
				for (i = 2; num.charAt(i) != '\0'; i++)
				{
					q = (r * 10 + num.charAt(i) - '0') / 13;
					System.out.print(q);
					r = (r * 10 + num.charAt(i) - '0') % 13;
				}
				System.out.print("\n");
			}
			else
			{
				r = ((num.charAt(0) - '0') * 100 + (num.charAt(1) - '0') * 10 + num.charAt(2) - '0') % 13;
				q1 = ((num.charAt(0) - '0') * 100 + (num.charAt(1) - '0') * 10 + num.charAt(2) - '0') / 13;
				System.out.print(q1);
				for (i = 3; num.charAt(i) != '\0'; i++)
				{
					q = (r * 10 + num.charAt(i) - '0') / 13;
					System.out.print(q);
					r = (r * 10 + num.charAt(i) - '0') % 13;
				}
				System.out.print("\n");
			}
		}

		r = 0;
		// ???????r
		for (i = 0; num.charAt(i) != '\0'; i++)
		{
			r = (r * 10 + num.charAt(i) - '0') % 13;
		}
		System.out.print(r);
		System.out.print("\n");

		return 0;
	}
}

