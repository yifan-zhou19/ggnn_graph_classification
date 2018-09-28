package <missing>;

public class GlobalMembers
{
	public static int legal(String d)
	{
		int i;
		if (d[0].compareTo('0') >= 0 && d[0].compareTo('9') <= 0)
		{
			return 0;
		}
		for (i = 0;d[i] != null;i++)
		{
			if (!(d[i].equals(' ') || d[i].compareTo('A') >= 0 && d[i].compareTo('Z') <= 0 || d[i].compareTo('a') >= 0 && d[i].compareTo('z') <= 0 || d[i].compareTo('0') >= 0 && d[i].compareTo('9') <= 0 || d[i].equals('_')))
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		int i;
		int t;
		int n;
		char[][] s = new char[100][20];
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
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			t = legal(s[i]);

			if (t == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
			return 0;
	}


}

