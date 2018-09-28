package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String a = new String(new char[3000]);
	for (j = 0;j < n;j++)
	{

	  a = new Scanner(System.in).nextLine();
	  for (i = 0;a.charAt(i) != '\0';i++)
	  {
		if (a.charAt(i) == 'A')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, 'T');
			continue;
		}
		if (a.charAt(i) == 'T')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, 'A');
			continue;
		}
		if (a.charAt(i) == 'G')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, 'C');
			continue;
		}
		if (a.charAt(i) == 'C')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, 'G');
			continue;
		}
	  }
	  System.out.println(a);
	}
	return 0;

	}

}

