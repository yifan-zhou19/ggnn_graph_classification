package <missing>;

public class GlobalMembers
{
	//********************************
	//*�y3�?o&#188;&#198;&#203;&#227;2?&#196;N?&#206;�&#189;           **
	//*��&#213;&#223;?o�&#245;&#197;&#244;�� 1300013007      **
	//*�&#188;&#228;?o2013.11.15             **
	//********************************
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int len;
		int[] num = new int[110];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("1");
		}
		else
		{
			num[0] = 1;
			len = 1;
			for (i = 1; i <= n; i++)
			{
				for (k = 0; k < len; k++)
				{
					num[k] *= 2;
				}
				for (l = 0; l < len; l++)
				{
					if (num[l] >= 10)
					{
						num[l + 1] += num[l] / 10;
						num[l] %= 10;
					}
				}
				if (num[len] != 0)
				{
					len++;
				}

			}
			for (j = len - 1 ;j >= 0; j--)
			{
				System.out.print(num[j]);
			}
		}
		return 0;
	}

}

