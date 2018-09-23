package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1010]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l;
		int m = 1;
		int A = 0;
		l = a.length();
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char c;
	//		int d;
	//	}
	//	b[27];
		for (int i = 0;i < l;i++)
		{
			if (a.charAt(i) >= 97)
			{
				a.charAt(i) -= 32;
			}
		}
		b[1].c = a.charAt(0),b[1].d = 1;
		for (int i = 1;i < l;i++)
		{
			if (a.charAt(i) == a.charAt(i - 1))
			{
				b[m].d++;
			}
			else
			{
				b[++m].c = a.charAt(i);
				b[m].d = 1;
			}
		}
		for (int i = 1;i <= m;i++)
		{
			System.out.print("(");
			System.out.print(b[i].c);
			System.out.print(",");
			System.out.print(b[i].d);
			System.out.print(")");
		}
		return 0;
	}
}

