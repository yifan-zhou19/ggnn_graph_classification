package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int e;
		int k;
		int m;
		int[] num = new int[100];
		int[][] a = new int[100][60];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p1 = num;p1 < num + n;p1++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1 = Integer.parseInt(tempVar2);
			}
			if (*p1 > 0)
			{
				for (p2 = a[p1 - num];p2 < a[p1 - num] + *p1;p2++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						p2 = Integer.parseInt(tempVar3);
					}
				}
			}
		}
		for (p1 = num;p1 < num + n;p1++)
		{
			if (*p1 == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				e = 0;
				k = 0;
				m = 0;
				for (p2 = a[p1 - num];p2 < a[p1 - num] + *p1;p2++)
				{
					if ((e + *p2) >= 60)
					{
						k = 1;
						m = (p2 - 1) + 60 - (*(p2 - 1) + e);
						System.out.printf("%d\n",m);
					}
					if (k == 1)
					{
						break;
					}
					e = e+3;
					if ((*p2 + e) >= 60)
					{
						k = 2;
						System.out.printf("%d\n",*p2);
					}
					if (k == 2)
					{
						break;
					}
				}
				if (k == 0)
				{
					m = 60 - e;
					System.out.printf("%d\n",m);
				}
			}
		}
	}
}

