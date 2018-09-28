package <missing>;

public class GlobalMembers
{
	//????a?
	public static int nta(int a)
	{
		if (a >= 10)
		{
		char b;
		b = (char)('A' - 10 + a);
		return ((char)(b));
		}
		else
		{
		char b;
		b = (char)('1' - 1 + a);
		return ((char)(b));
		}
	}
	//a????
	public static int atn(char i)
	{
		int j = i;
		if (j > 96)
		{
			j = j - 'a' + 10;
		}
		else
		{
			if ((j > 33) && (j < 58))
			{
			j = j - '1' + 1;
			}
		else
		{
			j = j - 'A' + 10;
		}
		}
		return ((int)(j));
	}
	//???????
	public static int ten(int k)
	{
		int l;
		int m;
		l = k;
		for (int n = 0; n < 69; n++)
		{
			l = l / 10;
			if (l > 0)
			{
				m = n + 1;
			}
		}
		return (m);
	}
	//??e??
	public static int loe(int t,int v)
	{
		int u;
		int w = 0;
		u = t;
		for (int x = 0; x < 69; x++)
		{
			u = u / v;
			if (u > 0)
			{
				w = x + 1;
			}
		}
		return (w);
	}
	//??????
	public static int lth(String o)
	{
		int f = 0;
		for (int g = 0; g < 69 ; g++)
		{
			if ((!o[g].equals(0)) && (!o[g].equals(32)))
			{
				f = f + 1;
			}
		}
		return ((f));
	}
	public static int Main()
	{
		int d;
		int e;
		String h = new String(new char[70]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(h,0,(Character.SIZE / Byte.SIZE));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		h = ConsoleInput.readToWhiteSpace(true).charAt(0);
		e = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int p;
		p = lth(h);
		int s = 0;
		for (int q = 0; q < p; q++)
		{
			s = s * d + (atn(h.charAt(q)));
		}
		int y;
		y = (loe(s, e));
		String aa = new String(new char[70]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(aa,0,(Character.SIZE / Byte.SIZE));
		int ab = s;
		int ac = 0;
		for (int z = 0; z < y + 1; z++)
		{
			ac = ab;
			ab = ab / e;
			if (ab > 0)
			{
				aa = tangible.StringFunctions.changeCharacter(aa, z, nta(ac % e));
			}
			else
			{
				aa = tangible.StringFunctions.changeCharacter(aa, z, nta(ac));
			}

		}
		if (aa.charAt(y) != 0)
		{
		for (int ad = 0; ad < y + 1; ad++)
		{
			System.out.print(aa.charAt(y - ad));
		}
		}
		else
		{
			System.out.print("0");
		}
		return 0;
	}
}

