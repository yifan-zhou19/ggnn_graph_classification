package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] n = new int[10000];
	 int[] m = new int[10000];
	 int i;
	 int x;
	 int y;
	 int j;
	 int k;
	 int p;
	 int[] a = new int[300];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n[0] = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 m[0] = Integer.parseInt(tempVar2);
	 }
	 for (x = 1;n[x - 1] + m[x - 1] > 0;x++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  n[x] = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  m[x] = Integer.parseInt(tempVar4);
	  }
	 }
	 for (y = 0;y < x - 1;y++)
	 {


	 for (i = 1;i <= n[y];i++)
	 {
	  a[i] = i;
	 }
	 j = 1;
	 for (k = n[y];k > 1;k--)
	 {
	  p = m[y] % k;
	  j = j + p - 1;
	  if (j >= k)
	  {
	   j = j % k;
	  }
	  if (j > 0)
	  {
	   for (i = j;i < k;i++)
	   {
	   a[i] = a[i + 1];
	   }
	  }
	  else
	  {
	   j++;
	  }
	 }
	 System.out.printf("%d\n",a[1]);

	 }
	 System.in.read();
	 System.in.read();
	 return 0;
	}

}

