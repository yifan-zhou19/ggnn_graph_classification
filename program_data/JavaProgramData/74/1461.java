package <missing>;

public class GlobalMembers
{
	public static int p1(int n)
	{
	  int i;
	  for (i = 2;i < n / 2;i++)
	  {
	   if (n % i == 0)
	   {
		   return 0;
	   }
	  }
	  return 1;
	}
	public static int p2(int n)
	{
	  int[] a = new int[10];
	  int m = -1;
	  while (n > 0)
	  {
		 a[++m] = n % 10;
		 n = n / 10;
	  }
	  int i = 0;
	  int j = m;
	  while (i <= j)
	  {
		 if (a[i] != a[j])
		 {
			 return 0;
		 }
		 i++;
		 j--;
	  }
	  return 1;
	}
	public static int Main()
	{
	  int m;
	  int n;
	  int i;
	  int f = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  for (i = m;i <= n;i++)
	  {
		 if (p1(i) != 0 && p2(i) != 0)
		 {
			 if (f == 0)
			 {
				 System.out.printf("%d",i);
				 f = 1;
			 }
			 else
			 {
				 System.out.printf(",%d",i);
			 }
		 }
	  }
	  if (f == 0)
	  {
		  System.out.print("no");
	  }
	}
}

