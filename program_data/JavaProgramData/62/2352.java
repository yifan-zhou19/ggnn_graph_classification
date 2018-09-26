package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]); //??????????
		int i;
		char b;
		int j = 0;
		int c = 0;
		while (true)
		{
			   b = System.in.read();
			   if (b == '\n')
			   {
				   break; // ????
			   }
			   if (b != 32) //  ????  ??
			   {
					 a = tangible.StringFunctions.changeCharacter(a, j, b);
					 j = j + 1;
					 if (b != 46)
					 {
						 c = 0;
					 }
					 else
					 {
						 c = 1;
					 }
			   }
			   else
			   {
					 c = c + 1;
					 if (c > 1)
					 {
						 continue; //???1??????
					 }
					 else
					 {
						   a = tangible.StringFunctions.changeCharacter(a, j, b); //?????????
						   j = j + 1;
					 }
			   }
		}
		for (i = 0;i < j;i++)
		{
			System.out.print(a.charAt(i));
		}
		return 0;
	}
}

