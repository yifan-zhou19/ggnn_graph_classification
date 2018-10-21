package <missing>;

public class GlobalMembers
{
	//********************************
	//*???n-gram????   **
	//*?????? 1300012713 **
	//*???2013.12.11  **
	//********************************
	public static int Main()
	{
		int n; //???????n,????num,??????max,??????ge
		int num = 1;
		int max = 1;
		int ge = 1;
		int flag = 1;
		String str = new String(new char[505]); //???str,??gram??????d
		char[][] a = new char[500][5];
		char[][] d = new char[500][5];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int c = str.length(); //??c???????
		for (int i = 0; i <= c - n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				a[i][j] = (str.Substring(i) + j); //?????????
			}
			a[i][n] = '\0'; //?????
		}
		for (int k = 0; k <= c - n; k++)
		{
			if (strcmp(a[k], "0000") == 0) //????? ??
			{
				continue;
			}
			for (int l = 1; l < c - n - k + 1; l++)
			{
				if (strcmp(a[k],a[k + l]) == 0) //??????
				{
					num++;
					a[k + l] = "0000";
				}
			}
			if (num > max) //?????????
			{
				ge = 1;
				max = num;
				d[ge] = a[k];
				flag = 0;

			}
			if (num == max && flag == 1) //???????????
			{
				ge++;
				d[ge] = a[k];
			}
			flag = 1; //???????
			num = 1;
		}
		if (max == 1) //?????????1???? NO
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		System.out.print(max);
		System.out.print("\n");
		for (int p = 1; p <= ge; p++)
		{
			System.out.print((d + p));
			System.out.print("\n");
		}
		return 0;
	}
}

