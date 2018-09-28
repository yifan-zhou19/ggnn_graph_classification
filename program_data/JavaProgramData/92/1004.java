package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] x = new int[1000];
	public static int[] y = new int[1000];

	public static int myCmp(Object a, Object b)
	{
		return *(int)b - (int)a;
	}

	public static int Main()
	{
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * hx; // h=head, r=rear
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * hy;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * rx;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * ry;
		int win;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			win = 0;

			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					y[i] = Integer.parseInt(tempVar3);
				}
			}

			qsort(x,n,(Integer.SIZE / Byte.SIZE),myCmp);
			qsort(y,n,(Integer.SIZE / Byte.SIZE),myCmp);

			hx = x[0];
			hy = y[0];
			rx = x[n - 1];
			ry = y[n - 1];

			while (hx <= rx)
			{
				if (*hx != *hy)
				{
					if (*hx > *hy)
					{
						win++;
						hx++;
						hy++;
					}
					else
					{
						win--;
						rx--;
						hy++;
					}
				}
				else if (*rx != *ry)
				{
					if (*rx > *ry)
					{
						win++;
						rx--;
						ry--;
					}
					else
					{
						win--;
						rx--;
						hy++;
					}
				}
				else
				{
					win += *rx < *hy != 0 ? -1 : 0;
					rx--;
					hy++;
				}
			}

			System.out.printf("%d\n",win * 200);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}

		return 1;
	}
}

