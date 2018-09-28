package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[256 + 16]);
		String tar = new String(new char[256 + 16]);
		String rep = new String(new char[256 + 16]);
		int a;
		int b;
		int i;
		int j;
		int k;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			tar = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			rep = tempVar3.charAt(0);
		}
		a = s.length();
		b = tar.length();
		for (i = 0;i < a - b + 1;i++)
		{
			for (j = 0;j < b;j++)
			{
				if (tar.charAt(j) != s.charAt(i + j))
				{
					break;
				}
				if (j == b - 1)
				{
					for (k = 0;k <= i - 1;k++)
					{
						System.out.printf("%c",s.charAt(k));
					}
					System.out.printf("%s",rep);
					for (k = i + b;k < a;k++)
					{
						System.out.printf("%c",s.charAt(k));
					}
					c = 1;
					break;
				}
			}
			if (c == 1)
			{
				break;
			}

		}
		if (c == 0)
		{
			System.out.printf("%s",s);
		}
	}
}

