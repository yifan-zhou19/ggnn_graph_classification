package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a2i = new int[128];
		final String i2a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String in = new String(new char[MAX]);
		final String out = "0";
		int i;
		int from;
		int to;
		int len = 0;
		int num = 0;
		for (i = '0';i <= '9';i++)
		{
			a2i[i] = i - '0';
		}
		for (i = 'A';i < 'Z';i++)
		{
			a2i[i] = i - 'A' + 10;
		}
		for (i = 'a';i < 'z';i++)
		{
			a2i[i] = i - 'a' + 10;
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
		len = (num == 0)?1:0;
		while (num > 0)
		{
			out = tangible.StringFunctions.changeCharacter(out, len++, i2a.charAt(num % to));
			num /= to;
		}
		for (i = len - 1;i >= 0;i--)
		{
			System.out.printf("%c",out.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}

}

