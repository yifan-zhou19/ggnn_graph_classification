package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int l;
	int j;
	String s = new String(new char[300]);
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
		s = tempVar2.charAt(0);
	}
	l = s.length();
	for (j = 0;s.charAt(j) != '\0';j++)
	{
		if (j == l - 1)
		{
	if (s.charAt(j) == 'A')
	{
		System.out.print("T\n");
	}
	if (s.charAt(j) == 'T')
	{
		System.out.print("A\n");
	}
	if (s.charAt(j) == 'C')
	{
		System.out.print("G\n");
	}
	if (s.charAt(j) == 'G')
	{
		System.out.print("C\n");
	}
		}
		else
		{
	if (s.charAt(j) == 'A')
	{
		System.out.print("T");
	}
	if (s.charAt(j) == 'T')
	{
		System.out.print("A");
	}
	if (s.charAt(j) == 'C')
	{
		System.out.print("G");
	}
	if (s.charAt(j) == 'G')
	{
		System.out.print("C");
	}
		}
	}

	}
		return 0;
	}


}

