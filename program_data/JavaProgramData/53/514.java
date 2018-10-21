package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int max;
		int n;
		String num = new String(new char[300]);
		String b = new String(new char[300]);
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
				num = tangible.StringFunctions.changeCharacter(num, i, tempVar2);
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 1;j <= i;j++)
			{
			if (num.charAt(i) == num.charAt(i - j))
			{
				b = tangible.StringFunctions.changeCharacter(b, i, 1);
			}

			}

		}
		for (i = 0;i < n;i++)
		{
			if (b.charAt(i) != 1)
			{
				max = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b.charAt(i) != 1)
			{
				if (i < max)
				{
					System.out.printf("%d,",num.charAt(i));
				}
				else if (i = max)
				{
					System.out.printf("%d",num.charAt(i));
				}
			}
		}
	}
}

