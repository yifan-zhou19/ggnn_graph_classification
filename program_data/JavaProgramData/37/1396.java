package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		String zfc = new String(new char[100000]);
		int k;
		int i;
		int j;
		int len;
		int sum;
		char a;
		int std = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= t;k++)
		{
			std = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			len = zfc.length();
			for (i = 0;i < len;i++)
			{
				if (zfc.charAt(i) == '0')
				{
					continue;
				}
				a = zfc.charAt(i);
				sum = 1;
				for (j = i + 1;j < len;j++)
				{
					if (zfc.charAt(j) == a)
					{
						sum++;
						zfc = tangible.StringFunctions.changeCharacter(zfc, j, '0');
					}
				}
				if (sum == 1)
				{
					System.out.printf("%c\n",a);
					std = 1;
					break;
				}
			}
			if (std == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

