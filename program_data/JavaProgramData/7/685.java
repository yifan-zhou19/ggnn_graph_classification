package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[102]);
		String a = new String(new char[102]);
		String b = new String(new char[102]);
		String p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		String p3;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		p1 = s;
		p2 = a;
		p3 = b;
		int i;
		int j;
		int k = 0;
		int len;
		int m;
		int len2;
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (*p2 == p1.charAt(i))
			{
				j = i;
				m = i;
				for (; * p2 != '\0';p2++,j++)
				{
					if (*p2 == p1.charAt(j))
					{
					   k++;
					}
					else
					{
						break;
					}
				}
			}
		}
		len2 = a.length();
		if (k != len2)
		{
			System.out.printf("%s",s);
		}
		if (k == len2)
		{
			for (i = 0;i < m;i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
			System.out.printf("%s",b);
			for (i = i + k;i < len;i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
		return 0;
	}

}
