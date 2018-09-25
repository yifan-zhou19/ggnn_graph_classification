package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] Speed1 = new int[1001];
		int[] Speed2 = new int[1001];
		while ((n != 0 && n = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			int Answer = 0;
			for (int i = 0; i < n; i++)
			{
				Speed1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0; i < n; i++)
			{
				Speed2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(Speed1, Speed1 + n);
			sort(Speed2, Speed2 + n);
			int left1 = 0;
			int right1 = n - 1;
			int left2 = 0;
			int right2 = n - 1;
			while (left1 <= right1 != 0 && left2 <= right2)
			{
				if (Speed1[left1] == Speed2[left2])
				{
					if (Speed1[right1] > Speed2[right2])
					{
						Answer++;
						right1--;
						right2--;
					}
					else if (Speed1[right1] < Speed2[right2])
					{
						Answer--;
						left1++;
						right2--;
					}
					else
					{
						if (Speed1[left1] < Speed2[right2])
						{
							Answer--;
							left1++;
							right2--;
						}
						else
						{
							break;
						}
					}
				}
				else if (Speed1[left1] > Speed2[left2])
				{
					Answer++;
					left1++;
					left2++;
				}
				else
				{
					Answer--;
					left1++;
					right2--;
				}
			}
			System.out.print(Answer * 200);
			System.out.print("\n");
		}
	}

}

