package <missing>;

public class GlobalMembers
{
	// ??3.cpp : Defines the entry point for the console application.
	//


	public static int Main()
	{
		int z = 0;
		int q = 0;
		int s = 0;
		int l = 0;
		int i = 0;
		String temp = new String(new char[51]);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(temp,'0',(Character.SIZE / Byte.SIZE));

		for (z = 10;z <= 50;z += 10)
		{
			for (q = 10;q <= 50;q += 10)
			{
				for (s = 10;s <= 50;s += 10)
				{
					for (l = 10;l <= 50;l += 10)
					{
						if ((z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q)
						{
							temp = tangible.StringFunctions.changeCharacter(temp, z, 'z');
							temp = tangible.StringFunctions.changeCharacter(temp, s, 's');
							temp = tangible.StringFunctions.changeCharacter(temp, q, 'q');
							temp = tangible.StringFunctions.changeCharacter(temp, l, 'l');

						for (i = 50;i >= 10; i--)
						{
							if (temp.charAt(i) != '0')
							{
								System.out.print(temp.charAt(i));
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



		return 0;

	}

}

