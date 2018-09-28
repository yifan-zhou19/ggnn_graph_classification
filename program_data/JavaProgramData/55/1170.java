package <missing>;

public class GlobalMembers
{
	public static int turn(char num)
	{
		if (num >= '0' && num <= '9')
		{
			return num - 48;
		}
		if (num >= 'a' && num <= 'z')
		{
			return num - 87;
		}
		if (num >= 'A' && num <= 'Z')
		{
			return num - 55;
		}
	}

	public static char turn(int num)
	{
		if (num >= 0 && num <= 9)
		{
			return num + 48;
		}
		if (num >= 10 && num <= 36)
		{
			return num + 55;
		}
	}

	public static int Main()
	{
		int a;
		int b;
		int i = -1;
		int j = 0;
		int s;
		int temp = 0;
		int temp1 = 0;
		final String num = "";
		int[] num1 = new int[8 * (Integer.SIZE / Byte.SIZE)];
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		do
		{
			i++;
			num = tangible.StringFunctions.changeCharacter(num, i, System.in.read());
		}while (num.charAt(i) != ' ');
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;j < i;j++)
		{
			temp += turn(num.charAt(j)) * Math.pow((double)a,i - j - 1);
		}
		temp1 = temp;
		for (i = 0;temp1 > 0;i++)
		{
			num1[i] = temp1 % b;
			temp1 = temp1 / b;
		}
		for (j = i - 1;j > 0;j--)
		{
			System.out.print(turn(num1[j]));
		}
	System.out.print(turn(num1[0]));

		return 0;
	}


}

