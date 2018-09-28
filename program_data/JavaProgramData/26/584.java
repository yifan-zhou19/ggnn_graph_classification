package <missing>;

public class GlobalMembers
{
	//************************************************************************
	//* ??? ????????.cpp                                          *
	//* ?? ????                                                        *
	//* ???? ?2010?11?26?                                            *
	//************************************************************************
	public static int Main()
	{
		String a = new String(new char[100]); //????????
		a = new Scanner(System.in).nextLine(); //??????
		String p;
		p = a; //??????p,?????????????
		int i;
		for (i = 0; a.charAt(i) != '\0' ; i++)
		{
			if (*(p.Substring(i)) == ' ' && *(p.Substring(i) - 1) == ' ') //??i?????i+1???????,?????i???
			{
				continue;
			}
			System.out.print((p.Substring(i)));
		}
		System.out.print("\n");
		return 0;
	}

}
