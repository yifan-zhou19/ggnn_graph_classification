package <missing>;

public class GlobalMembers
{
	//* * * * * * * * * * * * * * * * * * * * * * * * 
	//*??????????                         *
	//*??????????.cpp                     *
	//*?????  1000012839                       *
	//*???2010.12.10                             *
	//* * * * * * * * * * * * * * * * * * * * * * * * 


	public static int Main()
	{
		int n;
		int[] celebrity = new int[10000];
		int[][] a = new int[90000][2];
		int i;
		int j;
		int k;
		int flag;
		int count;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			celebrity[i] = 1;
		}
		i = 0;
		while (true)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i][0] == 0 && a[i][1] == 0)
			{
				break;
			}
			else
			{
				i++;
			}
		}
		flag = 0;
		for (k = 0; k < n; k++)
		{
			for (j = 0; j <= i - 1; j++)
			{
				if (a[j][0] == k)
				{
					celebrity[k] = 0;
				}
			}
		}
		for (k = 0; k < n; k++)
		{
			if (celebrity[k] == 1)
			{
				count = 0;
				for (j = 0; j <= i - 1; j++)
				{
					if (a[j][1] == k)
					{
						count++;
					}
				}
				if (count == n - 1)
				{
					flag = 1;
					System.out.print(k);
					System.out.print("\n");
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}






}

