package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int j = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			c = a - b;
			if (c == 0)
			{
			continue;
			}
			else if (c == -1 || c == 2)
			{
				j++;
			}
			else
			{
				k++;
			}
		}
	if (j > k)
	{
				System.out.print("A");
	}
			else if (k > j)
			{
				System.out.print("B");
			}
			else if (j == k)
			{
				System.out.print("Tie");
			}

		return 0;
	}
}

