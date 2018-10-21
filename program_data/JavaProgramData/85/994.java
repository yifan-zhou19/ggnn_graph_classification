package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int a;
	int l;
	int b = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String c = new String(new char[21]);
	for (i = 0;i < n;i++)
	{
		b = 1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		l = c.length();
		for (j = 0;j < l;j++)
		{
			if ((c.charAt(j) == '_') || (c.charAt(j) >= 'A' && c.charAt(j) <= 'Z') || (c.charAt(j) >= 'a' && c.charAt(j) <= 'z') || (c.charAt(j) >= '0' && c.charAt(j) <= '9' && j>0))
			{
				a = 1;
			}
			else
			{
				b = 0;
			}
		}
		if (b == 1)
		{
			System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}
	}



		return 0;
	}
}

