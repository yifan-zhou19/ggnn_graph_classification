package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int q = 0;
		int i;
		int j;

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qujian
	//	{
	//	int begin;
	//	int end;
	//	}
	//	qujian[50000];

		int[] a = new int[100000];
		int first;
		int last;
		int A = 0;

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
				qujian[i].begin = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				qujian[i].end = tempVar3;
			}
		}

		first = qujian[0].begin;
		for (i = 0;i < n - 1;i++)
		{

			if (first > qujian[i + 1].begin)
			{
				  first = qujian[i + 1].begin;

			}
		}

		last = qujian[n - 1].end;
		for (i = 0;i < n - 1;i++)
		{
				if (qujian[i].end > last)
				{
				  last = qujian[i].end;

				}
		}
		for (i = 0;i < n;i++)
		{
			for (j = qujian[i].begin * 10;j <= qujian[i].end * 10;j++)
			{
			a[j]--;
			}
		}

		first = first * 10;
		last = last * 10;
		for (i = first;i <= last;i++)
		{
			if (a[i] == 0)
			{

			A = 9;
			break;
			}

		}
		if (A == 9)
		{
		   System.out.print("no");
		}
		else
		{
		   System.out.printf("%d %d",first / 10,last / 10);
		}
		return 0;
	}

}

