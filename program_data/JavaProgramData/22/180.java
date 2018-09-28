package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] num = new int[300];
		int n;
		int term;
		int i;
		int j;
		int k;
		String c = new String(new char[300]);
		for (i = 0, n = 0;c.charAt(i - 1) != '\n' && i < 300;i++, n++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar2);
			}
		}
		if (n <= 1)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 1;i < n;i++)
			{
				if (num[i] != num[0])
				{
					break;
				}
			}
			if (i == n)
			{
				System.out.print("No\n");
			}
			else
			{
				for (i = 0;i < n;i++)
				{
					k = i;
					for (j = i + 1;j < n;j++)
					{
							if (num[j] > num[k])
							{
								k = j;
							}
					}
					if (k != i)
					{
						term = num[i];
						num[i] = num[k];
						num[k] = term;
					}
				}
				for (i = 1;i < n;i++)
				{
					if (num[i] != num[0])
					{
						System.out.printf("%d\n",num[i]);
						break;
					}
				}
			}
		}
	}
}

