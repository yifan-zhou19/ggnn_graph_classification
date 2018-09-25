package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int len;
	int end = 0;
	String c = new String(new char[max + 1]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		c = tempVar2.charAt(0);
	}
	len = c.length();
	if (i == 0)
	{
	System.out.printf("%s",c);
	end += len;
	}
	else
	{
		if (len + end + 1 > line)
		{
	System.out.print("\n");
	System.out.printf("%s",c);
	end = len;
		}
	else
	{
		System.out.print(" ");
	System.out.printf("%s",c);
	end += len + 1;
	}
	}
	}
	return 0;
	}
}

