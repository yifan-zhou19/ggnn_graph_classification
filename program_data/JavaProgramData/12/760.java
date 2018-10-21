package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] c = new int[16];
		int i;
		int j;
		int k;
		int num;
		for (;c[0] != (-1);)
		{
			num = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				c[0] = Integer.parseInt(tempVar);
			}
			if (c[0] == (-1))
			{
				break;
			}
			for (i = 1;i < 16;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					c[i] = Integer.parseInt(tempVar2);
				}
				if (c[i] == 0)
				{
					break;
				}
			}
			for (j = 0;j < i;j++)
			{
				for (k = 0;k < i;k++)
				{
					if (2 * c[k] == c[j])
					{
						num += 1;
					}
				}
			}
			System.out.printf("%d\n",num);
		}
	}
}

