package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char c;
	//		int x;
	//	}
	//	l[26],s[26];
		int i;
		int j;
		for (i = 0,j = 65;i < 26;i++,j++)
		{
			l[i].c = j;
			s[i].c = j + 32;
			l[i].x = 0;
			s[i].x = 0;
		}
		String str = new String(new char[300]);
		str = new Scanner(System.in).nextLine();
		int n;
		n = str.length();
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (str.charAt(i) == l[j].c)
				{
					l[j].x++;
					continue;
				}
				if (str.charAt(i) == s[j].c)
				{
					s[j].x++;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (l[i].x > 0)
			{
				System.out.printf("%c=%d\n",l[i].c,l[i].x);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (s[i].x > 0)
			{
				System.out.printf("%c=%d\n",s[i].c,s[i].x);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (l[i].x == 0 && s[i].x == 0)
			{
				continue;
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
			}
		}
		System.out.print("No");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	if (true)
	{
		;
	}
	}

}
