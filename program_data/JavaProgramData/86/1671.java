package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//int ans = 60;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			//int ans = 60;
			int t;
			int temp = 0; //????
			int spe = 0; //????
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			for (int i = 1;i <= t;i++)
			{
				int now;
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					now = Integer.parseInt(tempVar3);
				}
				if (now + temp * 3 < 57)
				{
					temp++;
				}
				if (now + temp * 3 >= 57 && now + temp * 3 < 60 && spe == 0)
				{
					spe = 60 - now - temp * 3;
				}

			}
			System.out.printf("%d\n",60 - temp * 3 - spe);
		}
		return 0;
	}
}

