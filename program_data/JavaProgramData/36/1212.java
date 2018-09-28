package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[1000]);
	String b = new String(new char[1000]);
	char c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	int n;
	int i;
	int j;
	n = 0;
	for (i = 0;a.charAt(i) != '\0';i++)
	{
	n++;
	}
	for (j = 0;j < n;j++)
	{
	  for (i = 0;i < n - 1 - j;i++)
	  {
		if (a.charAt(i) > a.charAt(i + 1))
		{
			c = a.charAt(i);
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + 1));
			a = tangible.StringFunctions.changeCharacter(a, i + 1, c);
		}
	  }

	}
	n = 0;
	for (i = 0;b.charAt(i) != '\0';i++)
	{
	n++;
	}
	for (j = 0;j < n;j++)
	{
	  for (i = 0;i < n - 1 - j;i++)
	  {
		if (b.charAt(i) > b.charAt(i + 1))
		{
			c = b.charAt(i);
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + 1));
			b = tangible.StringFunctions.changeCharacter(b, i + 1, c);
		}
	  }

	}
	if (strcmp(a,b) == 0)
	{
	System.out.print("YES");
	}
	else
	{
	System.out.print("NO");
	}

	return 0;

	}
}

