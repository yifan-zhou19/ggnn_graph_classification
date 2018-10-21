package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	String c = new String(new char[1000]);
	int i;
	int j;
	int dd = 1;
	int len;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}


	for (i = 0;i < n;i++)
	{
		dd = 1;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		c = tempVar2.charAt(0);
	}
	len = c.length();

	if (c.charAt(0) != 95 && ((c.charAt(0) <= 64 || c.charAt(0) >= 123) || (c.charAt(0) <= 96 && c.charAt(0) >= 91)))
	{
		dd = 0;
	}
	if ((c.charAt(0) > 64 && c.charAt(0) < 91) || (c.charAt(0)>96 && c.charAt(0) < 123))
	{

	for (j = 1;j < len;j++)
	{

	if (c.charAt(j) != 95 && (c.charAt(j) < 48 || c.charAt(j)>57) && ((c.charAt(j) <= 64 || c.charAt(j) >= 123) || (c.charAt(j) <= 96 && c.charAt(j) >= 91)))
	{
	dd = 0;
	break;
	}

	}


	}

	if (dd == 1)
	{
	System.out.print("yes\n");
	}
	else
	{
	System.out.print("no\n");
	}

	}



	}
}

