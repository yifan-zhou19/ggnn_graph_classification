package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????   **
	//*?????? 1300012713 **
	//*???2013.10.30  **
	//********************************
	public static int Main()
	{
		int m; //??????m????????n??????num???a[15]
		int n;
		int num;
		int[] a = new int[15];
		while ((m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0) //???????
		{
			if (m == -1)
			{
				return 0; //????-1??????
			}
			else //???m????????
			{
				int n = 1;
				num = 0;
				a[0] = m;
				for (int i = 1; ; i++) //??????
				{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (a[i] == 0)
					{
						break; //????0?????????0
					}
					if (a[i] != 0)
					{
						n = n + 1;
					}
				}
				for (int j = 0; j <= n; j++) //????????
				{
					for (int k = j + 1; k <= n; k++)
					{
						if (a[j] == 2 * a[k] || a[k] == 2 * a[j])
						{
							num = num + 1; //????
						}
					}
				}
				System.out.print(num);
				System.out.print("\n");
			}
		}
	}




}

