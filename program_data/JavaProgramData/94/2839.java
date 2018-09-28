package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	  int N;
	  int[] a = new int[500];
	  int[] b = new int[500];
	  int i;
	  int j;
	  int m;
	  int r;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  N = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < N;i++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = Integer.parseInt(tempVar2);
	   }
	  }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[N - 1] = Integer.parseInt(tempVar3);
	   }
	   for (j = 0,i = 0,m = 0;i < N;i++)
	   {
		if (a[i] != 2 && a[i] % 2 != 0)
		{
		 b[j] = a[i];
		 j++;
		 m++;
		}
	   }
	  for (i = 0;i < m;i++)
	  {
		for (j = m - 1;j > i;j--)
		{
		 if (b[j] < b[j - 1])
		 {
		  r = b[j];
		  b[j] = b[j - 1];
		  b[j - 1] = r;
		 }
		}
	  }
		System.out.printf("%d",b[0]);
		for (j = 1;j < m;j++)
		{
		 System.out.printf(",%d",b[j]);
		}
		 return 0;
	 }

}

