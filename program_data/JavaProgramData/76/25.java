package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qujian
	//	{
	//		int num1;
	//		int num2;
	//	};
		qujian[] quj = tangible.Arrays.initializeWithDefaultqujianInstances(50000);
		int n;
		int i;
		int j;
		int a;
		int b;
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
				quj[i].num1 = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				quj[i].num2 = tempVar3;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (quj[j].num1 > quj[j + 1].num1)
				{
					a = quj[j + 1].num1;
					b = quj[j + 1].num2;
					quj[j + 1].num1 = quj[j].num1;
					quj[j + 1].num2 = quj[j].num2;
					quj[j].num1 = a;
					quj[j].num2 = b;
				}
			}
		}
		a = quj[0].num1;
		b = quj[0].num2;
		for (i = 1;i < n;i++)
		{
			if (quj[i].num1 <= b != 0 && quj[i].num1 >= a)
			{
				if (quj[i].num2 > b)
				{
					b = quj[i].num2;
				}
			}
			if (quj[i].num1 > b)
			{
				break;
			}
		}
		if (i == n)
		{
			System.out.printf("%d %d",a,b);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

