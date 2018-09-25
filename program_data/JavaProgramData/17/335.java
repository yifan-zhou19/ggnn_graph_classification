package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String jiance = new String(new char[101]);
		char c;
		int i;
		int zifu;
		int[] kuo2 = new int[100];
		while ((jiance = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{ //???????
			System.out.print(jiance);
			System.out.print("\n");
			zifu = -1;
			for (i = 0; jiance.charAt(i) != 0; i++)
			{
				c = jiance.charAt(i);
				jiance = tangible.StringFunctions.changeCharacter(jiance, i, ' '); //???????�  �
				if (c == '(')
				{ //??????
					zifu++;
					kuo2[zifu] = i;
				}
				else if (c == ')')
				{ //?????
					zifu--;
					if (zifu < -1)
					{
						jiance = tangible.StringFunctions.changeCharacter(jiance, i, '?'); //???????????
						zifu = -1;
					}
				}
			}
			if (zifu > -1)
			{
				for (; zifu > -1; zifu--)
				{
					jiance = tangible.StringFunctions.changeCharacter(jiance, kuo2[zifu], '$'); //????????????
				}
			}
			System.out.print(jiance);
			System.out.print("\n");
		}
		return 0;
	}

}

