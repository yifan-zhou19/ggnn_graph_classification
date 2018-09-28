package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] sz = new int[10];
	  int[] a = new int[10];
	  int i;
	  int b;
	  double j;
	  double k;
	  double GPA;
	  j = 0;
	  k = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  sz[i] = Integer.parseInt(tempVar2);
		  }
		  k = k + sz[i];
	  }
	  for (i = 0;i < n;i++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
		  if (a[i] >= 90 && a[i] <= 100)
		  {
			  j = j + 4.0 * sz[i];
		  }
		  if (a[i] >= 85 && a[i] <= 89)
		  {
			  j = j + 3.7 * sz[i];
		  }
		  if (a[i] >= 82 && a[i] <= 84)
		  {
			  j = j + 3.3 * sz[i];
		  }
		  if (a[i] >= 78 && a[i] <= 81)
		  {
			  j = j + 3.0 * sz[i];
		  }
		  if (a[i] >= 75 && a[i] <= 77)
		  {
			  j = j + 2.7 * sz[i];
		  }
		  if (a[i] >= 72 && a[i] <= 74)
		  {
			  j = j + 2.3 * sz[i];
		  }
		  if (a[i] >= 68 && a[i] <= 71)
		  {
			  j = j + 2.0 * sz[i];
		  }
		  if (a[i] >= 64 && a[i] <= 67)
		  {
			  j = j + 1.5 * sz[i];
		  }
		  if (a[i] >= 60 && a[i] <= 63)
		  {
			  j = j + 1.0 * sz[i];
		  }
		  if (a[i] < 60)
		  {
			  j = j + 0 * sz[i];
		  }
	  }
	  GPA = j / k;
	  System.out.printf("%.2lf",GPA);
		return 0;
	}
}

