package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 1;
		int j;
		int i;
		int k = 0;
		int n;
		int m;
		int[] a = new int[101001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1,j = 1;j <= n;j++)
		{

			   if (a[j] != m)
			   {
					a[i++] = a[j];
			   }


		}


		for (k = 1;k <= i - 1;k++)
		{
			if (k == 1)
			{
				System.out.print(a[k]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(a[k]);
			}
		}



		return 0;
	}


}

