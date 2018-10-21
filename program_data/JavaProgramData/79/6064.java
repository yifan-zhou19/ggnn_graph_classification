package <missing>;

public class GlobalMembers
{
	//******************************************
	//*???????.cpp                     **
	//*??: ??     1100012808              **
	//*???2011.12.17                       **
	//******************************************
	public static int Main() //???
	{ //?????
		int[] flag = new int[301];
		int i;
		int n;
		int j = 0;
		int m;
		int count;
		int k;
		int t;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(flag, 0, (Integer.SIZE / Byte.SIZE));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = 0;
			if (m == 0 && n == 0)
			{
				break;
			}
			if (m == 1)
			{
				System.out.print(n);
				System.out.print("\n");
				continue;
			}
			for (i = 1; i <= n; i++)
			{
				count = 0;
				if (flag[i] == 0)
				{
					j++;
					if (j == m)
					{
						j = 0;
						flag[i] = 1;
					}
				}
				if (i == n)
				{
					i = 0;
					for (k = 1; k <= n; k++)
					{
						if (flag[k] == 0)
						{
							count++;
							t = k;
						}
					}
					if (count == 1)
					{
						break;
					}
				}
			}
			System.out.print(t);
			System.out.print("\n");
		}
		return 0;
	} //?????

}

