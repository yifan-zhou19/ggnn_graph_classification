package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????  **
	//*?????? 1300012946 **
	//*???2013.10.30  **
	//********************************
	public static int Main()
	{
		while (true)
		{
			int[] a = new int[16];
			int i;
			int j;
			int p;
			int k;
			int l;
			int num = 0;
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == -1)
			{
				break;
			}
			for (i = 1 ; i <= 16 ; i++) //?????????????
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					break;
				}
			}
			while (a[0] != 0) //???????????????????????
			{ //??0??a[0]?
				for (j = 0 ; j < i ; j++)
				{
					if (a[j] > a[j + 1])
					{
						p = a[j];
						a[j] = a[j + 1];
						a[j + 1] = p;
					}
				}
			}
			for (k = 1 ; k <= i - 1 ; k++) //??????????????????????
			{
				for (l = k ; l <= i ; l++)
				{
					if (2 * a[k] == a[l])
					{
						num++;
					}
					if (2 * a[k] < a[l])
					{
						break;
					}
				}
			}
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}

}

