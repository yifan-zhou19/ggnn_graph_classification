package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void change(char x[1000],int l);
		String c = new String(new char[1000]);
		int i = 0;
		int j;
		int k = 1;
		do
		{
			c = tangible.StringFunctions.changeCharacter(c, i, System.in.read());
			i++;
		}while (c.charAt(i - 1) > 30);
		change(c, i);
		for (j = 0;j < i - 1;j++)
		{
			if (c.charAt(j) == c.charAt(j + 1))
			{
					k++;
			}
			else
			{
				System.out.printf("(%c,%d)",c.charAt(j),k);
				k = 1;
			}
		}
		return 0;
	}
	public static void change(String x, int l)
	{
		int n;
		for (n = 0;n < l;n++)
		{
			if (x[n].compareTo(121) < 0 & x[n].compareTo(96) > 0)
			{
				x[n] = x[n] - 32;
			}
		}
	}
}

