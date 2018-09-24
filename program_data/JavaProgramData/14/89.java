package <missing>;

public class GlobalMembers
{
	public static void Main()
	{


//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//{
	//int num;
	//int a;
	//int b;
	//}
	//stu[100000];

	int n;
	int i;
	int sum = 0;
	int max1 = 0;
	int max2 = 0;
	int max3 = 0;
	int t = 0;
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
		stu[i].num = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		stu[i].a = tempVar3;
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		stu[i].b = tempVar4;
	}
	sum = stu[i].a + stu[i].b;
	if (sum > max1)
	{
		max3 = max2;
		max2 = max1;
		max1 = sum;
	}
	else if ((sum < max1) && (sum> max2))
	{
		max3 = max2;
		max2 = sum;
	}
	else if ((sum < max2) && (sum> max3))
	{
		max3 = sum;
	}
	}


	for (i = 0;i < n;i++)
	{
	sum = stu[i].a + stu[i].b;
	if (sum == max1)
	{
		System.out.printf("%d %d\n",stu[i].num,max1);
		t++;
	}
	}

	for (i = 0;i < n;i++)
	{
	sum = stu[i].a + stu[i].b;
	if ((sum == max2) && (t < 3))
	{
		System.out.printf("%d %d\n",stu[i].num,max2);
		t++;
	}
	}

	for (i = 0;i < n;i++)
	{
	sum = stu[i].a + stu[i].b;
	if ((sum == max3) && (t < 3))
	{
		System.out.printf("%d %d\n",stu[i].num,max3);
		t++;
	}
	}


	}
}

