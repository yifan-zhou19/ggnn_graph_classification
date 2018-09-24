package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i; //y????????
		int j;
		int k;
		int y;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();)
		{
			y = 0;
			for (j = i;j < i + a.length();j++)
			{
				if (s.charAt(j) == a.charAt(j - i)) //???????
				{
					if (s.charAt(i - 1) == 32 || i == 0)
					{
						y = y + 1;
					}
				}
				else
				{
					break;
				}
			}
			if (y == a.length())
			{
				i = i + a.length();
				for (k = 0;k < b.length();k++)
				{
					System.out.print(b.charAt(k));
				}
			}
			else
			{
				System.out.print(s.charAt(i));
				i++;
			}
		}
		return 0;
	}

}
