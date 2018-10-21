package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int m;
	int k;
	int[] a = new int[100000];
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
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  m = Integer.parseInt(tempVar3);
	  }

	  for (i = n - 1;i >= 0;i--)
	  {
		 if (a[i] == m)
		 {
			 for (k = i;k < n;k++)
			 {
				a[k] = a[k + 1];

			 }
			n = n - 1;
		 }

	  }

	  for (i = 0;i < n;i++)
	  {
		  if (i < n - 1)
		  {

			   System.out.printf("%d ",a[i]);
		  }
		else
		{
			System.out.printf("%d",a[i]);
		}

	  }

	  return 0;

	}

}

