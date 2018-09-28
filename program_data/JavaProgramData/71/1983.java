package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] m = new int[12];
	 int a;
	 int b;
	 int c;
	 int d;
	 int i;
	 int sum;
	 int r;
	 int s;
	 m[0] = 0;
	 m[1] = 31;
	 m[2] = 28;
	 m[3] = 31;
	 m[4] = 30;
	 m[5] = 31;
	 m[6] = 30;
	 m[7] = 31;
	 m[8] = 31;
	 m[9] = 30;
	 m[10] = 31;
	 m[11] = 30;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 r = Integer.parseInt(tempVar);
	 }
	 for (s = 0;s < r;s++)
	 {
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
	 sum = 0;
	 if (b > c)
	 {
		 d = b;
		 b = c;
		 c = d;
	 }
	 for (i = b;i < c;i++)
	 {
		 sum = sum + m[i];
	 }
	 if (b < 3)
	 {
		  if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0))
		  {
			  sum = sum + 1;
		  }
	 }
	 if ((sum % 7) == 0)
	 {
		 System.out.print("YES\n");
	 }
	 else
	 {
		 System.out.print("NO\n");
	 }
	 }
	 return 0;
	}

}

