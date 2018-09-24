package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int m;
		int k;
		int j;
		int[] a = new int[100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 k = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < 100;i++)
	 {
	   a[i] = 0;
	 }
	 for (j = 1;;j++)
	 {
		a[n] = j;
	  for (i = n - 1;i > 0;i--)
	  {
		  if ((a[i + 1] * n + k) % (n - 1) == 0)
		  {
		  a[i] = (a[i + 1] * n + k) / (n - 1);
		  }
	   else
	   {
		   break;
	   }
	  }
	  if (a[1] != 0)
	  {
		break;
	  }
	 }
	 m = a[1] * n + k;
	 System.out.printf("%d",m);
	}


}

