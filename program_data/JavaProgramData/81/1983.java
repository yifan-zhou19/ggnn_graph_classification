package <missing>;

public class GlobalMembers
{
	public static int f(int[][] b, int p, int q)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *s;
	 int s;
	 int i;
	 int t;
	 s = b;
	 if ((p >= 0) && (p <= 4) && (q >= 0) && (q <= 4))
	 {
	   for (i = 0;i <= 4;i++)
	   {
		 t = (s + p * 5 + i);
		 *(s + p * 5 + i) = *(s + q * 5 + i);
		 *(s + q * 5 + i) = t;
	   }
	   return 1;
	 }
	 else
	 {
		 return 0;
	 }
	}
	public static void Main()
	{
	 int f = new int(int b[5][5],int p,int q);
	 int m;
	 int n;
	 int[][] a = new int[5][5];
	 int j;
	 int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *r;
	 int r;
	 r = a;
	 for (j = 0;j <= 24;j++)
	 {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  r + j = Integer.parseInt(tempVar);
	  }
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 m = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 n = Integer.parseInt(tempVar3);
	 }
	 if (f(a, m, n) == 1)
	 {
	  for (j = 0;j <= 4;j++)
	  {
		for (k = 0;k <= 3;k++)
		{
		 System.out.printf("%d ",*(r + j * 5 + k));
		}
		System.out.printf("%d\n",*(r + j * 5 + 4));
	  }
	 }
	 else
	 {
	  System.out.print("error");
	 }
	}
}

