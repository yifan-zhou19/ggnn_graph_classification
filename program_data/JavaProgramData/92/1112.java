package <missing>;

public class GlobalMembers
{
	public static int compare(Object elem1, Object elem2)
	{
		return *((int)elem1) - ((int)elem2);
	}

	public static int Main()
	{
		int n;
		int[] m = new int[100];
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int win;
		int lose;
		int t = 0;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			flag++;
			lose = win = 0;
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			qsort(a,n,(Integer.SIZE / Byte.SIZE),compare);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),compare);

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			int * aj = a[0];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			int * ai = a[n - 1];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			int * bj = b[0];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			int * bi = b[n - 1];
			while (ai - aj >= 0)
			{
				if (*ai > *bi)
				{
					ai--;
					bi--;
					win++;
				}
				else if (*aj > *bj)
				{
					aj++;
					bj++;
					win++;
				}
				else
				{
					if (*aj < *bi)
					{
					lose++;
					}
					aj++;
					bi--;
				}

			}
			m[t] = 200 * (win - lose);
			t++;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}
		for (t = 0;t < flag;t++)
		{
			System.out.printf("%ld\n",m[t]);
		}
		return 0;
	}

}

