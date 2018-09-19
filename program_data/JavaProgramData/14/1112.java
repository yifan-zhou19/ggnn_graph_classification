package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct st
	//	{
	//		int num;
	//		int x;
	//		int y;
	//		int sum;
	//	}
	//	a[100000],m1,m2,m3;
		int n;
		int i;
		int j;
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
				a[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].x = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].y = tempVar4;
			}
			  a[i].sum = a[i].x + a[i].y;
		}
		m1.sum = 0;
		m2.sum = 0;
		m3.sum = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i].sum > m1.sum)
			{
				m1 = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((a[i].sum > m2.sum) && (a[i].sum <= m1.sum) && (a[i].num != m1.num))
			{
				m2 = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
		  if ((a[i].sum > m3.sum) && (a[i].sum <= m2.sum) && (a[i].num != m2.num) && (a[i].num != m1.num))
		  {
			  m3 = a[i];
		  }
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",m1.num,m1.sum,m2.num,m2.sum,m3.num,m3.sum);
		return 0;
	}


}

