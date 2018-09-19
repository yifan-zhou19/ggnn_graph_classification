package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int s;
		for (;;)
		{
			s = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0] = Integer.parseInt(tempVar);
			}
			if (a[0] == -1)
			{
				break;
			}
			for (i = 1;i <= 15;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			   if (a[i] == 0)
			   {
				   break;
			   }
			}
			for (j = 0;j <= i - 1;j++)
			{
				for (k = 0;k <= i - 1;k++)
				{
					if (a[k] == 2 * a[j])
					{
						s = s + 1;
					}
				}
			}
			System.out.printf("%d\n",s);
		}
		return 0;
	}

}

