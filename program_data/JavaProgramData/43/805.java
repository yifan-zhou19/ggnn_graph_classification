package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int k = 0;
		int temp = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] arr_a = new int[1300];
		for (i = 3;i <= m;i++)
		{
			for (j = 2;j <= Math.floor(Math.sqrt(i));j++)
			{
				if (i % j == 0)
				{
					temp++;
				}
			}
			if (temp == 0)
			{
				arr_a[k++] = i;
			}
			temp = 0;
		}
		for (i = 0;i < k;i++)
		{
			for (j = i;j < k;j++)
			{
				if (arr_a[i] + arr_a[j] == m)
				{
				   System.out.print(arr_a[i]);
				   System.out.print(" ");
				   System.out.print(arr_a[j]);
				   System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

