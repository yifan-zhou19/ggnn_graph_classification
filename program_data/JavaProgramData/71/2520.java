package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int[] a = new int[200];
		  int[] b = new int[200];
		  int[] c = new int[200];
		  int[] d = new int[13];
		  int j;
		  int min;
		  int max;
		  int s;
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
				 a[i] = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 b[i] = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead(" ");
			 if (tempVar4 != null)
			 {
				 c[i] = Integer.parseInt(tempVar4);
			 }
		  }
		  d[1] = 31;
		  d[3] = 31;
		  d[4] = 30;
		  d[5] = 31;
		  d[6] = 30;
		  d[7] = 31;
		  d[8] = 31;
		  d[9] = 30;
		  d[10] = 31;
		  d[11] = 30;
		  d[12] = 31;
		  for (i = 0;i < n;i++)
		  {
		  if ((a[i] % 400 == 0) || (a[i] % 4 == 0 && a[i] % 100 != 0))
		  {
			   d[2] = 29;
		  }
		  else
		  {
			   d[2] = 28;
		  }
		   s = 0;
		 if (b[i] > c[i])
		 {
			 min = c[i];
			  max = b[i];
		 }
		 else
		 {
			  min = b[i];
			  max = c[i];
		 }
		  for (j = min;j < max;j++)
		  {
			  s = s + d[j];
		  }
		 if (s % 7 == 0)
		 {
		  System.out.print("YES\n");
		 }
		  else
		  {
		  System.out.print("NO\n");
		  }
		  }





		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

