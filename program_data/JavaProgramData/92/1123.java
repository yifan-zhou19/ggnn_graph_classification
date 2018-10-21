package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		int k = 0;
		int high1 = 0;
		int high2 = 0;
		int low1;
		int low2;
		int win = 0;
		int lose = 0;
		int[] s = new int[1000];
		int[] t = new int[1000];
		int[] p = new int[100];
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			low1 = low2 = n - 1;
			high1 = high2 = 0;
			win = 0;
			lose = 0; //???????
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					t[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 0;i < n;i++) //????
			{
				for (j = 0;j < n - 1;j++)
				{
					if (s[j + 1] > s[j])
					{
						temp = s[j + 1];
						s[j + 1] = s[j];
						s[j] = temp;
					}
				}
			}

			for (i = 0;i < n;i++) //????
			{
				for (j = 0;j < n - 1;j++)
				{
					if (t[j + 1] > t[j])
					{
						temp = t[j + 1];
						t[j + 1] = t[j];
						t[j] = temp;
					}
				}
			}

			for (i = 0;i < n;i++)
			{
				if (t[high1] >= s[high2]) /*???????????????????????????????????????????
												?????????????????????????????*/
				{
					if (t[low1] >= s[low2])
					{
						if (t[high1] > s[low2])
						{
							lose++;
						}
						else if (t[high1] == s[low2])
						{
							;
						}
						else if (t[high1] < s[low2])
						{
							win++;
						}
						low2--;
						high1++;

					}
					else if (t[low1] < s[low2]) //???????????????????????????
					{
						low2--;
						low1--;
						win++;
					}
				}
				else if (t[high1] < s[high2])
				{
					high1++;
					high2++;
					win++;
				}
			}

			p[m++] = 200 * (win - lose); //????????
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < m;i++) //????
		{
			System.out.printf("%d\n",p[i]);
		}
		return 0;
	}
}

