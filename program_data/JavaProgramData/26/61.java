package <missing>;

public class GlobalMembers
{
	//????   ???  1000010334 
	/*
	????(1)??dev?????'\0'?  ??' ';
	        (2)??grids?????'\b'???; 
	*/ 
	public static int Main()
	{
		int i = 0; // ???
		int j = 0;
		String a = new String(new char[100]); //???????
		char chu = 0;
		for (i = 0;i < 100;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		}
		i = 0;
		a = tangible.StringFunctions.changeCharacter(a, 0, System.in.read());
		System.out.print(a.charAt(0));
		while (chu = System.in.read())
		{
			if (chu == '\n')
			{
				break;
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, i, chu);
				if ((a.charAt(i - 1) == ' ' && a.charAt(i) != ' ') || (a.charAt(i - 1) != ' '))
				{
					System.out.print(a.charAt(i));
				}
				i = i + 1;
			}
		}
		return 0;
	}
}

