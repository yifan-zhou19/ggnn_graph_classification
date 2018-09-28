package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int a;
	int b;
	int c;
	int i;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			c = Integer.parseInt(tempVar4);
		}
	if ((a % 4) != 0 || (a % 4) == 0 && (a % 100) == 0 && (a % 400) != 0)
	{
		if (b == 9 && c == 12 || b == 12 && c == 9 || b == 4 && c == 7 || b == 7 && c == 4 || b == 1 && c == 10 || b == 10 && c == 1 || b == 2 && c == 3 || b == 3 && c == 2 || b == 2 && c == 11 || b == 11 && c == 2 || b == 3 && c == 11 || b == 11 && c == 3)
		{
	  System.out.print("YES\n");
		}
	  else
	  {
	System.out.print("NO\n");
	  }
	}
	else if ((a % 4) == 0 && (a % 100) != 0 || (a % 400) == 0)
	{
	if (b == 9 && c == 12 || b == 12 && c == 9 || b == 4 && c == 7 || b == 7 && c == 4 || b == 1 && c == 4 || b == 4 && c == 1 || b == 1 && c == 7 || b == 7 && c == 1 || b == 2 && c == 8 || b == 8 && c == 2 || b == 3 && c == 11 || b == 11 && c == 3)
	{
	System.out.print("YES\n");
	}
	else
	{
	System.out.print("NO\n");
	}
	}
	}
	return 0;
	}
}

