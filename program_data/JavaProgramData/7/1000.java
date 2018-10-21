package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j = 0;
	int count = 0;
	int h;
	String a = new String(new char[260]);
	String b = new String(new char[260]);
	String c = new String(new char[260]);
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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = tempVar3.charAt(0);
	}

	for (i = 0;i <= a.length() - 1;i++)
	{
		if (a.charAt(i) == b.charAt(j))
		{
		count += 1;
		j += 1;
		}
		else
		{
			j = 0;
			count = 0;
		}
		if (count == b.length())
		{
			h = i;
			break;
		}
	}
	if (count == b.length())
	{
	for (i = 0;i <= h - b.length();i++)
	{
	System.out.printf("%c",a.charAt(i));
	}
	for (i = 0;i <= c.length() - 1;i++)
	{
	System.out.printf("%c",c.charAt(i));
	}
	for (i = h + 1;i <= a.length() - 1;i++)
	{
	System.out.printf("%c",a.charAt(i));
	}
	}
	else
	{
		System.out.printf("%s",a);
	}
	}

}

