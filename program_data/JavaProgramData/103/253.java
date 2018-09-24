package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String c = new String(new char[1000]);
	int l;
	int k;
	c = ConsoleInput.readToWhiteSpace(true).charAt(0);
	l = c.length();
	for (int i = 0;i < l;i++)
	{
		if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
		{
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 32);
		}
	}
	for (int i = 0;i < l;i++)
	{
		k = 0;
		for (int j = i;j < l;j++)
		{
			if (c.charAt(j) == c.charAt(i))
			{
				k++;
			}
			else
			{
				break;
			}
		}
		System.out.print("(");
		System.out.print(c.charAt(i));
		System.out.print(",");
		System.out.print(k);
		System.out.print(")");
		i = i + k - 1;
	}
	System.out.print("\n");
	return 0;
	}
}

