package <missing>;

public class GlobalMembers
{
	//?????????????
	//????????
	//?????2011?10?27?

	public static int Main() //?????
	{
	   int j;
	   int n;
	   int k;
	   int i;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[] a = new int[100000];
	   for (i = 0;i < n;i++)
	   {
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int t = 0;
	   for (i = 0;i < n - t;) //?i??n-??????
	   {
	if (a[i] == k)
	{ //????????
	for (j = i;j < n - t;j++)
	{
	a[j] = a[j + 1]; //??
	}
	t++; //????????????i
	}
	else
	{
	 i++; //?????????
	}
	   }
	for (int i = 0;i < n - t - 1;i++)
	{
	 System.out.print(a[i]);
	 System.out.print(" ");
	}
	   System.out.print(a[n - t - 1]);
	   return 0;
	}

}

