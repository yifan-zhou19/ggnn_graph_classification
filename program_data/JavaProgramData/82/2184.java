package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j = 0;
	int k;
	int n;
	int m = 0;
	int e;
	int[] sh = new int[3000];
	int[] a = new int[3000];
	int[] b = new int[3000];
	int[] c = new int[3000];




	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	for (i = 0;i < 3000;i++)
	{
		sh[i] = 0;
		 c[i] = 0;

	}


	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	}

	for (i = 0;i < n;i++)
	{

		   if (a[i] >= 90 && a[i] <= 140 && b[i] <= 90 && b[i] >= 60)
		   {
			 sh[i] = 1;


		   }



	}

	for (i = 0,k = 0;i < n;i++)
	{
		if (sh[i] == 1)
		{
			c[k]++;



		}
		if (sh[i] == 0)
		{
			k++;



		}
	}
	e = 0;
		for (i = 0;i < n;i++)
		{
			if (e < c[i])
			{
			   e = c[i];

			}
		}




	System.out.printf("%d",e);

	return 0;
	}
}

