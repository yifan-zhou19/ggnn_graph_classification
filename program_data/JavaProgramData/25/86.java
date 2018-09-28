package <missing>;

public class GlobalMembers
{
	/*			???????2?N?? 
				?????2010?12?17?
				???????
	*/
	public static int Main()
	{
		int[] num = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i;
		int j;
		int len0 = 1;
		int len1;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			len1 = len0;
			if (num[len1 - 1] >= 5)
			{
				len0++;
			}
			for (j = len1 - 1 ; j >= 0 ; j--)
			{
				if (num[j] < 5)
				{
					num[j] = num[j] * 2;
				}
				else
				{
					num[j] = num[j] * 2 - 10;
					num[j + 1]++;
				}
			}
		}
		for (i = len0 - 1 ; i >= 0 ; i--)
		{
			System.out.print(num[i]);
		}
		return 0;
	}
}

