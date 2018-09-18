package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//{
	//	int ID;
	//int YW;
	//int SX;
	//};
	student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	int[] ZF = new int[100000];
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].YW = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].SX = tempVar4;
			}
			ZF[i] = stu[i].YW + stu[i].SX;
	}
	int a = 0;
	int b = 0;
	int c = 0;
	int A = 0;
	int B = 0;
	int C = 0;
	for (int i = 0;i < n;i++)
	{
			if (ZF[i] > a)
			{
			c = b;
			C = B;
			b = a;
			B = A;
			a = ZF[i];
			A = i;
			}
			else if (ZF[i] > b)
			{
				c = b;
				C = B;
				b = ZF[i];
				B = i;
			}
			else if (ZF[i] > c)
			{
				c = ZF[i];
				C = i;
			}
	}
	System.out.printf("%d %d\n",stu[A].ID,a);
	System.out.printf("%d %d\n",stu[B].ID,b);
	System.out.printf("%d %d\n",stu[C].ID,c);
	System.in.read();
	System.in.read();
	}

}

