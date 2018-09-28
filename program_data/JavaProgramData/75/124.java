package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1005];
	public static int[] b = new int[1005];
	public static int[] tm = new int[1005];
	public static int Main()
	{
	  int n;
	  int t = 0;
	  int i;
	  int j;
	  int k = 0;
	  char m;
	  while (true)
	  {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a[++t] = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(null, 1);
	  if (tempVar2 != null)
	  {
		  m = tempVar2.charAt(0);
	  }
	  if (m == '\n')
	  {
		  break;
	  }
	  }
	  for (i = 1 ;i <= t;i++)
	  {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b[i] = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(null, 1);
		 if (tempVar4 != null)
		 {
			 m = tempVar4.charAt(0);
		 }
	  }
	  for (i = 1;i <= t;i++)
	  {
		 for (j = a[i];j < b[i];j++)
		 {
				 tm[j]++;
				 if (tm[j] > k)
				 {
					 k = tm[j];
				 }
		 }
	  }
	  System.out.printf("%d %d",t,k);
	 return 0;
	}
}

