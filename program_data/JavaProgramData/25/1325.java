package <missing>;

public class GlobalMembers
{
	/**
	* @file C8Q5.cpp
	* @author ???
	* @date 2013-11-17
	* @description
	* ??????:??2?N??
	*/



	public static int Main()
	{
		String c = new String(new char[MAX]); //????
		int n;
		int pos = 0; //????????


//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,MAX * (Character.SIZE / Byte.SIZE)); //???

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		c = tangible.StringFunctions.changeCharacter(c, 0, 1); //2?0???1

		for (int i = 0 ; i < n; i++) //??n?
		{
			for (int j = 0 ; j < MAX ; j++)
			{
				c.charAt(j) *= 2; //??
			}
			for (int k = 0 ; k < MAX - 1; k++) //??????
			{
				if (c.charAt(k) >= 10) //????
				{
					c.charAt(k + 1) += c.charAt(k) / 10;
					c.charAt(k) %= 10;
				}
				if (c.charAt(k) != 0 && k > pos) //????????
				{
					pos = k;
				}
			}
		}

		for (int i = pos ; i >= 0 ; i--) //???????
		{
			System.out.print((char)(c.charAt(i) + '0'));
		}
		System.out.print("\n");
	}

}

