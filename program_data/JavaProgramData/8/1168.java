package <missing>;

public class GlobalMembers
{
	public static void output(int n, int m, int[] a, int[] b)
	{
	  int i;
	  System.out.printf("%d",a[0]);
	  for (i = 1;i < n;i++)
	  {
		  System.out.printf(" %d",a[i]);
	  }
	  for (i = 0;i < m;i++)
	  {
		  System.out.printf(" %d",b[i]);
	  }
	}
	public static void swap(int[] a, int i, int j)
	{
	   int temp;
	   temp = a[i];
	   a[i] = a[j];
	   a[j] = temp;
	}
	public static void quicksort(int[] a, int l, int r)
	{
	  int m;
	  int i;
	  int j;
	  i = l;
	  j = r;
	  m = a[i];
	  while (i <= j)
	  {
		 while ((a[i] < m) && (i < r))
		 {
			 i++;
		 }
		 while ((a[j] > m) && (j > l))
		 {
			 j--;
		 }
		 if (i <= j)
		 {
			swap(a, i, j);
			i++;
			j--;
		 }
	  }
	  if (i < r)
	  {
		  quicksort(a, i, r);
	  }
	  if (j > l)
	  {
		  quicksort(a, l, j);
	  }
	}
	public static void input()
	{
	  int i;
	  int n;
	  int m;
	  int[] a = new int[100];
	  int[] b = new int[100];
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
	  for (i = 0;i < n;i++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
	  }
	  for (i = 0;i < m;i++)
	  {
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  b[i] = Integer.parseInt(tempVar4);
		  }
	  }
	  quicksort(a, 0, n - 1);
	  quicksort(b, 0, m - 1);
	  output(n, m, a, b);
	}
	public static int Main()
	{
	  input();
	}
}

