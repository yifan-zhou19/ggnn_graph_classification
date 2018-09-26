package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int k;
		int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] p = new int[n];
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p[i] = Integer.parseInt(tempVar2);
	  }
	 }
	 for (i = 0;i < (n - 1);i++)
	 {
	  for (j = i + 1;j < n;j++)
	  {
		  if (p[i] < p[j])
		  {
			  k = p[i];
			  p[i] = p[j];
			  p[j] = k;
		  }
	  }
	 }
	 System.out.printf("%d\n%d",p[0],p[1]);

	}

}

