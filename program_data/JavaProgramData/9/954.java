package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct p
	//	{
	//		char num[100];
	//	 int age;
	//	}
	//	p[101];
		int n;
		int i;
		int j;
		int k;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].age = tempVar3;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct q
	//	{
	//		char num[100];
	//	 int age;
	//	}
	//	q[101];
		for (i = 1,j = 1;i <= n;i++)
		{
			if (p[i].age >= 60)
			{
				q[j].num = p[i].num;
				q[j].age = p[i].age;
				j++;
				m = m + 1;
			}
		}
		for (j = 1;j <= m;j++)
		{
						 for (i = 1;i <= m - 1;i++)
						 {
											if (q[i].age < q[i + 1].age)
											{
																   q[101] = q[i];
																   q[i] = q[i + 1];
																   q[i + 1] = q[101];
											}
						 }
		}
		System.out.printf("%s",q[1].num);
		for (i = 2;i <= m;i++)
		{
			System.out.printf("\n%s",q[i].num);
		}
		for (i = 1;i <= n;i++)
		{
			if (p[i].age < 60)
			{
				System.out.printf("\n%s",p[i].num);
			}
		}
	}

}

