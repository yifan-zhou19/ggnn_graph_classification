package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
		int[] b = new int[20];
		int x;
		int y;
		int i;
		int judge = new int(int * p,int * q);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = x;
		b[0] = y;
	for (i = 1;x > 1;i++,x = x / 2)
	{
	a[i] = x / 2;
	}
	a[i] = 1;
	for (i = 1;y > 1;i++,y = y / 2)
	{
	b[i] = y / 2;
	}
	b[i] = 1;
	System.out.printf("%d\n",judge(a, b));

	return 0;
	}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'q', so pointers on this parameter are left unchanged:
	public static int judge(int * p, int * q)
	{
	for (; * p != 0;p++)
	{
		;
	}
	p--;
	for (; * q != 0;q++)
	{
		;
	}
	q--;
	for (; * p == *q;p--,q--)
	{
		;
	}
	q++;
	return (*q);



	}
}

