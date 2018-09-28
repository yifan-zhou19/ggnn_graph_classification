package <missing>;

public class GlobalMembers
{
	/*************************************************************************************************************
	* @file .cpp
	* @author ????
	* @date 
	* @description
	*         
	*/


	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		int[] a = new int[40];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 1;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < 40; j++)
			{
				a[j] = 2 * a[j];
			}
			for (s = 39;a[s] == 0; s--)
			{
				;
			}
			for (j = 0; j <= s; j++)
			{
				a[j + 1] += a[j] / 10;
				a[j] = a[j] % 10;
			}
		}
		for (s = 39;a[s] == 0; s--)
		{
			;
		}
		for (i = s; i >= 0; i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

