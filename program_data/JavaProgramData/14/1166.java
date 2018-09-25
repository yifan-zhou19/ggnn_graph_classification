package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int chinese;
	//		int math;
	//		int sum;
	//	}
	//	m[4],t;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 3;i++)
		{
			m[i].sum = -1;
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t.num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				t.chinese = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				t.math = tempVar4;
			}
			t.sum = t.chinese + t.math;
			if (t.sum > m[1].sum)
			{
				m[3] = m[2];
				m[2] = m[1];
				m[1] = t;
			}
			else
			{
				if (t.sum > m[2].sum)
				{
					m[3] = m[2];
					m[2] = t;
				}
				else
				{
					if (t.sum > m[3].sum)
					{
						m[3] = t;
					}
				}
			}
		}
		for (i = 1;i <= 3;i++)
		{
			System.out.printf("%d %d\n",m[i].num,m[i].sum);
		}
	}
}

