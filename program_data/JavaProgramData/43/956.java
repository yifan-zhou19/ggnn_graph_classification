package <missing>;

public class GlobalMembers
{
	//***************************************************
	//1.cpp ??????     ******
	//?? ???  1200018209  ********
	//?? 2012-10-15 ******
	//***************************************************
	public static int Main()
	{
		int temp;
		int n;
		int i;
		int j;
		int[] a = new int[10000];
		int k = 1;
		a[0] = 2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3;i <= n;i = i + 2)
		{
			temp = Math.sqrt(i);
			for (j = 2;j <= temp;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == temp + 1)
			{
				a[k] = i;
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = k - 1;j >= i;j--)
			{
				if (a[i] + a[j] == n)
				{
					System.out.print(a[i]);
					System.out.print(" ");
					System.out.print(a[j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

