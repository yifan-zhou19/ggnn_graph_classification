package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int m;
	  int i;
	  int t;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  int[] p = new int[n];
	  int[] q = new int[n];
	  for (i = 0;i < n;i++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   p[i] = Integer.parseInt(tempVar3);
	   }
	   q[i] = i + 1;
	  }
	  q[n - 1] = 0;
	  q[n - m - 1] = n;
	  t = n - m;
	  while (true)
	  {
		System.out.printf("%d",p[t]);
		t = q[t];
		if (t == n)
		{
			break;
		}
		System.out.print(" ");
	  }
	 return 0;
	}


}

