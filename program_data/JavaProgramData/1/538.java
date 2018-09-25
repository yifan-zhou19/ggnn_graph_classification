package <missing>;

public class GlobalMembers
{
	public static int reek(int i,int j)
	{
		int k;
		int g = 0;
		for (k = j;k < i;k++)
		{
			if ((i % k == 0) && (k != 1))
			{
				g = 1;
				break;
			}
			else
			{
				continue;
			}
		}
		if (g == 0)
		{
			return 1;
		}
		else
		{
			int num = 1;
			for (k = j;k <= Math.sqrt(i);k++)
			{
				if ((i % k == 0) && (k != 1))
				{
					num += reek(i / k, k);
				}
				else
				{
					continue;
				}
			}
			return num;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(reek(a[n], 1));
			System.out.print("\n");
		}
		return 0;
	}



}

