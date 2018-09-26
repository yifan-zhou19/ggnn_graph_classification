package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[100000]);

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				b = 1;
				for (k = 0;a.charAt(k) != '\0';k++)
				{
					if (j == k)
					{
						continue;
					}
					else
					{
						if (a.charAt(j) - a.charAt(k) == 0)
						{
							b = 0;
							break;
						}
					}
				}
				if (b == 1)
				{
					System.out.printf("%c\n",a.charAt(j));
					break;
				}
			}
			if (b == 0)
			{
				System.out.print("no\n");
			}
		}

		return 0;
	}

}

