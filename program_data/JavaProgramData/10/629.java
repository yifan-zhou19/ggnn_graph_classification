package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[25];
		int i;
		int j;
		int[] a = new int[25];
		int n;
		int max;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s[i] = 1;
			max = 0;
			for (j = 0;j < i;j++)
			{
				if (a[j] >= a[i] != 0 && s[j] > max)
				{
					max = s[j];
				}
			}
			s[i] += max;
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (max < s[i])
			{
				max = s[i];
			}
		}
		System.out.print(max);
		return 0;
	}


}

