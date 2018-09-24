package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[11]);
	String b = new String(new char[4]);
	String out = new String(new char[14]);
	int i;
	int j;
	int k;
	String p;
	while (ConsoleInput.lastReadWasGood())
	{
		int temp = 0;
		int len;
		cin.get(a,11,' ');
		len = a.length();
		System.in.read();
		cin.get(b,4,'\n');
		p = a;
		for (i = 0;i <= len - 1;i++)
		{
			if (*(p.Substring(temp)) < *(p.Substring(i)))
			{
				temp = i;
			}
		}
		for (j = 0;j <= temp;j++)
		{
			out = tangible.StringFunctions.changeCharacter(out, j, a.charAt(j));
		}
		for (j = temp + 1;j <= temp + 3;j++)
		{
			out = tangible.StringFunctions.changeCharacter(out, j, b.charAt(j - temp - 1));
		}
		for (j = temp + 4;j <= 13;j++)
		{
			out = tangible.StringFunctions.changeCharacter(out, j, a.charAt(j - 3));
		}
		System.out.print(out);
		System.out.print("\n");
	}

		   return 0;

	}
}

