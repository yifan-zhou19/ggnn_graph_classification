package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????   **
	//*?????? 1200012837 **
	//*???2012.10.29  **
	//********************************

	public static int Main()
	{
		int i = 0;
		do
		{
			int[] a = new int[16];
			do
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				i++;
			}while (a[i - 1] != 0 && a[i - 1] != -1);

			if (a[i - 1] == 0)
			{
				int n = 0;
				for (int j = 0; j <= i - 2; j++)
				{
				for (int k = 1; k <= i - 2 - j; k++)
				{
					if (a[j] == a[j + k] * 2 || a[j + k] == a[j] * 2)
					{
						n++;
					}
				}
				}
				System.out.print(n);
				System.out.print("\n");
				i = 0;
			}
			if (a[0] == -1)
			{
				break;
			}
		}while (i != 1);

		return 0;
	}

}

