package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[10001];
	 int[] b = new int[10001];
	 int i;
	 int j;
	 int n;
	 int z = 0;
	 int x;
	 int y = 0;
	 int ma;
	 int mb;
	 int c;
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
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b[i] = Integer.parseInt(tempVar3);
	  }
	 }
	 ma = a[0];
	 mb = b[0];
	 for (i = 1;i < n;i++)
	 {
	  if (a[i] < ma)
	  {
	   ma = a[i];
	  }
	  if (b[i] > mb)
	  {
	   mb = b[i];
	  }
	 }
	 c = mb - ma;
	// printf("%d\n",c);

	 for (x = ma;x <= mb;x++)
	 {
	  for (j = 0;j < n;j++)
	  {
	  z = 1;
	   if (x + 0.5 <= b[j] != 0 && x + 0.5 >= a[j])
	   {
	   break;
	   }
	   else
	   {
		   z = 0;
	   }
	  }
	  y = y + z;
	 }
	// printf("%d\n",y);

	 if (y == c)
	 {
	  System.out.printf("%d %d",ma,mb);
	 }
	 else
	 {
	  System.out.print("no");
	 }

	 scanf(" ");
	 return 0;
	}

}

