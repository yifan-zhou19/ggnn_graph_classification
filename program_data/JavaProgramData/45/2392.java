package <missing>;

public class GlobalMembers
{
	public static int cap(String s, String w, int i)
	{
		int j;
		for (j = 0;j <= s.length();j++)
		{
	//		printf("%c %c\n",s[j],w[j+i]);
			if (!s[j].equals(w[j + i]))
			{
				break;
			}
		}
		if (j == s.length() || j == s.length() + 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		String s = new String(new char[51]);
		String w = new String(new char[51]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		int i;
		int l = w.length();
		int ls = s.length();
		for (i = 0;i <= l - ls;i++)
		{
	//		printf("%d\n",cap(s,w,i));
			if (cap(s, w, i) == 1)
			{
				System.out.printf("%d",i);
				break;
			}
		}
	//	printf("%d\n",i);
		if (i > l - ls)
		{
			System.out.print("error");
		}
	}
}

