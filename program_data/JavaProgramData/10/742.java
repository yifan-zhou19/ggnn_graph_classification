package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int k;
		  int i;
		  int max = 0;
		  int u;
		  int j;
		  int[] a = new int[26];
		  int[] b = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= k;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  }
		  for (i = 1;i <= k;i++)
		  {
		  b[i] = 1;
		  }
		  for (i = k - 1;i >= 1;i--)
		  {
		  for (j = i + 1;j <= k;j++)
		  {
			 if (a[j] <= a[i] != 0 && b[i] < b[j] + 1)
			 {
			 b[i] = b[j] + 1;
			 }
			 u = b[i];
		  }
		  }
		  for (i = 1;i <= k;i++)
		  {
		  max = (max >= b[i])?max:b[i];
		  }
		  System.out.printf("%d",max);
	}

}

