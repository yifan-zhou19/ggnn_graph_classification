package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3;i <= n / 2;i += 2)
		{
			//cout<<i<<" "<<j<<endl;
			j = n - i;
			int flag;
			for (k = 2;k < i;k++)
			{
				if (i % k != 0)
				{
					flag = 0;
				}
				if (i % k == 0)
				{
					flag = 1;
					break;
				}
			}
			if (flag == 1)
			{
				continue;
			}
			for (k = 2;k < j;k++)
			{
				if (j % k != 0)
				{
					flag = 0;
				}
				if (j % k == 0)
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}

		}
		return 0;
	}







}

