package <missing>;

public class GlobalMembers
{
	/**
	* @file homework.cpp
	* @author ??
	* @date 2010?11?26
	* @description
	* ??????:1049 ???? 
	*/
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		for (i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			if (m == 0)
			{
				System.out.print("60");
				System.out.print("\n");
			}
			else
			{
			for (j = 0;j < m;j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = 0;j < m;j++)
			{
				if (a[j] < 59)
				{
					sum += 3;
				}
				if (a[j] + sum > 63)
				{
					sum -= 3;
					System.out.print(60 - sum);
					System.out.print("\n");
					break;
				}
				else
				{
					if (a[j] + sum > 60)
					{

					System.out.print(a[j]);
					System.out.print("\n");
					break;
					}
					if (j == m - 1)
					{
					 System.out.print(60 - sum);
					 System.out.print("\n");
					}
				}
			}
			}
		}
		return 0;

	}
}

