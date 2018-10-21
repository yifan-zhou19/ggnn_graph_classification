package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int num1;
		int num2;
		int num3;
		int i;
		String h = new String(new char[3]);
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				if (a != b)
				{
					for (c = 1;c <= 3;c++)
					{
						if (c != a && c != b)
						{
							num1 = (b > a) + (c == a); //??????????
							num2 = (a > b) + (a > c);
							num3 = (c > b) + (b > a);
							if ((num1 - num2) * (b - a) > 0 && (num1 - num3) * (c - a) > 0 && (num2 - num3) * (c - b) > 0) //???????????
							{
								h = tangible.StringFunctions.changeCharacter(h, num1, 'A');
								h = tangible.StringFunctions.changeCharacter(h, num2, 'B');
								h = tangible.StringFunctions.changeCharacter(h, num3, 'C'); //???????????
								for (i = 2;i >= 0;i--)
								{
									System.out.print(h.charAt(i));
								}
							}
						}
					}
				}
			}
		}
		return 0;
	}
}

