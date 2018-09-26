package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int from;
		int to;
		int len;
		int num = 0;
		String in = new String(new char[100]);
		String out = new String(new char[100]);
		final String i2a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int[] a2i = new int[128];
		for (i = '0';i <= '9';i++)
		{
			a2i[i] = i - '0';
		}
		for (i = 'a';i <= 'z';i++)
		{
			a2i[i] = i - 'a' + 10;
		}
		for (i = 'A';i <= 'Z';i++)
		{
			a2i[i] = i - 'A' + 10; //???????
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			from = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			in = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			to = Integer.parseInt(tempVar3);
		}
		for (i = 0;in.charAt(i) != '\0';i++)
		{
			num = num * from + a2i[in.charAt(i)];
		}
		if (num == 0)
		{
			len = 1;
			out = tangible.StringFunctions.changeCharacter(out, 0, '0');
		}
		else
		{
			len = 0;
		}
		while (num > 0)
		{
			out = tangible.StringFunctions.changeCharacter(out, len++, i2a.charAt(num % to));
			num = num / to;
		}
		for (i = len - 1;i >= 0;i--)
		{
			System.out.printf("%c",out.charAt(i));
		}

		return 0;
	}
}

