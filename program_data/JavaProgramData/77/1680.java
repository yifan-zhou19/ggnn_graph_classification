package <missing>;

public class GlobalMembers
{
	public static void couple(String a, int[] b, char x, char y)
	{
		int i;
		int j;
		int z = 0;
		for (i = 0; !a[i].equals('\0');i++)
		{
			if (b[i] == 0)
			{
				z = 1;
				break;
			}
		}
		if (z == 1)
		{
			for (i = 0; !a[i].equals('\0');i++)
			{
				if (a[i].equals(y) && b[i] == 0)
				{
					for (j = 0;j < i;j++)
					{
						if (a[i - 1 - j].equals(x) && b[i - 1 - j] == 0)
						{
							System.out.print(i - 1 - j);
							System.out.print(" ");
							System.out.print(i);
							System.out.print("\n");
							b[i] = b[i - 1 - j] = 1;
							couple(a, b, x, y);
						}
					}
				}
			}
		}
	}
	public static int Main()
	{
		int i;
		int[] b = new int[101];
		String a = new String(new char[101]);
		char x;
		char y;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		x = a.charAt(0);
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			b[i] = 0;
			if (a.charAt(i) != x)
			{
				y = a.charAt(i);
			}
		}
		couple(a, b, x, y);
		return 0;
	}
}

