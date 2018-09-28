package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] divide = new int[100];
		int mod;
		int len;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		if (len == 1)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(a.charAt(0));
		}
		else
		{
		if (len == 2)
		{
			System.out.print((10 * (a.charAt(0) - '0') + (a.charAt(1) - '0')) / 13);
			System.out.print("\n");
			System.out.print((10 * (a.charAt(0) - '0') + (a.charAt(1) - '0')) % 13);
		}
		else
		{
			divide[0] = (10 * (a.charAt(0) - '0') + (a.charAt(1) - '0')) / 13;
			mod = (10 * (a.charAt(0) - '0') + (a.charAt(1) - '0')) % 13;
			for (int i = 1; i < len - 1; i++)
			{
				divide[i] = (10 * mod + (a.charAt(i + 1) - '0')) / 13;
				mod = (10 * mod + (a.charAt(i + 1) - '0')) % 13;
			}
			if (divide[0] != 0)
			{
				System.out.print(divide[0]);
			}
			for (int i = 1; i < len - 2; i++)
			{
				System.out.print(divide[i]);
			}
				System.out.print(divide[len - 2]);
				System.out.print("\n");
				System.out.print(mod);
				System.out.print("\n");
		}
		}
		return 0;
	}
}

