package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int y;
	 int m;
	 int d;
	 int i;
	 int[] a = new int[13];
	  a[0] = 0;
	 int sum = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 y = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 m = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 d = Integer.parseInt(tempVar3);
	 }
	  a[1] = a[3] = a[5] = a[7] = a[8] = a[10] = a[12] = 31;
	 a[4] = a[6] = a[9] = a[11] = 30;
	 if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
	 {
	  a[2] = 29;
	 }
	  else
	  {
	  a[2] = 28;
	  }
	 for (i = 1;i < m;i++)
	 {
	  sum = sum + a[i];
	 }
	  sum = sum + d;
	 System.out.printf("%d",sum);
	 System.in.read();
	}

}

