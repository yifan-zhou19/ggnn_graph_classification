package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void str(char a[100]);
		int n;
		int i;
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			str(b);
			System.out.printf("%s\n",b);
		}
	}
	public static void str(String a)
	{
		int k;
		int t;
		k = a.length();
		if (a[k - 2].equals('e') && a[k - 1].equals('r'))
		{
		a[k - 2] = '\0';
		}
		else if (a[k - 2].equals('l') && a[k - 1].equals('y'))
		{
		a[k - 2] = '\0';
		}
		else if (a[k - 2].equals('n') && a[k - 1].equals('g') && a[k - 3].equals('i'))
		{
		a[k - 3] = '\0';
		}
	}
}

