package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String p;
		String q;
		p = a;
		q = b;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (i != len - 1)
			{
				*(q.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
			}
			else
			{
				*(q.Substring(i)) = *(p.Substring(i)) + p;
			}
		}
		for (i = 0;i < len;i++)
		{
			System.out.printf("%c",*(q.Substring(i)));
		}
		return 0;
	}

}
