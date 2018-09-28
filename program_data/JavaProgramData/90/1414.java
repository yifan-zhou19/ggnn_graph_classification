package <missing>;

public class GlobalMembers
{
	public static int q(int m,int n)
	{
	 int c;
	 if (m < 0)
	 {
		 return 0;
	 }
	 if (n == 1)
	 {
		 return 1;
	 }
	 else
	 {
		 c = q(m, n - 1) + q(m - n, n);
	 }
	  return (c);
	}
	public static int Main()
	{
	 int t;
	 int i;
	 int k;
	 int n;
	 int m;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 t = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < t;i++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   n = Integer.parseInt(tempVar3);
	   }
	   k = q(m, n);
	   System.out.printf("%d\n",k);
	 }
	 System.in.read();
	 System.in.read();
	 System.in.read();
	}
}

