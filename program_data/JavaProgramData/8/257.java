package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static void duqu()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (p = a;p < a + m;p++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
		}
		for (p = b;p < b + n;p++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void range(int[] a, int[] b, int m, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int d;
		for (p = a;p < a + m - 1;p++)
		{
			for (q = p + 1;q < a + m;q++)
			{
				if (*p > *q)
				{
					d = p;
					*p = q;
					*q = d;
				}
			}
		}
			for (p = b;p < b + n - 1;p++)
			{
				for (q = p + 1;q < b + n;q++)
				{
				if (*p > *q)
				{
					d = p;
					*p = q;
					*q = d;
				}
				}
			}

	}
	public static void merge(int[] a, int[] b, int m, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		for (p = c,q = a;q < a + m;p++,q++)
		{
			*p = q;
		}
		for (p = c + m,q = b;q < b + n;p++,q++)
		{
			*p = q;
		}
	}
	public static void show(int[] c, int d)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		for (p = c;p < c + d - 1;p++)
		{
			System.out.printf("%d ",*p);
		}
		System.out.printf("%d",*p);
	}
	public static void Main()
	{
		duqu();
		range(a, b, m, n);
		merge(a, b, m, n);
		show(c, m + n);
	}








}

