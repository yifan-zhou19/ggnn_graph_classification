package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int n;
	int c;
	String a = new String(new char[40]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	System.out.printf("%s",a);
	c = a.length();
	for (i = 1;i <= n - 1;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a = tempVar3.charAt(0);
		}
	if (c + a.length() + 1 <= 80)
	{
		System.out.printf(" %s",a);
	c += a.length() + 1;
	}
	else
	{
		c = a.length();
	System.out.printf("\n%s",a);
	}
	}
	}

}

