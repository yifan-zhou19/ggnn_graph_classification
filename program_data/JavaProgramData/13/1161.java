package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int N;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 N = Integer.parseInt(tempVar);
	 }
	 int[] a = new int[N];
	 int[] b = new int[N];
	 int i;
	 int j;
	 int k;
	 int n;
	 int m = 0;
	 int flag;
	 for (i = 0; i <= N; i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	 }
	 for (i = 0; i < N; i++)
	 {
	  flag = 1;
	  for (j = 1; j <= m; j++)
	  {
	   if (a[i] == b[j])
	   {
		flag = 0;
		break;
	   }
	  }
	   if (flag != 0)
	   {
		b[j] = a[i];
		m++;
	   }
	 }
	 System.out.printf("%d",b[1]);
	 for (i = 2; i <= m; i++)
	 {
	  System.out.printf(" %d",b[i]);
	 }
	}

}

