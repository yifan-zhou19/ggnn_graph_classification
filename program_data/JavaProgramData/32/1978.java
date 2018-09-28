package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			String c = new String(new char[100]);
			String b = new String(new char[100]);
			int j;
			int i;
			int k = 0;
			int s = 0;
			int t;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead("\n");
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			while (c.charAt(k) != '\0')
			{
				k++;
			}
			while (b.charAt(s) != '\0')
			{
				s++;
			}
			t = k - s;
			for (i = k - 1;i >= t;i--)
			{
				if (c.charAt(i) >= b.charAt(i - t))
				{
					c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - b.charAt(i - t) + '0');
				}
				else
				{
					c.charAt(i - 1)--;
					c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + 10 - b.charAt(i - t) + '0');
				}

			}

			s = 0;
					for (s;s < k; s++)
					{
				System.out.printf("%c", c.charAt(s));
					}
			System.out.print("\n");

			n--;
		}

		return 0;
	}

}

