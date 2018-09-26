package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void f(char * p,int n);
		int i;
		int j;
		int l;
		String a = new String(new char[1000]);
		String p;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		p = a;
		for (i = 2;i < l + 1;i++)
		{
			for (j = 0;j < l - i + 1;j++)
			{
				f(p.Substring(j), i);
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
	}

	public static void f(tangible.RefObject<String> p, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			if (*(p.argValue.Substring(i)) != *(p.argValue.Substring(n) - 1 - i))
			{
				i = 10000;
			}
		}
		if (i == n)
		{
			for (i = 0;i < n;i++)
			{
				System.out.printf("%c",*(p.argValue.Substring(i)));
			}
			System.out.print("\n");
		}
	}
}

