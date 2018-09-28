package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
		  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] a = new int[n];
	int x;
	int y;
	int sum;
		   sum = 0;
	int i;
	int j;
	int m;
	  for (i = 0;i < n;i++)
	  {
	  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  for (j = 0;j < n - 1;j++)
	  {

	  for (m = j + 1;m < n;m++)
	  {
		  x = a[j] + a[m];
	if (x == k)
	{
	   y = 1;
	}
	else
	{
	   y = 0;
	}
	   sum = sum + y;


	  }
	  }





	if (sum == 0)
	{
	   System.out.print("no");
	}
	else
	{
	   System.out.print("yes");
	}

	return 0;























	}
}

