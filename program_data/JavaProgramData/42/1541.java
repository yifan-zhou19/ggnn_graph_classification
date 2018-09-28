package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int[] b = new int[100002];
	 int i;
	 int k;
	 int m;
	 int j;
	 int m1;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b[i] = Integer.parseInt(tempVar2);
	  }
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 k = Integer.parseInt(tempVar3);
	 }
	 m = n;
	 for (i = 1;i <= n;i++)
	 {
	  if (b[i] == k)
	  {
		  m--;
	  }
	 }
	 m1 = m;
	 for (i = 1;i <= n;i++)
	 {
			if (b[i] != k)
			{
	   m1--;
			}
	  if (b[i] == k)
	  {
	   for (j = i;j <= n - 1;j++)
	   {
		b[j] = b[j + 1];
	   }
	   b[n] = k;
	   i = i - 1;
	  }
	  if (m1 == 0)
	  {
		  break;
	  }
	 }
	 for (i = 1;i <= n;i++)
	 {
	  if (b[i] != k && m != 1)
	  {
	   System.out.printf("%d ",b[i]);
	   m = m - 1;
	  }
	  else if (b[i] != k && m == 1)
	  {
	   System.out.printf("%d",b[i]);
	   break;
	  }
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 n = Integer.parseInt(tempVar4);
	 }
	 return 0;
	}
}

