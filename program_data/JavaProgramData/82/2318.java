package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int m;
	 int i;
	 int j;
	 int f;
	 int e;
	 int d;
	 int k;
	 int[] q = new int[10000];
	 int[] p = new int[10000];
	 e = 0;
	 k = 0;
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
			 q[i] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 p[i] = Integer.parseInt(tempVar3);
		 }
		 if (q[i] <= 140 && q[i] >= 90 && p[i] >= 60 && p[i] <= 90)
		 {
			 e++;
		 }
		 else
		 {
			 e = 0;
		 }
		 if (k < e)
		 {
			 k = e;
		 }
	 }



	System.out.printf("%d",k);


	 return 0;
	}


}

