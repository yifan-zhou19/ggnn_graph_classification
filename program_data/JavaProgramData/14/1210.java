package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m1;
		int m2;
		int m3;
		int n1;
		int n2;
		int n3;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int verbal;
	//		int math;
	//		int sum;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		student p;
			p = stu;

		int i;
		int n;
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
			(p + i).num = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			(p + i).verbal = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			(p + i).math = tempVar4;
		}
		}
		for (i = 0;i < n;i++)
		{
		(p + i).sum = (p + i).verbal + (p + i).math;
		}
		m1 = p.sum;
		n1 = 0;
		for (i = 0;i < n;i++)
		{
			if (((p + i).sum) > m1)
			{
				m1 = (p + i).sum;
			n1 = i;
			}
		}
			System.out.printf("%d %d\n",(p + n1).num,(p + n1).sum);
		m2 = p.sum;
		n2 = 0;
		for (i = 0;i < n;i++)
		{
		if (((p + i).sum) > m2 && i != n1)
		{
				m2 = (p + i).sum;
			n2 = i;
		}
		}
			System.out.printf("%d %d\n",(p + n2).num,(p + n2).sum);

		m3 = p.sum;
		n3 = 0;
		for (i = 0;i < n;i++)
		{
			if ((((p + i).sum) > m3) && i != n1 && i != n2)
			{
				m3 = (p + i).sum;
			n3 = i;
			}
		}
			System.out.printf("%d %d\n",(p + n3).num,(p + n3).sum);


	}



}

