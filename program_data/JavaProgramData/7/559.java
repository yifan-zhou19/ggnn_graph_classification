package <missing>;

public class GlobalMembers
{
	///#include<stdlib.h>
	///#include<math.h>
	public static int Main()
	{
		String s1 = new String(new char[257]);
		String s2 = new String(new char[257]);
		String s3 = new String(new char[257]);
		String p;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		s3 = new Scanner(System.in).nextLine();
		p = tangible.StringFunctions.strStr(s1,s2);
		if (p != null)
		{
			int i = p - s1;
			s1 = tangible.StringFunctions.changeCharacter(s1, i, '\0');
			System.out.printf("%s",s1);
			System.out.print(s3);
			System.out.printf("%s\n",p + s2.length());
		}
		else
		{
			System.out.println(s1);
		}

		return 0;
	}

}

