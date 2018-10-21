package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String c = new String(new char[PI]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}

		int len;
		len = c.length();
		int i;
		for (i = 0;i < len;i++)
		{
			if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 32);
			}
		}


		int sum = 0;
		i = 0;
		int tmp;
		int j = len;
		while (i < len)
		{
			if (c.charAt(i) >= 65 && c.charAt(i) <= 90)
			{
				tmp = (c.charAt(i) - 55) * (int)Math.pow(a,j - 1);
			}
			if (c.charAt(i) >= 48 && c.charAt(i) <= 57)
			{
				tmp = (c.charAt(i) - 48) * (int)Math.pow(a,j - 1);
			}
			sum += tmp;
			j--;
			i++;
		}


		String d = new String(new char[PI]);

		i = 0;
		if (sum == 0)
		{
			System.out.print("0");
		}
		while (sum != 0)
		{
			d = tangible.StringFunctions.changeCharacter(d, i, sum % b);
			sum = sum / b;
			i++;
		}
		for (j = i - 1;j >= 0;j--)
		{
			if (d.charAt(j) >= 0 && d.charAt(j) <= 9)
			{
				System.out.printf("%c",d.charAt(j) + 48);
			}
			if (d.charAt(j) >= 10 && d.charAt(j) <= 35)
			{
				System.out.printf("%c",d.charAt(j) + 55);
			}
		}
		return 0;
	}
}

