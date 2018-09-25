package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] num = new int[15];
		int i;
		int m;
		for (i = 0;i < 15;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[i] = Integer.parseInt(tempVar);
			}
			{
			if (num[i] == 0)
			{
		break;
			}
	}
		i++;
		}
		int j = 0;
		int a;
		m = i;
		i = a = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (num[i] / num[j] == 2 && num[i] % num[j] == 0)
				{
			a++;
				}
			}
		}
		System.out.printf("%d\n",a);
	}
}

