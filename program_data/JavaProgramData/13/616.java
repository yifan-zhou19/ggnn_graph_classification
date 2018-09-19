package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int[] a = new int[20000];
	  int[] b = new int[20000];
	  int i;
	  int j;
	  int k;
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
		  b[i] = a[i];
	  }
	  for (i = 0;i < n;i++)
	  {
		  for (j = i + 1;j < n;j++)
		  {
			  if (b[j] == a[i])
			  {
				  b[j] = 0;
			  }
		  }
	  }
	  System.out.printf("%d",b[0]);
	  for (i = 1;i < n;i++)
	  {
		if (b[i] != 0)
		{
			System.out.printf(" %d",b[i]);
		}
	  }
	}
}

