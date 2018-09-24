package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String u = new String(new char[1000]);
		int n;
		int i;
		int j;
		int c;
		int b = 0;
		u = new Scanner(System.in).nextLine();
		n = u.length();

		for (i = 1;i < n - 1;i++)
		{
		c = 0;
		while (true)
		{

		if (u.charAt(i) == 32 && u.charAt(i + 1) == 32)
		{
		for (j = i;j < n - 2;j++)
		{
		u = tangible.StringFunctions.changeCharacter(u, j + 1, u.charAt(j + 2));
		}
		c++;
		}

		if ((u.charAt(i) == 32 && u.charAt(i + 1) != 32) || u.charAt(i) != 32)
		{
			  break;
		}
		}
			   b = b + c;
		}


	for (i = 0;i < n - b;i++)
	{
	System.out.printf("%c",u.charAt(i));
	}

	return 0;
	}

}

