package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'q', so pointers on this parameter are left unchanged:
	public static change(int * p, int * q, int n)
	{
		int t;
		for (;p <= q;p++,q--)
		{
			t = p;
			*p = q;
			*q = t;
		}
			 return;
	}
	public static void Main()
	{
		int n;
		int[] a = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
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
		p = a;
		q = a + n - 1;
	   change(p, q, n);
		 for (i = 0;i < n - 1;i++)
		 {
			 System.out.printf("%d ",*(p + i));
		 }
		 System.out.printf("%d",*(p + i));
	}
}

