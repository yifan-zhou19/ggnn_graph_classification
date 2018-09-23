package <missing>;

public class GlobalMembers
{
	public static int f(tangible.RefObject<String> p)
	{
		int i;
		int max = 0;
		int t;
		for (i = 0; * (p.argValue.Substring(i)) != '\0';i++)
		{
			if (*(p.argValue.Substring(i)) > max)
			{
			max = (p.argValue.Substring(i));
		 t = i;
			}
		}
	return t;

	}
	public static void Main()
	{
	for (;;)
	{
		String a = new String(new char[11]);
		String b = new String(new char[4]);
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	if (a.charAt(0) == '\0')
	{
	break;
	}
tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
	n = f(tempRef_a);
	a = tempRef_a.argValue;
	for (i = 0;i <= n;i++)
	{
	System.out.printf("%c",*(a.Substring(i)));
	}
	for (i = 0;i <= 2;i++)
	{
	System.out.printf("%c",*(b.Substring(i)));
	}
	for (i = n + 1; * (a.Substring(i)) != '\0';i++)
	{
	System.out.printf("%c",*(a.Substring(i)));
	}
	System.out.print("\n");
	a = tangible.StringFunctions.changeCharacter(a, 0, '\0');

	}


	}

}

