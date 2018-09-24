package <missing>;

public class GlobalMembers
{
	public static int Main() //????????????????
	{
		String a = new String(new char[1000]); //???????
		a = new Scanner(System.in).nextLine(); //??
		int i = 0; //n???
		int j;
		int n;
		n = a.length();
		for (i = 0;i < n;i++)
		{
					   while (a.charAt(i) == ' ' && a.charAt(i - 1) == ' ') //????????????
					   {
								  for (j = i + 1;j < n;j++) //????
								  {
									 a = tangible.StringFunctions.changeCharacter(a, j - 1, a.charAt(j));
								  }
								  a = tangible.StringFunctions.changeCharacter(a, n - 1, '\0');
					   }
		}
		System.out.print(a);
		System.in.read();
		System.in.read();
		return 0;
	}


}

