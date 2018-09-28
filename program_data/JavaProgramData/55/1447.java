package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sys2; //??sys1?sys2????????????
		int oct = 0;
		int homo;
		int i;
		int j;
		int t;
		double sys1; //?????????,??sys1?double
		double length;
		String num = new String(new char[32]); //????????
		sys1 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sys2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		length = num.length(); //????????
		for (i = 0;i < length;i++) //?????????????????????
		{
			num = tangible.StringFunctions.changeCharacter(num, i, (char)Character.toUpperCase(num.charAt(i)));
		}
		for (i = 0;i < length;i++) //???????????
		{
			if (num.charAt(i) >= 48 && num.charAt(i) <= 57)
			{
				homo = num.charAt(i) - 48;
			}
			else
			{
				homo = num.charAt(i) - 55;
			}
			oct = oct + homo * Math.pow(sys1,length - i - 1);
		}
		int[] change = new int[32];
		for (i = 0;;i++) //????????sys2???????sys2???
		{
			change[i] = oct % sys2;
			oct = oct / sys2;
			if (oct == 0)
			{
				break;
			}
		}
		for (j = 0;j <= i - j;j++) //???????????????????
		{
			t = change[j];
			change[j] = change[i - j];
			change[i - j] = t;
		}
		String ans = new String(new char[32]);
		for (j = 0;j <= i;j++) //??????ASCII?
		{
			if (change[j] >= 10)
			{
				ans = tangible.StringFunctions.changeCharacter(ans, j, change[j] + 55);
			}
			else
			{
				ans = tangible.StringFunctions.changeCharacter(ans, j, change[j] + 48);
			}
			System.out.print(ans.charAt(j));
		}
		System.out.print("\n");
		return 0;
	}
}

