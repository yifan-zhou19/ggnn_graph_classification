package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
	 int i;
	 int[] a = new int[300];
	 int k = n;
		for (i = 0;i < n;i++)
		{
	  a[i] = 0;
		}
	 int j = 1;
	 for (i = 0;i < n;i = (i + 1) % n)
	 {
	  if (a[i] != 0)
	  {
	   continue;
	  }
	  if (j++==m)
	  {
	   a[i] = 1;
	   k--;
	   j = 1;
	  }
	  if (k == 0)
	  {
	   return i + 1;
		  break;
	  }
	 }

	}
	public static int Main()
	{
	 int m;
	 int n;
	 int i;
	 int[] a = new int[1000];
	 int num = 0;
	 for (i = 0;;i++)
	 {
		  if (m == 0 && n == 0)
		  {
			 break;
		  }
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
		 if (m == 0 && n == 0)
		 {
			 break;
		 }
		 a[i] = f(m, n);
		 num++;
	 }
	 for (i = 0;i < num;i++)
	 {
		 System.out.printf("%d\n",a[i]);
	 }
	 return 0;
	}

}

