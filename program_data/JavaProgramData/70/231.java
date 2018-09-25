package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct point
	//   {
	//float x,y;
	//}
	//p1[1000];
	int i;
	int n;
	int j = 0;
	int k;
	int m;
	double dis;
	double max1 = 0;
	double max2 = 0;
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
		p1[j].x = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		p1[j].y = tempVar3;
	}
	j++;
	}
	for (k = 0;k < n;k++)
	{
	for (m = 0;m < n;m++)
	{
	dis = Math.sqrt((p1[k].x - p1[m].x) * (p1[k].x - p1[m].x) + (p1[k].y - p1[m].y) * (p1[k].y - p1[m].y));
	if (dis >= max1)
	{
	max1 = dis;
	}
	}
	if (max1 >= max2)
	{
	max2 = max1;
	}
	}
	System.out.printf("%.4f",max2);
	}
}

