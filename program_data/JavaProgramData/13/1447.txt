package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int q;
		int x = 1;
		int[] shuzu = new int[N];
		int[] panduan = new int[N];
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
				(shuzu[i]) = Integer.parseInt(tempVar2);
			}
		}
		panduan[0] = 0;
		for (i = 1;i < n;i++)
		{
			for (q = 0,j = 0;j < i;j++)
			{
				if (shuzu[j] == shuzu[i])
				{
					q = 1;
					break;

				}
			}

			panduan[i] = q;
		}
		for (i = 0,x = 0;i < n;i++)
		{
			if (panduan[i] == 0)
			{
				x = x + 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (panduan[i] == 0 && (x != 1))
			{
				System.out.printf("%d ",shuzu[i]);
				x--;
			}
			else if (panduan[i] == 0 && (x == 1))
			{
				System.out.printf("%d",shuzu[i]);
				x--;
			}


		}

		return 0;
	}


}

