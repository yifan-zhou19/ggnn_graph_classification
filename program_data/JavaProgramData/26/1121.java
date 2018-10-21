package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[200]);

	String b = new String(new char[200]);
	a = new Scanner(System.in).nextLine();
	int i = 0;
	int n = 0;
	int m = 0;
	int t = 0;
	for (i = 0;i < 200;i++)
	{
		b = tangible.StringFunctions.changeCharacter(b, i, '\0');
	}

	for (i = 0;a.charAt(i) != '\0';i++)
	{
	if (a.charAt(i) == ' ')
	{
	  n = n + 1;
	}
	if (a.charAt(i) != ' ')
	{
	   n = 0;
	}
	if (n >= 2)
	{

			//m=m+1; 
	//printf("%d\n",m);

	continue;
	}
	else
	{
		b = tangible.StringFunctions.changeCharacter(b, t, a.charAt(i));
	t++;
	}
	}
	for (i = 0;b.charAt(i) != '\0';i++)
	{
	   System.out.printf("%c",b.charAt(i));
	}

	}

}

