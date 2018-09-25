package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] monkey = new int[500];
		int[] r = new int[500];
		int i;
		int j;
		int m;
		int n;
		int left;
		int count;
		int time = 0;

			/*
			*	?????
			*	monkey???????????
			*	r???????????????????????
			*	left????????
			*	count????
			*	time??????????????0 0?
			*/

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
		while (m != 0 && n != 0)
		{
			//??????????????
			for (i = 0; i < m; i++)
			{
				monkey[i] = 1;
			}

			left = m;
			count = 0;
			while (left > 1)
			{
				for (i = 0; i < m; i++)
				{
					if (monkey[i] != 0)
					{
						count++;
					}
					if (count == n)
					{
						monkey[i] = 0;
						left--;
						if (left == 1)
						{
							break;
						}
						count = 0;
					}
				}
			}

			//?????????????????
			for (i = 0; i < m; i++)
			{
				if (monkey[i] != 0)
				{
					r[time] = i;
				}
			}

			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
			time++;
		}

		for (i = 0; i < time; i++)
		{
			System.out.printf("%d\n", r[i] + 1);
		}

		return 0;
	}
}

