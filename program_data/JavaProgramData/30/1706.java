package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int j;
		int k;
		int[] left = {0, 0, 0, 0};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			k = i;
			j = 0;
					left[3] = k % 7;
			while (k != 0)
			{ //??????????????7
				left[j] = k % 10;
				k = k / 10;
				j++;
			}
			if (left[0] != 7 && left[1] != 7 && left[2] != 7 && left[3] != 0) //?????7???????sum?
			{
				sum += i * i;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

