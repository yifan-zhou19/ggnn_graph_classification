package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String b = new String(new char[1001]);
	b = new Scanner(System.in).nextLine();
	int n;
	int i;
	n = 1;
	for (i = 0;b.charAt(i) != '\0';i++)
	{
	if ((b.charAt(i) >= 'a') && (b.charAt(i) <= 'z'))
	{
	b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 'A'-'a');
	}
	else
	{
	b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i));
	}
	}
	if (b.charAt(1) != b.charAt(0))
	{
	System.out.printf("(%c,%d)",b.charAt(0),n);
	}
	for (i = 1;b.charAt(i) != '\0';i++)
	{
	if (b.charAt(i) == b.charAt(i - 1))
	{
	n = n + 1;
	if ((b.charAt(i) != b.charAt(i + 1)) || (b.charAt(i + 1) == '\0'))
	{
	System.out.printf("(%c,%d)",b.charAt(i),n);
	n = 1;
	}
	}
	else
	{
		if ((b.charAt(i) != b.charAt(i + 1)) || (b.charAt(i + 1) == '\0'))
		{
		System.out.printf("(%c,%d)",b.charAt(i),n);
		}
		else
		{
		continue;
		}
	}
	}
	}
}

