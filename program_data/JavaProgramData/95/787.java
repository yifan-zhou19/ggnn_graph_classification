package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String stq = new String(new char[81]);
	String str = new String(new char[81]);
	int i;
	int j;
	int k;
	stq = new Scanner(System.in).nextLine();
	str = new Scanner(System.in).nextLine();
	for (i = 0;stq.charAt(i) != '\0';i++)
	{
		if ((int)stq.charAt(i) < 96)
		{
	stq = tangible.StringFunctions.changeCharacter(stq, i, stq.charAt(i) + 32);
		}
	}

	for (k = 0;str.charAt(k) != '\0';k++)
	{
		if ((int)str.charAt(k) < 96)
		{
	str = tangible.StringFunctions.changeCharacter(str, k, str.charAt(k) + 32);
		}
	}

	if (strcmp(stq,str) > 0)
	{
	System.out.print(">");
	}
	else
	{
	if (strcmp(stq,str) == 0)
	{
	System.out.print("=");
	}
	else
	{
	if (strcmp(stq,str) < 0)
	{
	System.out.print("<");
	}
	}
	}
	}
}

