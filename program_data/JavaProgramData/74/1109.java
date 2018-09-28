package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			k = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					k = 1;
				}
			}
			if (k == 0)
			{
				int temp;
				int l;
				int h = 0;
				temp = i;
				while (temp > 0)
				{
					l = temp % 10;
					h = h * 10 + l;
					temp = temp / 10;
				}
				if (i == h)
				{
					if (a == 0)
					{
						System.out.printf("%d",i);
					}
					else
					{
						System.out.printf(",%d",i);
					}
					a++;
				}
			}
		}
		if (a == 0)
		{
			System.out.print("no");
		}
	}
}

