package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[100]);
		int n;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	//	scanf("\n");
		for (; n > 0; n--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				input = tempVar2.charAt(0);
			}
			len = input.length();
			if ((input.charAt(len - 2) == 'e') && (input.charAt(len - 1) == 'r'))
			{
				input = input.substring(0, len - 2);
			}
			if ((input.charAt(len - 2) == 'l') && (input.charAt(len - 1) == 'y'))
			{
				input = input.substring(0, len - 2);
			}
			if ((input.charAt(len - 3) == 'i') && (input.charAt(len - 2) == 'n') && (input.charAt(len - 1) == 'g'))
			{
				input = input.substring(0, len - 3);
			}
			System.out.println(input);
		}

		return 0;
	}
}

