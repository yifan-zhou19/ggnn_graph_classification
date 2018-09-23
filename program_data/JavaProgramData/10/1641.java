package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[25];
		int[] rem = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int MMax = 0;
		for (int i = 1; i < n; i++)
		{
			int max = 0;
			for (int j = i - 1; j >= 0; j--)
			{
				if (j < max)
				{
					break;
				}
				if (a[j] >= a[i] != 0 && rem[j] > max)
				{
					max = rem[j];
				}
			}
			rem[i] = max + 1;
			if (rem[i] > MMax)
			{
				MMax = rem[i];
			}
		}
		System.out.print(MMax);
		System.out.print("\n");
		return 0;
	}
}

