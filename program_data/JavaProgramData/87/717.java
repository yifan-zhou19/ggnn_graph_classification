package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int s1;
	int f1;
	int m1;
	int s2;
	int f2;
	int m2;
	int n = 0;
	for (int i = 0;i < 1;i--)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		f1 = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m1 = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		s2 = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		f2 = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		m2 = Integer.parseInt(tempVar6);
	}
	if (s1 == 0 && f1 == 0 && m1 == 0)
	{
		break;
	}
	n = 3600 - f1 * 60 - m1;
	n += (s2 + 12 - s1 - 1) * 3600 + f2 * 60 + m2;
	System.out.printf("%d\n",n);





	}

	return 0;
	}
}

