package <missing>;

public class GlobalMembers
{
	public static void inv(String str)
	{
		int l;
		int m;
		int i;
		char c;
		l = str.length();
		for (i = 0;i < l / 2;i++)
		{

			if (str[i].equals('-'))
			{
				l++;
				continue;
			}
			c = str[i];
			str[i] = (str + l - 1 - i);
			str[l - 1 - i] = c;
		}
		m = Integer.parseInt(str);
		System.out.printf("%d\n",m);
	}
	public static void Main()
	{
		int i;
		char[][] a = new char[6][9];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a + i = tempVar;
			}
		}
		for (i = 0;i < 6;i++)
		{
			inv(*(a + i));
		}
	}
}

