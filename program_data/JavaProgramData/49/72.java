package <missing>;

public class GlobalMembers
{
	//????
	//2010?11?24?
	//1000012753 ???
	public static String str = new String(new char[1000]);
	public static int cycle(int a, int b)
	{
		while (b >= 0)
		{
			if (str.charAt(a) == str.charAt(a + b - 1))
			{
				a++;
				b -= 2;
			}
			else
			{
				return 1;
			}
		}
		return 0;
	}

	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = str.length();
		for (i = 2; i <= l; i++)
		{
			for (j = 0; j <= l - i; j++)
			{
				if (cycle(j, i) == 0)
				{
					for (k = j; k < j + i; k++)
					{
						System.out.print(str.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

