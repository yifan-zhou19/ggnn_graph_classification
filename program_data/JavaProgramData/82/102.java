package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] k = new int[100];
		int l;
		int n;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int a;
	//		int b;
	//	}
	//	q[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				q[i].b = tempVar3;
			}
		}
		for (i = 0;i <= 99;i++)
		{
			k[i] = 0;
		}
		l = 0;
		for (i = 0;i <= n - 1;i++)
		{
			if (q[i].a <= 140 && q[i].a >= 90 && q[i].b >= 60 && q[i].b <= 90)
			{
				k[l] += 1;
			}
			else
			{
				l += 1;
			}
		}
		m = 0;
		for (i = 0;i <= l + 1;i++)
		{
			if (m < k[i])
			{
				m = k[i];
			}
		}
		System.out.printf("%d",m);
		return 0;
	}



}

