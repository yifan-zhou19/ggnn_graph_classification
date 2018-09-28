package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int g;
		int i;
		int j;
		int a;
		int b;
		int lena;
		int lenb;
		int output;
		char m;
		String aa = new String(new char[50]);
		String bb = new String(new char[50]);

		b = 0;
		while ((m = System.in.read()) != ' ')
		{
			bb = tangible.StringFunctions.changeCharacter(bb, b, m);
			b++;
		}
		lenb = b;

		a = 0;
		while ((m = System.in.read()) != '\n')
		{
			aa = tangible.StringFunctions.changeCharacter(aa, a, m);
			a++;
		}
		lena = a;

		for (i = lena;i >= 1;i--)
		{
			if (aa.charAt(i) == bb.charAt(0))
			{
				g = 1;
				for (j = 0;j < lenb;j++)
				{
					if (aa.charAt(i + j) != bb.charAt(j))
					{
						g = 0;
					}
					else
					{
						g = g;
					}
				}
				if (g == 1)
				{
					output = i;
				}
			}
		}

		System.out.printf("%d",output);

	}

}

