package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num, ch, ma, grade;
	//	}
	//	sum[100000], h, m, t;
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
				sum[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sum[i].ch = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				sum[i].ma = tempVar4;
			}
			sum[i].grade = sum[i].ch + sum[i].ma;
		}
		h.grade = m.grade = t.grade = 0;
		for (i = 0;i < n;i++)
		{
			if (sum[i].grade > h.grade)
			{
				t = m;
				m = h;
				h = sum[i];
			}
			else if (sum[i].grade > m.grade)
			{
				t = m;
				m = sum[i];
			}
			else if (sum[i].grade > t.grade)
			{
				t = sum[i];
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n", h.num, h.grade, m.num, m.grade, t.num, t.grade);
		return 0;
	}

}

