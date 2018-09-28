package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int d = 60;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				System.out.print("60\n");
				continue;
			}
			for (;m > 0;m--)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					temp = Integer.parseInt(tempVar3);
				}
				if (temp < d - 2)
				{
					d -= 3;
				}
				else if (temp == d - 2)
				{
					d -= 2;
				}
				else if (temp == d - 1)
				{
					d -= 1;
				}
			}
			System.out.printf("%d\n",d);
		}
	}

}

