package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	  int k;
	  for (k = 0;;k++)
	  {
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n == 0)
	  {
	  return 0;
	  }
	  int[] a = new int[1000]; //??????
	  int[] b = new int[1000]; //??????
	  int i;
	  int j;
	  int d = 0;
	  int max = (-n) * 200;
	  for (i = 0;i < n;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	  }
	  for (i = 0;i < n;i++)
	  {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b[i] = Integer.parseInt(tempVar3);
	  }
	  }
	  int t;
	  for (i = 0;i < n;i++) //????
	  {
	   for (j = n - 1;j > i;j--)
	   {
		if (a[j] > a[j - 1])
		{
	  t = a[j];
	  a[j] = a[j - 1];
	  a[j - 1] = t;
		}
		if (b[j] > b[j - 1])
		{
	  t = b[j];
	  b[j] = b[j - 1];
	  b[j - 1] = t;
		}
	   }
	  }
	  for (i = 0;i < n;i++)
	  {
	   for (j = 0;j < n;j++)
	   {
		if (a[(j + i) % n] > b[j])
		{
		d++;
		}
		if (a[(j + i) % n] < b[j])
		{
		d--;
		}
	   }
	   if (d > max)
	   {
	   max = d;
	   }
	   d = 0;
	  }
	  System.out.printf("%d\n",max * 200);
	  }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();





	 }

}

