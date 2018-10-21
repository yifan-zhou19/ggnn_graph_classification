package <missing>;

public class GlobalMembers
{
	public static void f(tangible.RefObject<Integer> p, int n, int m)
	{
	 int i;
	 for (i = (n - 1);i >= 0;i--)
	 {
	 *(p.argValue + i + m) = *(p.argValue + i);
	 }
	 for (i = n;i < (n + m);i++)
	 {
	  *(p.argValue + i - n) = *(p.argValue + i);
	 }
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,a[100],n,m,i;
	 int p;
	 int[] a = new int[100];
	 int n;
	 int m;
	 int i;
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
	 for (i = 0;i < n;i++)
	 {
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 a[i] = Integer.parseInt(tempVar3);
	 }
	 }
	 p = a;
 tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
	 f(tempRef_p, n, m);
	 p = tempRef_p.argValue;
	 for (i = 0;i < n;i++)
	 {
		 System.out.printf("%d",a[i]);
	if (i != (n - 1))
	{
		System.out.print(" ");
	}
	 }
	 return 0;
	}

}

