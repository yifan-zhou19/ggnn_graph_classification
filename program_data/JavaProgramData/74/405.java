package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int temp;
		int j;
		int k = 0;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			temp = i;
			k = 0;
			while (temp != 0)
			{
				j = temp % 10;
			   k = k * 10 + j;
			   temp = temp / 10;
			}
			if (k == i)
			{
				j = 2;
				while (j < i)
				{
					 if ((i % j) == 0)
					 {
						 break;
					 }
					 j++;
				}
				if (j >= i)
				{
					if (x == 0)
					{
						System.out.printf("%d",i);
					}
					else
					{
						System.out.printf(",%d",i);
					}
					x++;
				}
			}
		}
		if (x == 0)
		{
			System.out.print("no");
		}
	}

}

