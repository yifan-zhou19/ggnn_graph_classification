package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		int[] b = new int[100];
		int[] c = new int[100];
		int i;
		int k;
		int p;
		for (i = 0;i < 100;i++)
		{
			c[i] = 11;
		}
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		k = a.length();
		for (i = 0;i < k;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 48);
			b[i] = a.charAt(i);
		}
		if ((k <= 2) && (10 * b[0] + b[1]) < 13)
		{
			System.out.print("0");
		}
		for (i = 0;i < k;i = i + 1)
		{
				c[i] = (10 * b[i] + b[i + 1]) / 13;
				b[i + 1] = (10 * b[i] + b[i + 1]) % 13;

		}
		for (p = 0;c[p] == 0;p++)
		{
			;
		}
			while ((c[p] >= 0) && (c[p] < 10))
			{
				System.out.print(c[p]);
				p++;
			}
			System.out.print("\n");
			System.out.print(b[k - 1]);
			return 0;
	}
}

