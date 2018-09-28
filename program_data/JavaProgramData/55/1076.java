package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[100]);
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num = 0;
		int i;
		int len = n.length(); //???????
		for (i = 0;i < len;i++) //??????10??
		{
			if (n.charAt(i) <= '9' && n.charAt(i) >= '0')
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 48);
			}
			if (n.charAt(i) <= 'z' && n.charAt(i) >= 'a')
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 87);
			}
			if (n.charAt(i) <= 'Z' && n.charAt(i) >= 'A')
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 55);
			}
			num = num + n.charAt(i) * ((double)Math.pow((double)a,(double)(len - 1 - i)));
		}
		if (num == 0)
		{
			System.out.print(0);
		}
		else //???b??????????
		{
			int[] latter = new int[100];
			i = 0;
			do
			{
				latter[i] = num % b;
			 num = num / b;
			 i++;
			}while (num / b != 0);
			latter[i] = num % b;
			latter[i + 1] = '\0';
			String n2 = new String(new char[100]);
			int j;
			for (j = 0;i >= 0;i--,j++)
			{
				if (latter[i] >= 0 && latter[i] <= 9)
				{
					n2 = tangible.StringFunctions.changeCharacter(n2, j, latter[i] + 48);
				}
				if (latter[i] >= 10 && latter[i] <= 36)
				{
					n2 = tangible.StringFunctions.changeCharacter(n2, j, latter[i] + 55);
				}
				System.out.print(n2.charAt(j));
			}
		}
		System.out.print("\n");
		return 0;
	}
}

