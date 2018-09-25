package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int[] num = new int[1000];
		int n;
		int m = 0;
		int index = 0;
		int i;
		int j;
		while (num[0] != -1)
		{
			while (true)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					num[index] = Integer.parseInt(tempVar);
				}
				index++;
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					c = tempVar2.charAt(0);
				}
				if (c != ' ')
				{
					break;
				}
			}
			for (i = 0;i < index;i++)
			{
				for (j = 0;j < index;j++)
				{
					if (num[i] == 2 * num[j] || num[i] * 2 == num[j])
					{
						m++;
					}
				}
			}
			if (num[0] == -1)
			{
				return 0;
			}
			System.out.printf("%d\n",m / 2);
			m = 0;
			index = 0;
		}
	}

}

