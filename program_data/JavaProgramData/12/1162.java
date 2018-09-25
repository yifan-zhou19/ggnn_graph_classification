package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] s = new int[16];
		while (true)
		{
			int i;
			int j;
			int count = 0;
			int flag = 0;
			for (i = 0;;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s[i] = Integer.parseInt(tempVar);
				}
				if (s[i] == -1)
				{
					flag = 1;
					break;
				}
				if (s[i] == 0)
				{
					break;
				}
				count++;
			}
			if (flag != 0)
			{
				break;
			}
			int num = 0;

			for (i = 0;i < count;i++)
			{
				for (j = 0;j < count;j++)
				{
					if (s[i] == s[j] * 2)
					{
						num++;
					}
				}
			}
			System.out.printf("%d\n",num);
		}
	}


}

