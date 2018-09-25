package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[101]);
	public static int n = 0;
	public static void f(int m,char a,char b)
	{
		if (m == 0)
		{
			return;
		}
		int i = 0;
		int j = 0;
		for (;i < n;i++)
		{
			if (str.charAt(i) == b)
			{
				break;
			}
		}
		for (j = i;j >= 0;j--)
		{
			if (str.charAt(j) == a)
			{
				System.out.printf("%d %d\n",j,i);
				str = tangible.StringFunctions.changeCharacter(str, i, '*');
				str = tangible.StringFunctions.changeCharacter(str, j, '*');
				break;
			}
			else
			{
				continue;
			}
		}
		return f(m - 1,a,b);
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		n = str.length();
		f(n / 2, str.charAt(0), str.charAt(n - 1));
		return 0;
	}
}

