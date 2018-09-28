package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[101]);
		String q = new String(new char[101]);
		int a;
		int i;
		int j;
		int b;
		int len;
		int p = 0;
		int x;
		int d;
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
		for (i = 0;i < len;i++)
		{
			if ((c.charAt(i) >= 'A') && (c.charAt(i) <= 'Z'))
			{
				x = c.charAt(i) - 'A' + 10;
			}
			else if ((c.charAt(i) >= 'a') && (c.charAt(i) <= 'z'))
			{
				x = c.charAt(i) - 'a' + 10;
			}
			else
			{
				x = c.charAt(i) - '0' + 0;
			}
			for (j = 1;j < len - i;j++)
			{
				x *= a;
			}
			p += x;
		}
		i = 0;
		do
		{

			x = p % b;
			if (x > 9)
			{
				q = tangible.StringFunctions.changeCharacter(q, i, x - 10 + 'A');
			}
			else
			{
				q = tangible.StringFunctions.changeCharacter(q, i, '0' + x);
			}
			p /= b;
			i++;
		}while (p != 0);
		for (j = i - 1;j >= 0;j--)
		{
			System.out.printf("%c",q.charAt(j));
		}
	}
}

