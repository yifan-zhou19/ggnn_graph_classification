package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int from;
		int to;
		int i;
		int j;
		int sum = 0;
		String in = new String(new char[255]);
		final String out = "0";
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
		String s10 = new String(new char[100]);
		final String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (i = '0';i <= '9';i++)
		{
			s10 = tangible.StringFunctions.changeCharacter(s10, i, i - '0');
		}
		for (i = 'a';i <= 'z';i++)
		{
			s10 = tangible.StringFunctions.changeCharacter(s10, i, i - 'a' + 10);
		}
		for (i = 'A';i <= 'Z';i++)
		{
			s10 = tangible.StringFunctions.changeCharacter(s10, i, i - 'A' + 10);
		}
		for (i = 0;in.charAt(i) != '\0';i++)
		{
			sum = sum * from + s10.charAt(in.charAt(i));
		}
		for (i = 0;i < 255;i++)
		{
			out = tangible.StringFunctions.changeCharacter(out, i, s.charAt(sum % to));
			sum = sum / to;
			if (sum == 0)
			{
				break;
			}
		}
		for (j = i;j >= 0;j--)
		{
			System.out.printf("%c",out.charAt(j));
		}
	}
}

