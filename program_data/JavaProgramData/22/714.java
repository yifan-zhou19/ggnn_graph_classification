package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int max;
		int tmp;
		max = 0;
		tmp = 0;
		i = 0;
		do
		{
			i = i + 1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n > max)
			{
				tmp = max;
				max = n;
			}
			else if (n > tmp && n != max)
			{
				tmp = n;
			}
			else if (n == max)
			{
				max = max;
			}
				tmp = tmp;
		}while (System.in.read() != '\n');
		if (i == 1 || tmp == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",tmp);
		}
		return 0;
	}




}

