package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		String p;
		String q;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *u,*v;
		int u;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *v;
		int v;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (a.length() != b.length())
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		int[] le1 = new int[52];
		int[] le2 = new int[52];
		p = a;
		q = b;
		u = le1;
		v = le2;

		for (int i = 0;i < 52;i++)
		{
			*(u + i) = *(v + i) = 0;
		}
		int len1 = a.length();

		for (int i = 0;i < len1;i++)
		{
		if (*(p.Substring(i)) >= 'a')
		{
			(*(u + (*(p.Substring(i)) - 'a')))++;
		}
		else
		{
			(*(u + (*(p.Substring(i)) - 'A' + 26)))++;
		}
		}
	for (int i = 0;i < len1;i++)
	{
		if (*(q.Substring(i)) >= 'a')
		{
			(*(v + (*(q.Substring(i)) - 'a')))++;
		}
		else
		{
			(*(v + (*(q.Substring(i)) - 'A' + 26)))++;
		}
	}
	int j;
	for (j = 0;j < 52;j++)
	{
		if (*(u + j) != *(v + j))
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
	}
	System.out.print("YES");
	System.out.print("\n");
	return 0;
	}
}

