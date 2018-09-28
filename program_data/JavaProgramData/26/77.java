package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[99]); //??????
		str = new Scanner(System.in).nextLine();
		for (int i = 0;i < str.length();i++)
		{
		   if (str.charAt(i) == 32) //??????
		   {
			   while (str.charAt(i + 1) == 32) //????????
			   {
								 for (int k = i + 1;k < str.length();k++)
								 {
				  str = tangible.StringFunctions.changeCharacter(str, k, str.charAt(k + 1)); //??????????
								 }
			   }
		   }
		}
		System.out.print(str);
		return 0;
	}
}

