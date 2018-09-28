package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
	char b;
	int i;
	int j;
	int max;
	int second;
	int kai;
	int min;
	for (i = 1;i <= 300;i++)
	{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[i - 1] = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead(null, 1);
		   if (tempVar2 != null)
		   {
			   b = tempVar2.charAt(0);
		   }
		   if (b == '\n')
		   {
		   break;
		   }
	}
	max = a[0];
	min = a[0];
	for (j = 0;j <= i - 1;j++)
	{
					   if (a[j] >= max)
					   {
					   max = a[j];
					   }
					   if (a[j] < min)
					   {
					   min = a[j];
					   }
	}


	second = max;
	for (j = 0,kai = 0;j <= i - 1;j++)
	{
					   if (a[j] < max && a[j] >= min)
					   {
						   second = a[j];
					   min = second;
					   kai = 1;
					   }


	}

	if (kai == 0 || i == 1)
	{
	System.out.print("No");
	}
	else
	{
	System.out.printf("%d",second);
	}





		return 0;
	}

}

