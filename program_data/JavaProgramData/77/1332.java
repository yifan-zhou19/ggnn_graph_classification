package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static char b;
	public static char g;
	public static int[] x = new int[100];
	public static int[] y = new int[100];
	public static int l;

	public static void couple(int n)
	{
		if (n == 0)
		{
			return;
		}
		else
		{
			for (int i = 0; i < l - 1; i++)
			{
				int j = i + 1;
				if (a.charAt(i) == b)
				{
					while (a.charAt(j) == '0')
					{
						j++;
					}
					if (a.charAt(j) == g)
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
						a = tangible.StringFunctions.changeCharacter(a, i, a[j] = '0');
						return couple(n - 2);
					}
				}
			}

		}
	}

	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = a.length();
		b = a.charAt(0);
		for (int i = 1; i < l; i++)
		{
			if (a.charAt(i) != b)
			{
				g = a.charAt(i);
				break;
			}
		}
		couple(l);
		return 0;
	}

}

