package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int res;
		res = num;
		int i;
		int j;
		int ct;
		for (j = 0;;j++)
		{
			if (res < Math.pow(10.0,j + 1) && res >= Math.pow(10.0,j))
			{
				ct = j + 1;
				break;
				System.out.print(",");
			}
			else
			{
			}
		}
		int[] shuwei = new int[100];
		for (i = 1;i <= ct;i++)
		{
			shuwei[i - 1] = res % 10;
			res /= 10;
		}
		int ans = 0;
		for (i = 1;i <= ct;i++)
		{
			ans += shuwei[i - 1] * Math.pow(10.0,ct - i);
		}
		return ans;
	}
	public static int Main()
	{
		int i;
		int x;
		int ans;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x = Integer.parseInt(tempVar);
			}
			if (x != 0)
			{
				if (x > 0)
				{
					ans = reverse(x);
					System.out.printf("%d\n",ans);
				}
				else
				{
					ans = -reverse(-x);
					System.out.printf("%d\n",ans);
				}
			}
			else
			{
				System.out.print("0\n");
			}
		}
		return 0;
	}
}

