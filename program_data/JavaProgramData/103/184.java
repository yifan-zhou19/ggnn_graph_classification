package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int length;
		int i;
		int n;
		a = new Scanner(System.in).nextLine();
		length = a.length();
		for (i = 0;i < length;i++)
		{
			if ((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z'))
			{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - DLTA);
			}
			else
			{
			;
			}
		}

											 //make all letter capital
		n = 1;
		for (i = 0;i < length - 1;i++)
		{
			if (a.charAt(i) == a.charAt(i + 1))
			{
				n = n + 1;
			}
			else
			{
				System.out.printf("(%c,%d)",a.charAt(i),n);
				n = 1;
			}
		}
		n = 1;
		for (i = length - 1;a.charAt(i) == a.charAt(i - 1);i--)
		{
			n = n + 1;
		}
		System.out.printf("(%c,%d)",a.charAt(length - 1),n);
	}

}

