package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		while (true)
		{
			int[] tian = new int[1000];
			int[] qi = new int[1000];
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				break;
			}
			for (int i = 0; i < n; i++)
			{
				tian[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0; i < n; i++)
			{
				qi[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(tian,tian + n);
			sort(qi,qi + n);
			int ans = 0;
			int tianbig = n - 1;
			int tiansmall = 0;
			int qibig = n - 1;
			int qismall = 0;
			while (n-- != 0)
			{
				if (tian[tianbig] > qi[qibig])
				{
					tianbig--;
					qibig--;
					ans += 200;
				}
				else if (tian[tiansmall] > qi[qismall])
				{
					qismall++;
					tiansmall++;
					ans += 200;
				}
				else
				{
					if (qi[qibig] > tian[tiansmall])
					{
						ans -= 200;
					}
					tiansmall++;
					qibig--;
				}
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}


}

