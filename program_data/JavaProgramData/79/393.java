package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[1000];
		int i;
		int cnt;
		int jsh = 0;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		while (n != 0)
		{
			for (i = 0;i <= n - 1;i++)
			{
				num[i] = i + 1;
			}
			for (i = 0;i <= n - 1;i++)

			{

				cnt = 0;
				for (cnt = 0;cnt < m;cnt++)
				{
					while (num[jsh] == 0)
					{
						jsh = (jsh + 1) % n;
					}
					jsh = (jsh + 1) % n;
				}
				jsh = jsh - 1;
				if (jsh < 0)
				{
					jsh = n - 1;
				}
				if (i == n - 1)
				{
					System.out.printf("%d\n",num[jsh]);
				}
				num[jsh] = 0;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
			jsh = 0;
		}
		return 0;
	}



}

