package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int n;
	//		int a;
	//		int b;
	//	}
	//	n[100000];
		int m;
		int i;
		int[] sum = new int[100000];
		int first;
		int second;
		int third;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i].n = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i].a = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n[i].b = tempVar4;
			}
			sum[i] = n[i].a + n[i].b;
		}
		if (sum[0] > sum[1] && sum[0] > sum[2] && sum[1] > sum[2])
		{
			first = sum[0];
			second = sum[1];
			third = sum[2];
			d = 1;
			e = 2;
			f = 3;
		}
		else if (sum[0] > sum[1] && sum[1] < sum[2] && sum[0]> sum[2])
		{
			first = sum[0];
			second = sum[2];
			third = sum[1];
			d = 1;
			e = 3;
			f = 2;
		}
		else if (sum[0] < sum[1] && sum[1]> sum[2] && sum[0] > sum[2])
		{
			first = sum[1];
			second = sum[0];
			third = sum[2];
			d = 2;
			e = 1;
			f = 3;
		}
		else if (sum[0] < sum[1] && sum[1]> sum[2] && sum[0] < sum[2])
		{
			first = sum[1];
			second = sum[2];
			third = sum[0];
			d = 2;
			e = 3;
			f = 1;
		}
		else if (sum[0] < sum[1] && sum[1] < sum[2] && sum[0] < sum[2])
		{
			first = sum[2];
			second = sum[1];
			third = sum[0];
			d = 3;
			e = 2;
			f = 1;
		}
		else if (sum[0] > sum[1] && sum[1] < sum[2] && sum[0] < sum[2])
		{
			first = sum[2];
			second = sum[0];
			third = sum[1];
			d = 3;
			e = 1;
			f = 2;
		}
		for (i = 3;i < m;i++)
		{
			if (sum[i] > first)
			{
				third = second;
				second = first;
				first = sum[i];
				f = e;
				e = d;
				d = i + 1;
			}
			else if (sum[i] <= first != 0 && sum[i]> second)
			{
				third = second;
				second = sum[i];
				f = e;
				e = i + 1;
			}
			else if (sum[i] <= second != 0 && sum[i]> third)
			{
				third = sum[i];
				f = i + 1;
			}
		}
		System.out.printf("%d %d\n",d,first);
		System.out.printf("%d %d\n",e,second);
		System.out.printf("%d %d\n",f,third);
		return 0;
	}
}

