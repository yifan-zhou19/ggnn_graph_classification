package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int j;
	 int[] rec = new int[25];
	 int[] n = new int[25];
	 int m;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i <= k - 1;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  rec[i] = Integer.parseInt(tempVar2);
	  }
	  n[i] = 1;
	 }
	 for (i = 1;i <= k - 1;i++)
	 {
	  for (j = 0;j < i;j++)
	  {
	   if (rec[j] >= rec[i])
	   {
		n[i] = n[i] > (n[j] + 1)?n[i]:n[j] + 1;
	   }
	  }
	 }
	 m = 0;
	 for (i = 0;i < k;i++)
	 {
	  m = m > n[i] != 0?m:n[i];
	 }
	 System.out.printf("%d\n",m);
	}


}

