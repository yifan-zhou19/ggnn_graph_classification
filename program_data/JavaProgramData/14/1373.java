package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//	int num;
	//	int score1;
	//	int score2;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		int n;
		int i;
		int j;
		int k;
		int m;
		int a = 0;
		int b = 0;
		int c = 0;
		int A;
		int B;
		int C;
		A = B = C = 0;
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
				stu[i].score1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].score2 = tempVar4;
			}
			k = stu[i].score1 + stu[i].score2;
			if (k > c)
			{
				c = k;
				C = stu[i].num;
			}
			if (c > b)
			{
				m = c;
				c = b;
				b = m;
				m = C;
				C = B;
				B = m;
			}
			if (b > a)
			{
				m = b;
				b = a;
				a = m;
				m = B;
				B = A;
				A = m;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d",A,a,B,b,C,c);
	}

}

