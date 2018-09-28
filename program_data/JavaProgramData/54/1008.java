package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
	   int apple = new int(int n,int k);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }
	   m = apple(n, k);
	   System.out.printf("%d",m);
	   return 0;
	}
	public static int apple(int n,int k)
	{
		int a;
		int s;
		int i;
		int j;
		 for (j = 1;;j++)
		 {
		 s = n * j + k;
		 for (i = 2;i < n + 1;i++)
		 {
			 if (s % (n - 1) != 0)
			 {
			 break;
			 }
			 s = s * n / (n - 1) + k;
			 if (i == n)
			 {
				  a = 1;
					   return s;
			 }
		 }
			 if (a == 1)
			 {
			 break;
			 }
		 }
	}
}

