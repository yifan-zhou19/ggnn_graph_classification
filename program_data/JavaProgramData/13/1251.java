package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int i;
		int j;
		for (i = 0 ; i < n ; i++)
		{
			  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
			System.out.print(a[0]);
		for (i = 1 ; i < n ; i++)
		{
				for (j = 0 ; j < i ; j++)
				{
					   if (a[j] == a[i])
					   {
						   break;
					   }
				}
					if (i == j) //?????????????????????
					{
						   System.out.print(" ");
						   System.out.print(a[i]);
					}
		}
			 return 0;
	}

}

