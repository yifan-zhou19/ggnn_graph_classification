package <missing>;

public class GlobalMembers
{
	public static void f(tangible.RefObject<Integer> p, int n, int m)
	{
	int j;
	int i;
	int temp;
	for (j = n - m;j <= n - 1;j++)
	{
	  for (i = j;i >= j - n + m + 1;i--)
	  {
		  temp = (p.argValue + i);
	  *(p.argValue + i) = *(p.argValue + i - 1);
	  *(p.argValue + i - 1) = temp;
	  }
	}
	}
	public static void Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
	   for (i = 0;i <= n - 1;i++)
	   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i] = Integer.parseInt(tempVar3);
		   }
	   }
tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
	f(tempRef_a, n, m);
	a = tempRef_a.argValue;
	   for (p = a;p <= a + n - 2;p++)
	   {
		   System.out.printf("%d ",*p);
	   }
	   System.out.printf("%d",*p);


	}
}

