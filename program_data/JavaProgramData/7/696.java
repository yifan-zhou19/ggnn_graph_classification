package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[100]);
	public static String a = new String(new char[100]);
	public static String b = new String(new char[100]);
	public static String c = new String(new char[100]);
	public static String d = new String(new char[100]);
	public static int Main()
	{
		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int i;
		int p;
		int ch = 0;
		int k;
		for (k = 0;s.charAt(k) != '\0';k++)
		{
			i = 0;
			for (p = k;a.charAt(p - k) != '\0';p++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, s.charAt(p));
				i++;
			}
			if (strcmp(a,c) == 0)
			{
					ch = 1;
					break;


			}
		}
		if (ch == 0)
		{
			System.out.printf("%s",s);
		}
		else
		{
			int A;

				for (A = 0;A < k;A++)
				{
					d = tangible.StringFunctions.changeCharacter(d, A, s.charAt(A));
				}
					d += b;
				for (A = k + a.length();s.charAt(A) != '\0';A++)
				{
					d = tangible.StringFunctions.changeCharacter(d, A - a.length() + b.length(), s.charAt(A));
				}

		//	printf("%s\n",a);
		//	printf("%s\n",b);
		//	printf("%s\n",c);
			System.out.printf("%s\n",d);
		}

		return 0;
	}


}

