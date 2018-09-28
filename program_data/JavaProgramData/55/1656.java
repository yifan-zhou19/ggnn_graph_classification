package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[1000]);
		final String str2 = "0";
		int a1;
		int num = 0;
		int b1;

		int[] num1 = new int[1000];
		final String char1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		int i;
		for (i = '0';i <= '9';i++)
		{
			num1[i] = i - '0';

		}
		for (i = 'A';i <= 'Z';i++)
		{
			num1[i] = i - 'A' + 10;
		}
		for (i = 'a';i <= 'z';i++)
		{
			num1[i] = i - 'a' + 10;
		}


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b1 = Integer.parseInt(tempVar3);
		}

		for (i = 0;str1.charAt(i) != '\0';i++)
		{
			num = num * a1 + num1[str1.charAt(i)];

		}


		int l2 = 0;
		l2 = (num == 0)?1:0;
		while (num > 0)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, l2, char1.charAt(num % b1));
			num = num / b1;
			l2 = l2 + 1;
		}
		for (i = l2 - 1;i >= 0;i--)
		{
			System.out.print(str2.charAt(i));
		}

		return 0;
	}

}

