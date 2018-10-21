package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int sum;
		int mid;
		int[] tian = new int[1001];
		int[] king = new int[1001];
		while ((n != 0 && n = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			sum = 0;
			for (i = 0;i < n;i++)
			{
				tian[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				king[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n - 1;i++)
			{
				for (j = n - 1;j > i;j--)
				{
					//??????
					if (tian[j] > tian[j - 1])
					{
						mid = tian[j],tian[j] = tian[j - 1],tian[j - 1] = mid;
					}
					if (king[j] > king[j - 1])
					{
						mid = king[j],king[j] = king[j - 1],king[j - 1] = mid;
					}
				}
			}
				for (i = 0,j = 0,n--,m = n;i <= n;i++,j++)
				{
					//????
					if (tian[i] > king[j])
					{
						sum += 200; //????
					}
					else if (tian[i] < king[j])
					{
						sum -= 200,i--,n--; //? i--???i??????n--????????????? suu-=200
					}
					else
					{
						while (tian[n] > king[m])
						{
							sum += 200,n--,m--; //???????????????????
						}
						if (n == i)
						{
							break; // n==i ?????????
						}
						else if (tian[n] == tian[i])
						{
							n--,i--;
						}
						else
						{
							sum -= 200,n--,i--; //????????????
						}
					}
				}
				System.out.print(sum);
				System.out.print("\n");
		}
		return 0;
	}
}

