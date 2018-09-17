package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[50];
		  int[] f = new int[50];
		  int max;
		  int i;
		  int j;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[0] = Integer.parseInt(tempVar2);
		  }
		  f[0] = 1;
		  for (i = 1;i < n;i++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  a[i] = Integer.parseInt(tempVar3);
			  }
			  f[i] = 1;
		  }
		  for (i = 0;i < n;i++)
		  {
			  for (j = 0;j < i;j++)
			  {
				  if (a[j] >= a[i])
				  {
								 if (f[j] + 1 > f[i])
								 {
									 f[i] = f[j] + 1;
								 }
								 else
								 {
									 f[i] = f[i];
								 }
				  }
			  }
		  }
		  max = f[0];
		  for (i = 1;i < n;i++)
		  {
			  if (f[i] > max)
			  {
			  max = f[i];
			  }
		  }
		  System.out.printf("%d\n",max);
	}
}

