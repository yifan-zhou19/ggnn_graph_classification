package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int[] a = new int[100000];
		  int[] b = new int[100000];
		  int[] c = new int[10000];
		  int i;
		  int j;
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;;i++)
		  {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 b[i] = Integer.parseInt(tempVar3);
			 }
			 if (a[i] == 0 && b[i] == 0)
			 {
			 break;
			 }
		  }
		  m = i;
		  for (i = 0;i < m;i++)
		  {
			 for (j = 0;j < n;j++)
			 {
				if (b[i] == j)
				{
				   c[j]++;
				   break;
				}
			 }
		  }
		  for (j = 0;;j++)
		  {
			 if (c[j] == n - 1)
			 {
				System.out.printf("%d",j);
				break;
			 }
			 if (j == n - 1)
			 {
				System.out.print("NOT FOUND");
			 }
		  }
		  return 0;
	}

}

