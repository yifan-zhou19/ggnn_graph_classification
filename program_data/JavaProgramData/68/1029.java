package <missing>;

public class GlobalMembers
{
	public static int R(int[] p, int n)
	{
		 int i;
		 int m = 0;
		 if (p[n] == 0)
		 {
				 for (i = 2;i <= (int)Math.sqrt(n);i++)
				 {
				 if (n % i == 0)
				 {
					 m++;
				 }
				 }
				 if (m == 0)
				 {
					 p[n] = 1;
				 }
				 else
				 {
					 p[n] = 2;
				 }
		 }
		 if (p[n] == 1)
		 {
			 return 1;
		 }
		 else if (p[n] == 2)
		 {
			 return 2;
		 }
	}
	public static void Find(tangible.RefObject<Integer> p, int n)
	{
		 int i;
		 if (R(p.argValue, n - 2) == 1)
		 {
			 System.out.printf("%d=%d+%d\n",n,2,n - 2);
		 }
		 else
		 {
			 for (i = 3;i <= n / 2;i += 2)
			 {
			 if (R(p.argValue, i) == 1 && R(p.argValue, n - i) == 1)
			 {
				 break;
			 }
			 }
			 if (R(p.argValue, i) == 1 && R(p.argValue, n - i) == 1)
			 {
				 System.out.printf("%d=%d+%d\n",n,i,n - i);
			 }
		 }
	}
	public static int Main()
	{
		  int n;
		  int m;
		  int[] p;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  p = new int[(m)];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		  memset(p,0,(Integer.SIZE / Byte.SIZE));
		  p[2] = 1;
		  for (n = 6;n <= m;n += 2)
		  {
	  tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		  Find(tempRef_p, n);
		  p = tempRef_p.argValue;
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(p);
	}
}

