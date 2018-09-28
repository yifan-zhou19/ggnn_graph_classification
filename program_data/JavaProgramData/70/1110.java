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
	int i;
	int a = 0;
	float x;
	float y;
	float x1;
	float y1;
	float x2;
	float y2;
	float x3;
	float y3;
	float x4;
	float y4;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x = Float.parseFloat(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		y = Float.parseFloat(tempVar3);
	}
	if (a == 0)
	{
	x1 = x2 = x3 = x4 = x;
	y1 = y2 = y3 = y4 = y;
	a = 1;
	}
	if (x < x1)
	{
	x1 = x;
	y1 = y;
	}
	if (x > x2)
	{
	x2 = x;
	y2 = y;
	}
	if (y < y3)
	{
	x3 = x;
	y3 = y;
	}
	if (y > y4)
	{
	x4 = x;
	y4 = y;
	}
	}
	float dis1;
	float dis2;
	float dis3;
	float dis4;
	float dis5;
	float dis6;
	float dis;
	dis1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	dis = dis1;
	dis2 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
	if (dis2 > dis)
	{
	dis = dis2;
	}
	dis3 = Math.sqrt((x4 - x1) * (x4 - x1) + (y4 - y1) * (y4 - y1));
	if (dis3 > dis)
	{
	dis = dis3;
	}
	dis4 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
	if (dis4 > dis)
	{
	dis = dis4;
	}
	dis5 = Math.sqrt((x4 - x2) * (x4 - x2) + (y4 - y2) * (y4 - y2));
	if (dis5 > dis)
	{
	dis = dis5;
	}
	dis6 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
	if (dis6 > dis)
	{
	dis = dis6;
	}
	System.out.printf("%.4f\n",dis);
	return 0;
	}


}

