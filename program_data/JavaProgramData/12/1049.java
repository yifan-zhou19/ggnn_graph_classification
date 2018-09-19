package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
			int n;
			int i;
			int k;
			int d;
			int total;
			total = 0;
			int[] shuzu = new int[16];
			for (i = 0;i < 16;i++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n != -1)
			{
			shuzu[i] = n;
			if (n == 0)
			{
			for (d = 0;d < i;d++)
			{
			for (k = 0;k < i;k++)
			{
				if (shuzu[d] == 2 * shuzu[k])
				{
					total++;
				}
			}
			}
				System.out.printf("%d\n",total);
			i = -1;
			total = 0;
			}
			}
			else
			{
				break;
			}
			}

	}



}

