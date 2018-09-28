package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	int j;
	int n;
	int len2;
	String a = new String(new char[100]);
	String b = new String(new char[100]);
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

	len2 = b.length();

	for (j = 0;j < len2;j++)
	{
	if (a.charAt(0) == b.charAt(j) && a.charAt(1) == b.charAt(j + 1) && j != 6)
	{
	System.out.printf("%d",j);
	}
	}

	}
}

