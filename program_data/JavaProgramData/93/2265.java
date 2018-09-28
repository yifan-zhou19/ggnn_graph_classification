package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int[] a = {0, 0, 0};
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 3;i++)
		{
			if (n % (3 + 2 * i) == 0)
			{
			a[i] = 1;
			flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("n\n");
		}
		else
		{
			for (i = 0;i < 3;i++)
			{
				if (a[i] == 1)
				{
				System.out.printf("%d",3 + 2 * i);
				break;
				}
			}
		}
		for (i += 1;i < 3;i++)
		{
			if (a[i] == 1)
			{
				System.out.printf(" %d",3 + 2 * i);
			}
		}
		System.out.print("\n");
	}
}

