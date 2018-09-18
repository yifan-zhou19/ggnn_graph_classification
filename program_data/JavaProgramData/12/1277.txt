package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????   **
	//*?????? 1200012988 **
	//*???2012.10.30  **
	//********************************


	public static int Main()
	{
		double[] a = new double[16];
		while ((a[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (a[0] == -1)
			{
				break;
			}
			else
			{
				int count = 0;
				int i = 0;
				do
				{
					i++;
					a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				}while (a[i] != 0);
				for (int j = 0; j < i - 1; j++)
				{
					for (int k = j + 1; k < i; k++)
					{
						if ((a[k] / a[j] == 2) || (a[j] / a[k] == 2))
						{
							count++;
						}
					}
				}
				System.out.print(count);
				System.out.print("\n");
			}
		}

		return 0;
	}

}

