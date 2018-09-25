package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int c;
		int t1;
		int t2;
		a = new Scanner(System.in).nextLine(); //:?????
		b = new Scanner(System.in).nextLine();
		t1 = a.length(); //:????
		t2 = b.length();
		for (int i = 0;i < t1;i++)
		{
			c = a.charAt(i);
			if (c >= 65 && c <= 90) //:???????????????????????
			{
				c = c + 32;
			a = tangible.StringFunctions.changeCharacter(a, i, c);
			}
		}
		for (int j = 0;j < t2;j++)
		{
			c = b.charAt(j);
			if (c >= 65 && c <= 90)
			{
				c = c + 32;
			b = tangible.StringFunctions.changeCharacter(b, j, c);
			}
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
			System.out.print("\n");
		}
		else if (strcmp(a,b) == 0)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		else if (strcmp(a,b) < 0)
		{
			System.out.print("<");
			System.out.print("\n");
		}
		return 0;
	}


}

