package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] s = new char[2][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s[0] = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[1] = tempVar2.charAt(0);
		}
		void jg(char x[]);
		jg(s[0]);
		jg(s[1]);
		if (strcmp(s[0],s[1]))
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print("YES");
		}
		return 0;
	}
	public static void jg(String x)
	{
		int i;
		int j;
		int l = x.length();
		char t;
		for (i = 0;i < l - 1;i++)
		{
			for (j = i + 1;j < l;j++)
			{
				if (x[i].compareTo(x[j]) > 0)
				{
				t = x[i];
				x[i] = x[j];
				x[j] = t;
				}
			}
		}
	}


}

