package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[101]);
		String t = new String(new char[101]);
		String p1;
		String p2;
		int i;
		int len;

		s = new Scanner(System.in).nextLine();
		len = s.length();
		p1 = s;
		p2 = t;
		for (i = 0;i < len - 1;i++)
		{
			*(p2.Substring(i)) = *(p1.Substring(i)) + *(p1.Substring(1) + i);
		}
		*(p2.Substring(i)) = *(p1.Substring(i)) + p1;

		for (i = 0;i < len;i++)
		{
		   System.out.printf("%c",*(p2.Substring(i)));
		}

	}


}
