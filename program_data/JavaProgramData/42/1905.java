package <missing>;

public class GlobalMembers
{
	//*******************************
	//* ????????????   ** 
	//* ?????? 1300012948    ** 
	//* ???2013.10.31           ** 
	//*******************************
	public static int Main()
	{
		int n;
		int k;
		int p;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n - 1];
		for (int i = 0; i <= n - 1; i++) // ???????????
		{
			  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i <= n - 1;) // ???????????????????
		{
			  if (a[i] == k)
			  {
					  for (int m = i; m <= n - 1; m++)
					  {
							  a[m] = a[m + 1];
					  }
					  n--;
			  }
			  if (a[i] != k)
			  {
			  i++;
			  }
		}
		for (int i = 0; i <= n - 1; i++) // ???????????????????????
		{
				if (i < n - 1)
				{
				System.out.print(a[i]);
				System.out.print(" ");
				}
				else
				{
				System.out.print(a[i]);
				System.out.print("\n");
				}
		}
		return 0;
	}
}

