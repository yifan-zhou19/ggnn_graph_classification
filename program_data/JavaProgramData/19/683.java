package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		char[][] nstr = new char[101][101];
		final String n = "";
		final String k = " ";
		final String s = "";
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i;
		int t = 0;
		int m = 0;
		str = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (t = 0;;t++)
		{
			for (i = 0;;i++)
			{
			   if (str.charAt(m) != ' ' && str != '\0')
			   {
				  nstr[t][i] = str.charAt(m);
			   }
			   if (str.charAt(m) == ' ' || str.charAt(m) == '\0')
			   {
				  nstr[t][i] = '\0';
				  break;
			   }
			   m++;
			}
			if (str.charAt(m) == '\0')
			{
				break;
			}
			m++;
		}
		for (i = 0;i <= t;i++)
		{
			if (strcmp(nstr[i],a) == 0)
			{
				  n += b;
			}
			if (strcmp(nstr[i],a) != 0)
			{
				n += nstr[i];
			}
			if (i != t)
			{
				n += k;
			}
		}
		System.out.println(n);
		return 0;
	}


}
