package <missing>;

public class GlobalMembers
{
	//********************************
	//*????1.cpp   **
	//*?????? 1300012966 **
	//*???2013.10.30  **
	//*?????   **
	//********************************
	public static int Main()
	{
		int[] a = new int[17];
		int i;
		int j;
		int k;
		int n;
		a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a[1] != -1)
		{
			n = 0;
			i = 1;
			while (a[i] != 0)
			{
				i++;
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = 1; j <= i; j++)
			{
				for (k = 1; k <= i; k++)
				{
					if (a[j] == a[k] * 2)
					{
						n++;
					}
				}
			}
			n = n - 1;
			System.out.print(n);
			System.out.print("\n");
			a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}



}

