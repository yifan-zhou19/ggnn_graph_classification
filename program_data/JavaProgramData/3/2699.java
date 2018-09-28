package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??????????n?k???????
		int k;
		int i;
		int[] num = new int[1000];
		int g = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for ((num[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			; //?????????n??????????
		}
		for (i = 0;i < n - 1;i++)
		{
			for (int m = i + 1;m < n;m++)
			{
				if (num[i] + num[m] == k)
				{
					g = 1;
				}
			}
		}
		System.out.print((g == 1?"yes":"no"));
		System.out.print("\n");
		return 0;
	}

}

