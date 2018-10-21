package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[501]);
	int i;
	int j;
	int n;
	int l;
	int f;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	l = s.length();
	for (n = 2;n <= l;n++)
	{
		for (i = 0;i <= l - n + 1;i++)
		{
		f = 0;
		for (j = i;j <= (2 * i - 1 + n) / 2;j++)
		{
			if (s.charAt(j) != s.charAt(2 * i - 1 + n - j))
			{
				f = 1;
				break;
			}
		}
	if (f == 1)
	{
		continue;
	}
	else
	{
		for (j = i;j <= i - 1 + n;j++)
		{
			System.out.printf("%c",s.charAt(j));
		}
		System.out.print("\n");
	}
		}
	}
	}

}

