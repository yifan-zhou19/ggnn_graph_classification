package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	for (i = 0;i < n;i++)
	{
			int a;
			int b;
			int c;
			int d;
			d = 0;
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 b = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead(" ");
	 if (tempVar4 != null)
	 {
		 c = Integer.parseInt(tempVar4);
	 }
	 if ((a % 400 == 0) || (a % 100 != 0 && a % 4 == 0))
	 {
	 d = 1;
	 }
	 int[] A = new int[12];
	 A[0] = 31;
	 A[1] = 28;
	 A[2] = 31;
	 A[3] = 30;
	 A[4] = 31;
	 A[5] = 30;
	 A[6] = 31;
	 A[7] = 31;
	 A[8] = 30;
	 A[9] = 31;
	 A[10] = 30;
	 A[11] = 31;
	  int e;
	 if (b > c)
	 {
		 int t;
		 t = b;
		 b = c;
		 c = t;
	 }
	 e = c - b;
	 int f = 0;
	 int j;
	 if (d == 1)
	 {
	 A[1] = 29;
	 }
	 for (j = 0;j < e;j++)
	 {
		 f = f + A[b + j - 1];
	 }
	   if (f % 7 == 0)
	   {
	   System.out.print("YES\n");
	   }
	   else
	   {
	   System.out.print("NO\n");
	   }
	}
	return (0);
	}

}

