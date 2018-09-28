package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int result;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			int a;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a == 0)
			{
				result = 60;
			}
			else
			{
				int[] cishu = new int[60];
				for (int b = 0;b < a;b++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						cishu[b] = Integer.parseInt(tempVar3);
					}
				}
				for (int c = 0;c < a;c++)
				{
					if (cishu[c] + 3 * c + 3 <= 60)
					{
						result = 57 - 3 * c;
					}
					else if (cishu[c] + 3 * c < 60 && cishu[c] + 3 * c + 3>60)
					{
						result = cishu[c];
						break;
					}
				}
			}
		System.out.printf("%d\n",result);
		}
		return 0;
	}
}

