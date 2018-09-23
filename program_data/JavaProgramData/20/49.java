package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int max = 0;
	String str = new String(new char[11]);
	String substr = new String(new char[4]);
	char maxchar;
	while (scanf("%s",str) != EOF)
	{
	maxchar = '\0';
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		substr = tempVar.charAt(0);
	}
	for (i = 0;str.charAt(i);i++)
	{
	if (str.charAt(i) > maxchar)
	{
	max = i;
	maxchar = str.charAt(i);
	}
	}
	for (i = 0;i <= max;i++)
	{
	 System.out.printf("%c",str.charAt(i));
	}
	System.out.printf("%s",substr);
	for (i = max + 1;str.charAt(i);i++)
	{
	 System.out.printf("%c",str.charAt(i));
	}
	System.out.print("\n");
	}
	}
}

