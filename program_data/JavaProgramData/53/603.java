package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static del(int[] a, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int i = 0;
		int[] b = new int[10000];
		p = a + 1;
		q = a;
		System.out.printf("%d",a[0]);
		for (;p < a + n;p++)
		{
			for (; q < p;q++)
			{
				if (*q == *p)
				{
					q = a;
					break;
				}
			}
			if (q == p)
			{
				b[i++] = p;
				System.out.printf(",%d",*p);
			}
			q = a;
		}
	}
	public static int Main()
	{
		int[] a = new int[10000];
		int n;
		int[] p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;p < a + n;p++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  p = Integer.parseInt(tempVar2);
		  }
		}
		del(a, n);
	}
}

