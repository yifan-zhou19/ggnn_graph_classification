package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ghus = char a[];
		void noghus(char a[]);
		int n;
		int i;
		int t;
		int j;
		String b = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			t = ghus(b);
			System.out.printf("%s\n",b);
			for (j = 1;j <= t;j++)
			{
				noghus(b);
			}
			for (j = 0;j < b.length();j++)
			{
				if (b.charAt(j) == '(')
				{
					System.out.print("$");
				}
				else if (b.charAt(j) == ')')
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

	}


	public static int min(int a,int b)
	{
		if (a < b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}

	public static int ghus(String a)
	{
		int min = new int(int a,int b);
		int m = 0;
		int n = 0;
		int i;
		for (i = 0;i < a.length();i++)
		{
			if (a[i].equals('('))
			{
				m++;
			}
			if (a[i].equals(')'))
			{
				n++;
			}
		}
		return min(m, n);
	}

	public static void noghus(String a)
	{
		int i;
		int j;
		for (i = 0;i < a.length() - 1;i++)
		{
				if (a[i].equals('('))
				{
					for (j = i + 1;j < a.length();j++)
					{
						if (a[j].equals(')') || a[j].equals('('))
						{
							break;
						}
					}
					if (a[j].equals(')'))
					{
						a[i] = 'o';
						a[j] = 'o';
					}
				}
		}
	}

}

