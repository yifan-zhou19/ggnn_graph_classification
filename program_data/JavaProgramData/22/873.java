package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char p;
	int max;
	int submax = -1;
	int i;
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	max = a;
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		p = tempVar2.charAt(0);
	}
	while (p == ',')
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a = Integer.parseInt(tempVar3);
	}
	if (max < a)
	{
	submax = max;
	max = a;
	}
	else if (submax < a && a != max)
	{
	submax = a;
	}
	String tempVar4 = ConsoleInput.scanfRead(null, 1);
	if (tempVar4 != null)
	{
		p = tempVar4.charAt(0);
	}

	}
	if (submax == -1)
	{
	System.out.print("No");
	}
	else
	{
	System.out.printf("%d",submax);
	}
	return 0;
	}

}

