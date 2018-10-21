package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int q1;
		  int q2;
		  int q3;
		  int k = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  q1 = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  q2 = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  q3 = Integer.parseInt(tempVar3);
		  }
		  if ((q1 % 4 == 0 && q1 != 0 & 100 != 0) || q1 % 400 == 0)
		  {
			  k++;
		  }
		  int[] a = new int[15];
		  int[] b = new int[16];
		  if (k == 0)
		  {
			  a[2] = 28;
		  }
		  else
		  {
			  a[2] = 29;
		  }
		  a[1] = 31;
		  a[3] = 31;
		  a[4] = 30;
		  a[5] = 31;
		  a[6] = 30;
		  a[7] = 31;
		  a[8] = 31;
		  a[9] = 30;
		  a[10] = 31;
		  a[11] = 30;
		  a[12] = 31;
		  b[1] = 0;
		   for (int i = 2;i <= 12;i++)
		   {
		   b[i] = b[i - 1] + a[i - 1];
		   }
		   System.out.printf("%d",b[q2] + q3);
		   System.in.read();
		   System.in.read();
	}

}

