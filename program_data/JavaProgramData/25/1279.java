package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????2?N??  **
	//*?????? 1300012946 **
	//*???2013.11.15  **
	//********************************
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			for (j = 0 ; j < 32 ; j++)
			{
				a[j] = 2 * a[j];
			}
			for (j = 0 ; j < 32 ; j++)
			{
				if (a[j] > 9)
				{
					a[j] -= 10;
					a[j + 1]++;
				}
			}
		}
		j = 31;
		while (a[j] == 0)
		{
			j--;
		}
		for (; j >= 0 ; j--)
		{
			System.out.print(a[j]);
		}
		return 0;
	}
}

