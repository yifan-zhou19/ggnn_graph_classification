package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int count;
		int[] number = new int[500];
		int i;
		int p;
		int len;
		int judge;
		String input = new String(new char[1000]);
		String name = new String(new char[500]);
		input = new Scanner(System.in).nextLine();
		count = 0;
		len = input.length();
		for (i = 0;i < len;i++)
		{
			name = name.substring(0, i);
			number[i] = 0;
			if (input.charAt(i) > 96)
			{
				input.charAt(i) -= 32;
			}
		}
		for (i = 0;i < len;i++)
		{
		judge = 0;
		if (input.charAt(i) == name.charAt(count - 1))
		{
			judge = 1;
			number[count - 1]++;
		}
		if (judge == 0)
		{
			name = tangible.StringFunctions.changeCharacter(name, count, input.charAt(i));
			number[count]++;
			count++;
		}
		}
		count--;
		for (i = 0;i <= count;i++)
		{
			System.out.printf("(%c,%d)",name.charAt(i),number[i]);
		}
	return 0;

	}
}

