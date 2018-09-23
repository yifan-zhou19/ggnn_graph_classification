package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void f(char * p,char * q,int m);
		String s = new String(new char[12]);
		String c = new String(new char[10]);
		String sub = new String(new char[4]);
		int i;
		int k = 0;

		while (scanf("%s %s",s,sub) != EOF)
		{
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) > s.charAt(k))
			{
				k = i;
			}
		}
		for (i = 0;i < k + 1;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.printf("%s",sub);
		f(s, c, k + 1);
		System.out.println(c);
		}
	}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'q', so pointers on this parameter are left unchanged:
	public static void f(char * p, char * q, int m)
	{
		int n;
		n = 0;
		while (n < m)
		{
			n++;
			p = p.Substring(1);
		}
		while (*p != '\0')
		{
			*q = p;
		p = p.Substring(1);
		q = q.Substring(1);
		}
		*q = '\0';
	}
}
