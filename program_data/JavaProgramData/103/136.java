package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[1001]);
	String k = new String(new char[2]);
	k = tangible.StringFunctions.changeCharacter(k, 1, '\0');
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	int i;
	for (i = 0;a.charAt(i) != '\0';i++)
	{
	if ((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z'))
	{
	a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 'A'-'a');
	}
	else
	{
	continue;
	}
	}
	i = 0;
	int j = 1;
	while (a.charAt(i) != '\0')
	{


	if (a.charAt(i) == a.charAt(i + 1))
	{
	j++;
	i++;
	}


	else
	{

	k = tangible.StringFunctions.changeCharacter(k, 0, a.charAt(i));
	System.out.printf("(%s,%d)",k,j);

	i++;
	j = 1;
	}

	}
	}


}

