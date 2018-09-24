package <missing>;

public class GlobalMembers
{
	//????a?
	public static long nta(long a)
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
	public static long atn(char i)
	{
		long j = i;
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
		return ((long)(j));
	}
	//???????
	public static long ten(long k)
	{
		long l;
		long m;
		l = k;
		for (long n = 0; n < 69; n++)
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
	public static long loe(long t,long v)
	{
		long u;
		long w = 0;
		u = t;
		for (long x = 0; x < 69; x++)
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
	public static long lth(String o)
	{
		long f = 0;
		for (long g = 0; g < 69 ; g++)
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
		long d;
		long e;
		String h = new String(new char[70]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(h,0,(Character.SIZE / Byte.SIZE));
		d = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		h = ConsoleInput.readToWhiteSpace(true).charAt(0);
		e = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		long p;
		p = lth(h);
		long s = 0;
		long[] ae = new long[100];
		ae[0] = 1;
		for (long af = 1; af < 20; af++)
		{
			ae[af] = ae[af - 1] * d;
		}
		for (long q = p - 1; q >= 0 ; q--)
		{
			s = s + (atn(h.charAt(q)) * ae[p - 1 - q]);
		}

		long y;
		y = (loe(s, e));
		String aa = new String(new char[70]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(aa,0,(Character.SIZE / Byte.SIZE));
		long ab = s;
		long ac = 0;
		for (long z = 0; z < y + 1; z++)
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

		for (long ad = 0; ad < y + 1; ad++)
		{
			System.out.print(aa.charAt(y - ad));
		}

		return 0;
	}
}

