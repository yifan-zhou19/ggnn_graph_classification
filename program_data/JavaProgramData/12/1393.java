package <missing>;

public class GlobalMembers
{
	//********************************
	//*????? **
	//*?????? 1300062706 **
	//*???2013.10.30**
	//********************************
	public static int Main()
	{
		int[] a = new int[16];
		int num;
		int i;
		int j;
		int k;
		int n;
		int cnt = 0;
		while ((num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (num == -1)
			{
				break;
			}
			for (i = 0;i <= 15;i++)
			{
				if (num == 0)
				{
					break;
				}
				a[i] = num;
				num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = 0;j < i - 1;j++)
			{
				for (k = 1;k < i - j;k++)
				{
					if ((a[j] == 2 * a[j + k]) || (a[j + k] == 2 * a[j]))
					{
						cnt++;
					}
				}
			}
			System.out.print(cnt);
			System.out.print("\n");
			cnt = 0;
		}
		return 0;
	}






}

