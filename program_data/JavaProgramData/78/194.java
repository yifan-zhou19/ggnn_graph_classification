package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int zhao;
		int qian;
		int sun;
		int li;
		int i;
		String weight = new String(new char[51]);
		for (i = 0; i < 51; i++)
		{
			weight = tangible.StringFunctions.changeCharacter(weight, i, ' ');
		}
		for (zhao = 10; zhao <= 50; zhao = zhao + 10)
		{
			for (qian = 10; qian <= 50; qian = qian + 10)
			{
				if (zhao != qian)
				{
					for (sun = 10; sun <= 50; sun = sun + 10)
					{
						if (zhao != sun && qian != sun)
						{
							for (li = 10; li <= 50; li = li + 10)
							{
								if (zhao != li && qian != li && sun != li)
								{
									if (((zhao + qian) == (sun + li)) && ((zhao + li) > (sun + qian)) && ((zhao + sun) < qian))
									{
										weight = tangible.StringFunctions.changeCharacter(weight, zhao, 'z');
										weight = tangible.StringFunctions.changeCharacter(weight, qian, 'q');
										weight = tangible.StringFunctions.changeCharacter(weight, sun, 's');
										weight = tangible.StringFunctions.changeCharacter(weight, li, 'l');
										for (i = 50; i > 0; i--)
										{
											if (weight.charAt(i) != ' ')
											{
												System.out.print(weight.charAt(i));
												System.out.print(" ");
												System.out.print(i);
												System.out.print("\n");
											}
										}
									}
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

