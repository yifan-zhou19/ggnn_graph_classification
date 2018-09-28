package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int t;
	int num;
	int[] a = new int[500];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	i = 1;
	j = 1;
	for (i = 1;i <= n;i++)
	{
		   num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   if (num % 2 != 0)
	   {
		   a[j] = num;
	   j++;
	   }
	} //????????????????a???
	for (i = 1;i <= j - 1;i++)
	{
	   for (k = 1;k <= j - 1 - i;k++)
	   {
		  if (a[k] > a[k + 1])
		  {
				 t = a[k];
			 a[k] = a[k + 1];
			 a[k + 1] = t;
		  } //?????
	   }
	}
	for (i = 1;i <= j - 2;i++)
	{
		 System.out.print(a[i]);
		 System.out.print(',');
	}
	System.out.print(a[j - 1]);
	System.out.print("\n");
	return 0;
	}
}

