package <missing>;

public class GlobalMembers
{
	//* * * * * * * * * * * * * * * * * * * * * * * * 
	//*???????????                       *
	//*??????????? .cpp                  *
	//*?????  1000012839                       *
	//*???2010.12.09                             *
	//* * * * * * * * * * * * * * * * * * * * * * * * 


	public static int Main()
	{
		String str = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *p[100] = {null};
		char[] p = {null, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int j;
		int flag = 1;

		str = new Scanner(System.in).nextLine();
		for (i = 0, j = 0; str.charAt(i) != '\0'; i++)
		{
			if (str.charAt(i) != ' ')
			{
				p[j] = str.charAt(i);
				flag = 0;
				j++;
			}
			if (flag == 0 && str.charAt(i) == ' ')
			{
				p[j] = str.charAt(i);
				flag = 1;
				j++;
			}

		}
		for (i = 0; i < j; i++)
		{
			System.out.print(p[i]);
		}
		System.out.print("\n");
		return 0;
	}





}
