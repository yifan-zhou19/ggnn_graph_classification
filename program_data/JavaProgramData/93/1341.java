package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int i = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	if (a % 3 == 0)
	{
	 i = i + 3;
	}
	if (a % 5 == 0)
	{
	i = i + 5;
	}
	if (a % 7 == 0)
	{
	 i = i + 7;
	}
	switch (i)
	{
	case 0:
	System.out.print("n");
	break;
	case 3:
	System.out.print("3");
	break;
	case 5:
	System.out.print("5");
	break;
	case 7:
	System.out.print("7");
	break;
	case 8:
	System.out.print("3 5");
	break;
	case 10:
	System.out.print("3 7");
	break;
	case 12:
	System.out.print("5 7");
	break;
	case 15:
	System.out.print("3 5 7");
	break;
	}
	return 0;
	}


}

