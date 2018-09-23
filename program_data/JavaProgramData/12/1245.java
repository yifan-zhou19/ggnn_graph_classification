package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????         **
	//*?????? 1200012839 **
	//*???2012.10.30   **
	//********************************

	public static int Main()
	{
		int[] a = new int[15];
		int value;
		while ((value != 0 && value != -1 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			a[0] = value;
			int i = 0;
			int count = 0;
			while (a[i] != 0)
			{
				i++;
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			for (int j = 0; j < i; j++)
			{

				for (int k = 0; k < i; k++)
				{
					if (a[j] == 2 * a[k])
					{
						count = count + 1;
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
		}

		while (value == -1)
		{
			break;
		}
		return 0;
	}
}

