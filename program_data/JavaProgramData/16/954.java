package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

	String a = new String(new char[6]);
	int i;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	n = a.length();
	for (i = 1;i <= n;i++)
	{
	System.out.printf("%c",a.charAt(n - i));
	}
	}

}

