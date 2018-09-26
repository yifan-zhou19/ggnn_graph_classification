package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			String n = new String(new char[100]); //??????
			int length; //?????????????????????
			int ten = 0;
			int i;
			int a;
			int b;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			length = n.length(); //????
			for (i = 0;i <= length - 1;i++) //?????????????
			{
					if (('A' <= n.charAt(i)) && (n.charAt(i) <= 'Z')) //???????????ASCII????????
					{
							n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'A' + 10);
					}
					else if (('a' <= n.charAt(i)) && (n.charAt(i) <= 'z'))
					{
							n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'a' + 10);
					}
					else if (('0' <= n.charAt(i)) && (n.charAt(i) <= '9')) //?????????ASCII????????
					{
							n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - '0');
					}
			}
			for (i = 0;i <= length - 1;i++)
			{
					ten = (int)ten + n.charAt(i) * Math.pow((double)a,length - i - 1); //?a????????
			}
			if (ten == 0)
			{
					System.out.print(ten);
			}
			if (ten != 0)
			{
					int[] yushu = new int[100]; //????
					int j;
					for (i = 0;ten != 0;i++)
					{
							yushu[i] = ten % b; //???????b???????
							ten = ten / b;
					}
					for (j = i - 1;j >= 0;j--) //??????b?????
					{
							if ((0 <= yushu[j]) && (yushu[j] <= 9))
							{
									System.out.print(yushu[j]);
							}
							else if (yushu[j] >= 10)
							{
									yushu[j] = yushu[j] + 'A' - 10;
									System.out.print(yushu[j]); //???10????????????
							}
					}
			}
			System.out.print("\n");
			return 0;
	}

}

