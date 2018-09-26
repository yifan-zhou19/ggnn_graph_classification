package <missing>;

public class GlobalMembers
{
	public static int turn(tangible.RefObject<Integer> pt, int p, int q)
	{
		int y;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *t;
		int t;
		int j;
	 if (p >= 0 && p <= 4 && q >= 0 && q <= 4)
	 {
		 for (j = 0;j < 5;j++)
		 {
		 t = *(pt.argValue + p * 5 + j);
	 *(pt.argValue + p * 5 + j) = *(pt.argValue + q * 5 + j);
	 *(pt.argValue + q * 5 + j) = t;
	 y = 1;
		 }
	 }
	 else
	 {
		 y = 0;
	 }
	 return y;
	}
	public static void Main()
	{
		int[][] a = new int[5][5];
		int m;
		int n;
		int i;
		int[] pa = a;
	 for (i = 0;i < 25;i++)
	 {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 pa++ = Integer.parseInt(tempVar);
		 }
	 }
	 pa = a;
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 m = Integer.parseInt(tempVar3);
	 }
 tangible.RefObject<Integer> tempRef_pa = new tangible.RefObject<Integer>(pa);
	 if (turn(tempRef_pa, n, m) != 0)
	 {
		 pa = tempRef_pa.argValue;
		 for (i = 1;i <= 25;i++)
		 {
		 System.out.printf("%d",pa[+]);
		 if (i % 5 == 0)
		 {
			 System.out.print("\n");
		 }
		 else
		 {
			 System.out.print(" ");
		 }
		 }
	 }
	 else
	 {
		 pa = tempRef_pa.argValue;
		 System.out.print("error");
	 }
	}

}

