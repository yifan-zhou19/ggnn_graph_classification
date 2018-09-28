package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int[] a = new int[200];
	  int m;
	  int n;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
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
		 //?????
		for (i = n - 1 + m;i >= m;i--)
		{
			a[i] = a[i - m];
		}
		for (i = 0;i < m;i++)
		{
			a[i] = a[n + i];
		}
		  System.out.printf("%d",a[0]);
		  for (i = 1;i < n;i++)
		  {
			  System.out.printf(" %d",a[i]);
		  }
		  System.out.print("\n");


	}
}

