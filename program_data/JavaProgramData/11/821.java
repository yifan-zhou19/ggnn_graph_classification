package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[12];
		  int[] b = new int[100000];
		  int c;
		  int d;
		  int e;
		  int i;
		  int s;
		  int t = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  d = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  e = Integer.parseInt(tempVar3);
		  }
		  if (c % 4 != 0 || (c % 100 == 0 && c % 400 != 0))
		  {
		  a[0] = 31;
		  a[1] = 28;
		  a[2] = 31;
		  a[3] = 30;
		  a[4] = 31;
		  a[5] = 30;
		  a[6] = 31;
		  a[7] = 31;
		  a[8] = 30;
		  a[9] = 31;
		  a[10] = 30;
		  a[11] = 31;
		  for (i = 0;i < d - 1;i++)
		  {
		  t = t + a[i];
		  }
		  s = t + e;
		  }
		  else
		  {
		  a[0] = 31;
		  a[1] = 29;
		  a[2] = 31;
		  a[3] = 30;
		  a[4] = 31;
		  a[5] = 30;
		  a[6] = 31;
		  a[7] = 31;
		  a[8] = 30;
		  a[9] = 31;
		  a[10] = 30;
		  a[11] = 31;
		  for (i = 0;i < d - 1;i++)
		  {
		  t = t + a[i];
		  }
		  s = t + e;
		  }
		  System.out.printf("%d",s);
		  System.in.read();
		  System.in.read();
	}

}

