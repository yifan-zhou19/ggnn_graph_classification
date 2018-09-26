package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] shijifen = new int[10];
	int[] xuefen = new int[10];
	int i;
	int xuefenzhihe;
	double[] ymxf = new double[10];
	double[] jidian = new double[10];
	double jidianzhihe;
	double GPA;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	xuefenzhihe = 0;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		xuefen[i] = Integer.parseInt(tempVar2);
	}
	xuefenzhihe = xuefenzhihe + xuefen[i];
	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		shijifen[i] = Integer.parseInt(tempVar3);
	}
	if (shijifen[i] < 60)
	{
	jidian[i] = 0;
	}
	else if (shijifen[i] >= 60 && shijifen[i] <= 63)
	{
	jidian[i] = 1.0;
	}
	else if (shijifen[i] >= 64 && shijifen[i] <= 67)
	{
	jidian[i] = 1.5;
	}
	else if (shijifen[i] >= 68 && shijifen[i] <= 71)
	{
	jidian[i] = 2.0;
	}
	else if (shijifen[i] >= 72 && shijifen[i] <= 74)
	{
	jidian[i] = 2.3;
	}
	else if (shijifen[i] >= 75 && shijifen[i] <= 77)
	{
	jidian[i] = 2.7;
	}
	else if (shijifen[i] >= 78 && shijifen[i] <= 81)
	{
	jidian[i] = 3.0;
	}
	else if (shijifen[i] >= 82 && shijifen[i] <= 84)
	{
	jidian[i] = 3.3;
	}
	else if (shijifen[i] >= 85 && shijifen[i] <= 89)
	{
	jidian[i] = 3.7;
	}
	else
	{
	jidian[i] = 4.0;
	}
	}
	jidianzhihe = 0;
	for (i = 0;i < n;i++)
	{
	jidianzhihe = jidianzhihe + jidian[i] * xuefen[i];
	}
	GPA = jidianzhihe / xuefenzhihe;
	System.out.printf("%.2lf",GPA);
	return 0;
	}

}

