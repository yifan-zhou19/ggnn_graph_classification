package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

	int n;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	int[] a = new int[n];
	int[] b = new int[n];

	int i;

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

	int k;

	int p;
	int q;

	for (k = 1;k < n;k++)
	{

	  for (i = 0;i < n - k;i++)
	  {

		if (a[i] > a[i + 1])
		{

		   p = a[i];

		   q = b[i];

		   a[i] = a[i + 1];

		   b[i] = b[i + 1];

		   a[i + 1] = p;

		   b[i + 1] = q;
		}
	  }
	}

	int m;
	int t;

	m = a[0];

	t = b[0];

	for (i = 1;i < n;i++)
	{

	  if (a[i] <= t != 0 && b[i]> t)
	  {

		t = b[i];

	  }

	   else if (a[i] > t)
	   {

		   System.out.print("no\n");

		   return 0;

	   }

	}

	System.out.printf("%d %d",m,t);

	return 0;

	}


}

