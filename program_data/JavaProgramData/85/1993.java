package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int x;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0 ;i < n;i++)
	{
	x = 0;
	String a = new String(new char[22]);
	a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	for (int j = 0;a.charAt(j) != '\0';j++)
	{
	if (j == 0)
	{
		if ((a.charAt(j) > 64 && a.charAt(j) < 91) || (a.charAt(j)>96 && a.charAt(j) < 123) || a.charAt(j) == '_')
		{
			continue;
		}
	}
	else if ((a.charAt(j) > 64 && a.charAt(j) < 91) || (a.charAt(j)>96 && a.charAt(j) < 123) || a.charAt(j) == '_' || (a.charAt(j)>47 && a.charAt(j) < 58))
	{
		continue;
	}
	x = 1;
	}
	if (x == 0)
	{
		System.out.print("yes");
		System.out.print("\n");
	}
	else
	{
		System.out.print("no");
		System.out.print("\n");
	}
	}
	return 0;
	}
}

