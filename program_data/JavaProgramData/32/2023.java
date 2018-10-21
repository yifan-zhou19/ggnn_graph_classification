package <missing>;

public class GlobalMembers
{
	/*?????*/ 



	public static int Main()
	{
		int n;
		int i;
		String s1 = new String(new char[101]);
		String s2 = new String(new char[101]);
		int[] result = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int n1;
		int n2;
		int hand;
		int j;
		while (n-- != 0)
		{
			s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			n1 = s1.length();
			n2 = s2.length();
			hand = 0;
			for (i = n2 - 1;i >= 0;i--)
			{
				result[hand] = s1.charAt(n1 - n2 + i) - s2.charAt(i); //???
				if (result[hand] < 0)
				{
					result[hand] = result[hand] + 10;
					j = n1 - n2 + i - 1;
					while (--s1.charAt(j) < 48) //??
					{
						s1 = tangible.StringFunctions.changeCharacter(s1, j, s1.charAt(j) + 10);
						j--;
					}
				}
				hand++;
			}
			for (i = 0;i < n1 - n2;i++)
			{
				if (s1.charAt(i) != '0')
				{
					break;
				}
			}
			for (;i < n1 - n2;i++)
			{
				System.out.print((int)s1.charAt(i) - 48);
			}
			for (i = hand - 1;i >= 0;i--)
			{
				System.out.print(result[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

