package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????   **
	//*?????? 1300012745 **
	//*???2013.10.31  **
	//********************************
	public static int Main()
	{
		int[] a = new int[16];
		int num;
		int i = 1;
		int j = 0;
		int k = 0;
		int l = 0;
		while ((a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			//a[15]={0};
			num = 0;
			//cin>>a[0];
			if (a[0] == -1)
			{
				break;
			}
			for (i = 1;i <= 15;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					break;
				}
			}
			for (j = 0;j <= 15;j++)
			{
				for (k = 0;k <= 15;k++)
				{
					if ((a[j] != 0) && (a[k] != 0) && (a[j] == 2 * a[k]))
					{
						num++;
					}
				}
			}
					for (l = 0;l <= 15;l++)
					{
						a[l] = 0;
					}
					System.out.print(num);
					System.out.print("\n");
		}
		return 0;
	}

}

