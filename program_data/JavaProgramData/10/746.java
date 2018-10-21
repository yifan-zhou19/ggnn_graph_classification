package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[26]; //f[i]????i+1?????????????
		  int[] f = new int[26];
		  int i;
		  int j;
		  int k;
		  int n;
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
							  a[i] = Integer.parseInt(tempVar2);
						  }
		  }
		  for (i = 0;i < n;i++)
		  {
						  f[i] = 1;
		  }
		  for (i = 1;i < n;i++)
		  {
						  for (j = i - 1;j >= 0;j--)
						  {
											if (a[j] >= a[i] != 0 && f[j] + 1 > f[i])
											{
											f[i] = f[j] + 1;
											}
						  }
		  }
		  k = 0;
		  for (i = 0;i < n;i++)
		  {
						  if (f[i] > k)
						  {
						  k = f[i];
						  }
		  }
		  System.out.printf("%d",k);
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}
}

