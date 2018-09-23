package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[102]);
	String a = new String(new char[102]);
	String b = new String(new char[102]);
	char[] temp = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,j;
	int i;
	int j;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int sum=0;
	int sum = 0;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int sum1=0;
	int sum1 = 0;
	int flag = 0;
	s = new Scanner(System.in).nextLine();
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();


	for (i = 0;i < s.length();i++)
	{

		if (s.charAt(i) != ' ')
		{
		 sum1 = sum1 + 1;
		 if (i != s.length() - 1)
		 {
			 continue;
		 }
		 else
		 {
			 i = i + 1;
			 flag = 1;
		 }

		}
		for (j = 0;j < a.length() && a.length() == sum1;j++)
		{
			if (s.charAt(i - sum1 + j) == a.charAt(j))
			{
				sum = sum + 1;
			}
		}
		if (sum == a.length())
		{
		   for (j = 0;j < b.length();j++)
		   {
			System.out.printf("%c",b.charAt(j));
		   }
		}
		else
		{
		for (j = 0;j < sum1;j++)
		{
			System.out.printf("%c",s.charAt(i - sum1 + j));
		}
		}
		if (flag == 0)
		{
			System.out.printf("%c",' ');
		}
		sum1 = 0;
		sum = 0;

	}

	return 0;
	}


}
