package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int cases;
		int i = 0;
	String str = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		cases = Integer.parseInt(tempVar);
	}
	while (cases > 0)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
	int n;
	n = str.length();
	if ((str.charAt(n - 2) == 'e' && str.charAt(n - 1) == 'r') || (str.charAt(n - 2) == 'l' && str.charAt(n - 1) == 'y'))
	{
		for (i = 0;i < (n - 2);i++)
		{
		System.out.printf("%c",str.charAt(i));
		}

	}
	if (str.charAt(n - 3) == 'i' && str.charAt(n - 2) == 'n' && str.charAt(n - 1) == 'g')
	{
		for (i = 0;i < (n - 3);i++)
		{
		System.out.printf("%c",str.charAt(i));
		}

	}
	System.out.print("\n");
	cases--;
	}
	}

}

