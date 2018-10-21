package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	final String a = "\0\0\0\0\0";
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	for (i = 0;i < 6;i++)
	{
	if (a.charAt(5 - i) != null)
	{
	System.out.printf("%c",a.charAt(5 - i));
	}
	}
	return 0;
	}
}

