package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int p;
		int q;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0 ; i < n ; i++)
		{
			int sum = 0;
			int num;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q = Integer.parseInt(tempVar3);
			}
			if (p == 1 && q == 1)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					num = Integer.parseInt(tempVar4);
				}
				System.out.printf("%d", num);
				break;
			}
			for (j = 0 ; j < q ; j++)
			{
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					num = Integer.parseInt(tempVar5);
				}
				sum += num;
			}
			for (j = 1 ; j < p - 1 ; j++)
			{
				for (k = 0 ; k < q ; k++)
				{
					String tempVar6 = ConsoleInput.scanfRead();
					if (tempVar6 != null)
					{
						num = Integer.parseInt(tempVar6);
					}
					if (k == 0 || k == q - 1)
					{
						sum += num;
					}
				}
			}
			for (j = 0 ; j < q ; j++)
			{
				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					num = Integer.parseInt(tempVar7);
				}
				sum += num;
			}
			System.out.printf("%d\n", sum);
		}



	}

}

