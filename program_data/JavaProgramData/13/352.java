package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{ //????
		  for (j = i + 1;j < n;j++)
		  {
			  if (a[j] == a[i])
			  { //????????
				  for (k = j;k < n;k++)
				  {
					  a[k] = a[k + 1];
				  }
				  j--;
				  n--; //??????????
			  }
		  }
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[i]);
		return 0;
	}
}

