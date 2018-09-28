package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c; //????????????????????
		final String ch = "";
		int i = 0;
		int j = 0;
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		while (c != '\n')
		{
			if (c == ' ') //???????????
			{
				i++;
				j = 0;
				c = System.in.read();
			}
			ch.charAt(i)[j] = c;
			j++;
			c = System.in.read();
		}
		for (;i >= 1;i--) //??????????
		{
			j = 0;
			while (ch.charAt(i)[j] != '\0')
			{
				System.out.print(ch.charAt(i)[j]);
				j++;
			}
			System.out.print(" ");
		}
		j = 0;
		while (ch.charAt(0)[j] != '\0') //????????????????????????
		{
			System.out.print(ch.charAt(0)[j]);
			j++;
		}
		return 0;
	}
}

