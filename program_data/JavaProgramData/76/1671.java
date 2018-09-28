package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[max];
		int[] b = new int[max];
		int e;
		int f;
		int c = 0;
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
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
	  }
	  for (j = 1;j <= n;j++)
	  {
		  for (i = 0;i < n - j;i++)
		  {
			  if (a[i] >= a[i + 1])
			  {
				e = a[i + 1];
				a[i + 1] = a[i];
				a[i] = e;
			  }
		  }
	  }
	  for (j = 1;j <= n;j++)
	  {
		  for (i = 0;i < n - j;i++)
		  {
			  if (b[i] >= b[i + 1])
			  {
				  f = b[i + 1];
				  b[i + 1] = b[i];
				  b[i] = f;
			  }
		  }
	  }
	  for (i = 0;i < n - 1;i++)
	  {
		  if (a[i + 1] <= b[i])
		  {
			  c++;
		  }
	  }
	  if (c == n - 1)
	  {
		  System.out.printf("%d %d\n",a[0],b[n - 1]);
	  }
	  else
	  {
		  System.out.print("no\n");
	  }
	  return 0;
	}

}

