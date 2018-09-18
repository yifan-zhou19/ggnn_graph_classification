package <missing>;

public class GlobalMembers
{
	//this program helps you to find how many pairs of numbers satisfy the standard that the one is double of the other
	public static int Main()
	{
		int[] a = new int[20]; //bn is the number of double
		int[] bn = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i;
		int j;
		int k;
		int t = 1;
		int l;

		for (t = 1;;t++)
		{
			i = 1;
			do
			{ //this loop is aimed at inputting the t group of numbers
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i - 1] = Integer.parseInt(tempVar);
				}
				if (a[i - 1] == -1)
				{
					break;
				}
				i++;
			}while (a[i - 2] != 0);
			if (a[i - 1] == -1)
			{
				break;
			}
			for (j = 1;j <= i - 2;j++) //this loop is aimed at check the sequence one by one
			{
				for (k = 1;k <= i - 2;k++) //realize the checking
				{
					if (a[j - 1] == 2 * a[k - 1])
					{
						bn[t - 1]++;
					}
				}
			}
		}
		for (l = 1;l <= t - 1;l++)
		{
			System.out.printf("%d\n",bn[l - 1]);
		}
		return 0;
	}
}

