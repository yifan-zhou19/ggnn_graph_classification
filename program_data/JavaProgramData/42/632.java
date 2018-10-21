package <missing>;

public class GlobalMembers
{
	public static void Main()

	{
	   int n;
	   int i;
	   int m;
	   int j;
		int[] a = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * point;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * qoint;
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
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		point = a;
		m = 0;
		for (i = 0;(i < n) & (m < n);point++, i++)
		{
			if (*point == b)
			{
				qoint = point;
				for (j = i;j < n - 1;qoint++,j++)
				{
					*qoint = (qoint + 1);
				}
				*qoint = b;
				point = point - 1;
				i = i - 1;
				m = m + 1;



			}


		}

		point = a;
		if (*point != b)
		{
		System.out.printf("%ld",*point);
		}
		point = point + 1;
		for (i = 1;i < n;i++,point++)
		{
		if (*point != b)
		{
		System.out.printf(" %ld",*point);
		}
		}

	}








}

