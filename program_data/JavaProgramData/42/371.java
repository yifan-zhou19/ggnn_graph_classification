package <missing>;

public class GlobalMembers
{
	/*
	 *????????????
	 *?????
	 *??: 2010-11-4
	 */

	public static int Main()
	{
		int[] a = new int[100000]; //????????
		int i;
		int j;
		int n;
		int k;
		int p;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //?????????
		{
		  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0,p = 0;p < n - 1;p++)
		{ //???n-1???
			if (a[i] == k) //?????k
			{
				for (j = i;j < n - 1;j++) //?????
				{
					a[j] = a[j + 1];
				}
			}
			else
			{
				i++; //??????k???+1
			}
		}
		  if (i == 0)
		  {
			  if (a[i] != k)
			  {
				  System.out.print(a[i]);
			  }
		  }
		  if (i == 1)
		  {
			  System.out.print(a[0]);
			  if (a[i] != k)
			  {
				  System.out.print(" ");
				  System.out.print(a[i]);
			  }
		  }
		  if (i > 1)
		  {
			  System.out.print(a[0]);
			  for (q = 1;q < i;q++)
			  {
				  System.out.print(" ");
				  System.out.print(a[q]);
			  }
			  //??????n-1??????k??
			  if (a[i] != k)
			  {
				  System.out.print(" ");
				  System.out.print(a[i]);
			  }
		  } //????????
		return 0;
	}
}

