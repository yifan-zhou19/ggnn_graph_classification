package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	String str = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}
	for (i = str.length() - 1;i >= 0;i--)
	{
	System.out.printf("%c",str.charAt(i));
	}
	System.in.read();
	System.in.read();
	}
}

