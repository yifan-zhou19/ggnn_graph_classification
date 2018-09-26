package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] zheng = new int[255];
		final String fan = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int from;
		int to;
		String in = new String(new char[255]);
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
		int i;
		for (i = '0';i <= '9';i++)
		{
			zheng[i] = i - '0';
		}
		for (i = 'A';i <= 'Z';i++)
		{
			zheng[i] = i - 'A' + 10;
		}
		for (i = 'a';i <= 'z';i++)
		{
			zheng[i] = i - 'a' + 10;
		}
		int sum = 0;
		for (i = 0;in.charAt(i);i++)
		{
			sum = sum * from + zheng[in.charAt(i)];
		}
		final String out = "0";
		int l = 0;
		l = (sum == 0)?1:0;
		while (sum > 0)
		{
			out = tangible.StringFunctions.changeCharacter(out, l, fan.charAt(sum % to));
			l++;
			sum /= to;
		}
		for (i = l - 1;i >= 0;i--)
		{
			System.out.printf("%c",out.charAt(i));
		}
		return 0;

	}

}

