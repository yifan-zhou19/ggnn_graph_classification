package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int A;
	int B;
	int C;
	int D;
	int E;
	int i;
	for (i = 1;i <= 100;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		A = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		B = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		C = Integer.parseInt(tempVar6);
	}
	if (a == 0 && b == 0 && c == 0 && A == 0 && B == 0 && C == 0)
	{
		break;
	}
	D = a * 3600 + b * 60 + c;
	E = (A + 12) * 3600 + B * 60 + C;
	System.out.printf("%d\n",E - D);
	}
	return 0;
	}

}

