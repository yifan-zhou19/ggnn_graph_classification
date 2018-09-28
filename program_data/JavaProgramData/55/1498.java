package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] s_n = new int[128];
	final String n_s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String in = new String(new char[255]);
	final String out = "0";

	int i;
	int from;
	int to;
	int len = 0;
	int num = 0;

	for (i = '0';i <= '9';i++)
	{
		s_n[i] = i - '0';
	}
	for (i = 'A';i <= 'Z';i++)
	{
		s_n[i] = i - 'A' + 10;
	}
	for (i = 'a';i < 'z';i++)
	{
		s_n[i] = i - 'a' + 10;
	}

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		from = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		in = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		to = Integer.parseInt(tempVar3);
	}
	for (i = 0;in.charAt(i) != '\0';i++)
	{
		num = num * from + s_n[in.charAt(i)];
	}

	len = (num == 0)?1:0;
	while (num > 0)
	{
	out = tangible.StringFunctions.changeCharacter(out, len++, n_s.charAt(num % to));
	num = num / to;
	}
	for (i = len - 1;i >= 0;i--)
	{
	System.out.printf("%c",out.charAt(i));
	}
	return 0;
	}

}

