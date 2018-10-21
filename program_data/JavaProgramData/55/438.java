package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int len;
		int k;
		int num;
		String c = new String(new char[70]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		len = c.length();
		for (i = len - 1,num = 0,k = 1;i >= 0;i = i - 1,k = k * a)
		{
			if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'a' + 10);
			}
			else if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'A' + 10);
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - '0' + 0);
			}
			num = num + c.charAt(i) * k;
		} //ok

		if (num == 0)
		{
			System.out.print("0");
		}
		for (i = 0,k = b;num != 0;i++,num = num / k)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, num % k);
			if (c.charAt(i) <= 9)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + '0');
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 10 + 'A');
			}
		}
		for (j = i - 1;j >= 0;j--)
		{
			System.out.printf("%c",c.charAt(j));
		}
	}
}

