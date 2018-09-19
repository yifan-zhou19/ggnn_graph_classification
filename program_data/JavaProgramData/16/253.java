package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i = 0;
		String c = new String(new char[100]);

		String d = new String(new char[100]);
		String e = new String(new char[100]);
		c = new Scanner(System.in).nextLine();
		n = m = c.length();
		do
		{
			d = tangible.StringFunctions.changeCharacter(d, i, c.charAt(m - 1));
			m = m - 1;
			i++;
		}while (m >= 1);
		d = tangible.StringFunctions.changeCharacter(d, n, 32);
		sscanf(d,"%[^ ]",e);
		System.out.println(e);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		return 0;
	}

}

