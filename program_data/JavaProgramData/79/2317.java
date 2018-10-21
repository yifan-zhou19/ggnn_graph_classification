package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int count;
		int j;
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
		while (m != 0)
		{
			int[] monkey = new int[310];
			for (int i = 0;i <= m - 1;i++)
			{
				monkey[i] = 2;
			}
			j = -1;
			for (int i = 1;i <= m - 1;i++)
			{
				count = 1;
				while (count <= n)
				{
					j++;
					switch (monkey[j])
					{
						case 0:
							j = -1;
							break;
						case 1:
							break;
						case 2:
							count++;
							break;
					}

				}
				monkey[j] = 1;
			}
			for (int i = 0;i <= m - 1;i++)
			{
				 if (monkey[i] == 2)
				 {
					System.out.printf("%d\n",i + 1);
				 }
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}
	}
}

