package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int t;
		String str = new String(new char[32]);
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
				str = tempVar2.charAt(0);
			}
			k = str.length();
			if (str.charAt(k - 1) == 'r' || str.charAt(k - 1) == 'y')
			{
				for (j = 0;j < k - 2;j++)
				{
						if (j < k - 3)
						{
						System.out.printf("%c",str.charAt(j));
						}
						if (j == k - 3)
						{
						System.out.printf("%c\n",str.charAt(j));
						}
				}
			}
			if (str.charAt(k - 1) == 'g')
			{
				for (j = 0;j < k - 3;j++)
				{
					if (j < k - 4)
					{
					System.out.printf("%c",str.charAt(j));
					}
					if (j == k - 4)
					{
					System.out.printf("%c\n",str.charAt(j));
					}
				}
			}
		}
		return 0;
	}
}

