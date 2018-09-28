package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int x;
		int y;
		int flag = 1;
		String a = new String(new char[7]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (i == 1)
			{
				continue;
			}
			else
			{
				for (j = 2;j <= Math.sqrt(i);j++)
				{
					if (i % j == 0)
					{
						break;
					}
				}
				if (j > Math.sqrt(i))
				{
					x = (int)(Math.log10(i) + 1);
					for (y = 0;y < x;y++)
					{
						a = tangible.StringFunctions.changeCharacter(a, y, ((i % (int)Math.pow(10,y + 1)) - (i % (int)Math.pow(10,y + 1)) % (int)Math.pow(10,y)) / (int)Math.pow(10,y));
					}
					for (j = 0;j < (x - 1) / 2.0;j++)
					{
						if (a.charAt(j) != a.charAt(x - 1 - j))
						{
							break;
						}
					}
					if (j >= (x - 1) / 2.0)
					{
						if (flag == 1)
						{
							flag = 0;
						}
						else
						{
							System.out.print(",");
						}
						System.out.printf("%d",i);
					}
				}
			}
		}
		if (flag == 1)
		{
			System.out.print("no");
		}
	}
}

