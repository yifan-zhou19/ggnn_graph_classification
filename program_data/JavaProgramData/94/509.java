package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

	int[] a = new int[500];

	int i;
	int N;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}

	for (i = 0;i < N;i++)
	{

			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Integer.parseInt(tempVar2);
			 }

	}

	int[] b = new int[500];

	int j = 0;

	for (i = 0;i < N;i++)
	{

			 if (a[i] % 2 != 0)
			 {

					   b[j] = a[i];

					   j++;

			 }
			 if (a[i] % 2 == 0)
			 {

					   j = j;

			 }



	}

	int k;
	int t;

	for (k = 0;k < j - 1;k++)
	{

			 for (i = 0;i < j - 1 - k;i++)
			 {

					   if (b[i] > b[i + 1])
					   {

								t = b[i];

						   b[i] = b[i + 1];

								b[i + 1] = t;

					   }

			 }

	}
	for (i = 0;i < j - 1;i++)
	{

			 System.out.printf("%d,",b[i]);

	}



	System.out.printf("%d",b[j - 1]);



		return 0;

	}


}

