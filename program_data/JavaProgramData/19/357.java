package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s;
		String a;
		String b;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc((Character.SIZE / Byte.SIZE) * 1000);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc((Character.SIZE / Byte.SIZE) * 1000);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc((Character.SIZE / Byte.SIZE) * 1000);
		final String ans = "";
		int i;
		int j;
		int k;
		int p;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int l;
		int la;
		int lb;
		l = s.length();
		la = a.length();
		lb = b.length();
		int index;
		index = 0;
		for (i = 0;i < l;i++)
		{
			k = 0;
			for (j = 0;j < la;j++)
			{
				if (s.charAt(i + j) != a.charAt(j))
				{
					k = 1;
				}
			}
			if (((i + la) < l) && (s.charAt(i + la) != ' '))
			{
				k = 1;
			}
			if ((i > 0) && (s.charAt(i - 1) != ' '))
			{
				k = 1;
			}
			if (k == 0)
			{
				for (p = 0;p < lb;p++)
				{
					ans = tangible.StringFunctions.changeCharacter(ans, p + index, b.charAt(p));
				}
				index = index + lb - 1;
				i = i + la - 1;
			}
			if (k > 0)
			{
				ans = tangible.StringFunctions.changeCharacter(ans, index, s.charAt(i));
			}
			index++;
		}
		System.out.printf("%s\n",ans);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(b);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(s);
		return 0;
	}
}

