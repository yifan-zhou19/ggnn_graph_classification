package <missing>;

public class GlobalMembers
{
	//****************************************
	//*?????                           **
	//*?????? 1100012763              **
	//*???2011.10.20                     **
	//****************************************
	public static int Main()
	{
		int i; //count??????????ans???
		int j;
		int t;
		int count;
		int ans;
		int[] num = new int[17];

		while (true) //?????????-1?break
		{
			i = 1;
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num[i] == -1)
			{
				break;
			}
			ans = 0;
			do //???????????0
			{
				i++;
				num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			} while (num[i] != 0);
			count = i - 1; //0??????

			for (i = 1; i <= count - 1; i++) //????????????????
			{
				for (j = 1; j <= count - i; j++)
				{
					if (num[j] > num[j + 1])
					{
						t = num[j];
						num[j] = num[j + 1];
						num[j + 1] = t;
					}
				}
			}

			for (i = 1; i <= count - 1; i++) //??
			{
				for (j = i + 1; j <= count; j++)
				{
					if (num[i] * 2 == num[j]) //??2??ans+1???????
					{
						ans++;
						break;
					}
					else
					{
						if (num[i] * 2 < num[j]) //????2???????????2????????????
						{
							break;
						}
					}
				}
			}

			System.out.print(ans);
			System.out.print("\n");
		}

		return 0;
	}

}

