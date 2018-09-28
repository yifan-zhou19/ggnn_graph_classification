package <missing>;

public class GlobalMembers
{
	public static char Main()
	{
		int t;
		int i;
		int j;
		int k;
		int b = 0;
		int c;
		String a = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}

			for (j = 0;j < 100000;j++)
			{
				if (a.charAt(j) == '\0')
				{
					break;
				}
			}
			for (k = 0;k < j;k++)
			{
				b = 0;
				for (c = 0;c < j;c++)
				{
					if ((a.charAt(k) == a.charAt(c)) && (k != c))
					{
						b = 1;
						break;
					}
				}
				if (b == 0)
				{
					System.out.printf("%c\n",a.charAt(k));
					break;
				}
			}
			if (b == 1)
			{

					System.out.print("no\n");
			}
		}

			return 0;

	}



}

