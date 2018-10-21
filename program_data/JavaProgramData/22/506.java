package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[300];
		int amount = 0;
		String c = new String(new char[300]);
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar2);
			}
			amount = amount + 1;
			if (c.charAt(i) == '\n')
			{
				break;
			}
		}

		////
		int sum = 0;
		if (amount == 1)
		{
			System.out.print("No");
		}
		else if (amount != 1)
		{
			for (i = 0;i + 1 < amount;i++)
			{
				if (a[i + 1] != a[i])
				{
					sum = sum + 1;
				}
			}
			if (sum == 0)
			{
				System.out.print("No");
			}
			else
			{ //??????
				int sum = 0;
				int j;
				int cache;
				a[amount] = 10000000;
				for (j = 0;j < amount;j++)
				{
					for (i = 0;i < amount;i++)
					{
						if (a[i] > a[i + 1])
						{
							cache = a[i + 1];
							a[i + 1] = a[i];
							a[i] = cache;
						}
					}
				}
				///?????
				for (j = amount - 1;j > 0;j--)
				{
					if (a[j] == a[j - 1])
					{
						continue;
					}
					else
					{
						System.out.printf("%d",a[j - 1]);
						break;
					}

				}
			}
		}
		return 0;
	}

}

