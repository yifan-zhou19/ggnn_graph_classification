package <missing>;

public class GlobalMembers
{
	//********************************
	//*????5.cpp   **
	//*?????? 1300012966 **
	//*???2013.11.14  **
	//*?????2?N??   **
	//********************************
	public static int Main()
	{
		int N;
		int i;
		int j;
		int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] b = new int[32];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= N; i++)
		{
			for (j = 0; j < 32; j++)
			{
				b[j] = a[j] * 2;
			}
			a[0] = b[0] % 10;
			for (j = 1; j < 32; j++)
			{
				a[j] = b[j] % 10 + b[j - 1] / 10;
			}
		}
		j = 31;
		while (a[j] == 0)
		{
			j--;
		}
		for (i = j; i >= 0; i--)
		{
			System.out.print(a[i]);
		}
		return 0;
	}








}

