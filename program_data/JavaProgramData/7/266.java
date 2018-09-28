package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int func = char c;
		int i;
		int j;
		int a;
		int m;
		int num;
		String s1 = new String(new char[300]);
		String s2 = new String(new char[300]);
		String s3 = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s3 = tempVar3.charAt(0);
		}
		m = s1.length();
		a = s2.length();
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < a;j++)
			{
				if (s2.charAt(j) != s1.charAt(i + j))
				{
				break;
				}
			}
			if (j == a)
			{
				for (j = 0;j < a;j++)
				{
					s1 = s1.substring(0, i + j);
				}
					   break;
			}

		}
		if (j != a)
		{
				System.out.printf("%s\n",s1);
				return 0;
		}
		for (i = 0;i < m;i++)
		{
			if (s1.charAt(i) != 0)
			{
				System.out.printf("%c",s1.charAt(i));
			}
			if (s1.charAt(i) == 0)
			{
				num = i;
				System.out.printf("%s",s3);
				break;
			}
		}
		for (j = num + a;func(s1.charAt(j)) != 0;j++)
		{
			System.out.printf("%c",s1.charAt(j));
		}
		System.out.print("\n");
			return 0;
	}
	public static int func(char c)
	{
		if (c == '\0')
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}

