package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] tian = new int[1000];
		int[] qi = new int[1000];
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q1;
		int sum;
		int t;
		int temp;
		while (true)
		{
			sum = 0;

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
	if (n == 0)
	{
	return;
	}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tian[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qi[i] = Integer.parseInt(tempVar3);
				}
			}
			t = n;
			while (t-- != 0)
			{
				for (i = 0;i < t;i++)
				{
					if (tian[i] < tian[i + 1])
					{
						temp = tian[i];
						tian[i] = tian[i + 1];
						tian[i + 1] = temp;
					}
				}
				for (i = 0;i < t;i++)
				{
					if (qi[i] < qi[i + 1])
					{
						temp = qi[i];
						qi[i] = qi[i + 1];
						qi[i + 1] = temp;
					}
				}

			}
			p = tian + n - 1;
			p1 = tian;
			q = qi + n - 1;
			q1 = qi;
			while (p >= p1)
			{
				if (*p > *q)
				{
					sum = sum + 200;
					p--;
					q--;
				}
				else if (*p < *q)
				{
					sum = sum - 200;
					p--;
					q1++;
				}
				else if (*p == *q)
				{
					if (*p1 > *q1)
					{
						sum = sum + 200;
						p1++;
						q1++;
					}
					else if (*p1 < *q1)
					{
						sum = sum - 200;
						p--;
						q1++;
					}
					else if (*p1 == *q1)
					{
						if (*p1 == *p)
						{
							sum = sum + 0;
							break;
						}
						else
						{
							sum = sum - 200;
							p--;
							q1++;
						}
					}
				}

			}
			System.out.printf("%d\n",sum);
		}
	}
}

