package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'q', so pointers on this parameter are left unchanged:
	public static void input(int * p, int * q, tangible.RefObject<Integer> n, tangible.RefObject<Integer> m)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *x;
		 int x;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n.argValue = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 m.argValue = Integer.parseInt(tempVar2);
		 }
		 x = p + n.argValue;
		 for (;p < x;p++)
		 {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
		 }
		 x = q + m.argValue;
		 for (;q < x;q++)
		 {
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				q = Integer.parseInt(tempVar4);
			}
		 }
	}

	public static void sort(tangible.RefObject<Integer> p, int n)
	{
		 int x;
		 int i;
		 int j;
		 int k;
		 for (i = 0;i < n - 1;i++)
		 {
			 k = i;
			 for (j = i + 1;j < n;j++)
			 {
				if (*(p.argValue + j) < *(p.argValue + k))
				{
					k = j;
				}
			 }
			 if (k != i)
			 {
					 x = (p.argValue + i);
					 *(p.argValue + i) = *(p.argValue + k);
					 *(p.argValue + k) = x;
			 }
		 }
	}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'q', so pointers on this parameter are left unchanged:
	public static void copy(int * p, int * q, int[] x, int n, int m)
	{
		 int i;
		 for (i = 0;i < n;i++,p++)
		 {
			x[i] = p;
		 }
		 for (;i < n + m;i++,q++)
		 {
			x[i] = q;
		 }
	}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static void output(int * p, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *y;
		 int y;
		 y = p + n - 1;
		 System.out.printf("%d",*p);
		 p++;
		 for (;p <= y;p++)
		 {
			System.out.printf(" %d",*p);
		 }
	}

	public static int Main()
	{
		 int i;
		 int[] a = new int[100];
		 int[] b = new int[100];
		 int[] c = new int[200];
		 int x;
		 int y;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *n;
		 int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *m;
		 int m;
		 n = x;
		 m = y;
	 tangible.RefObject<Integer> tempRef_n = new tangible.RefObject<Integer>(n);
	 tangible.RefObject<Integer> tempRef_m = new tangible.RefObject<Integer>(m);
		 input(a, b, tempRef_n, tempRef_m);
		 m = tempRef_m.argValue;
		 n = tempRef_n.argValue;
	 tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		 sort(tempRef_a, x);
		 a = tempRef_a.argValue;
	 tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
		 sort(tempRef_b, y);
		 b = tempRef_b.argValue;
		 copy(a, b, c, x, y);
		 output(c, x + y);

	}
}

