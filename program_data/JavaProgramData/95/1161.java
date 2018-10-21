import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int sum = 0;
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		int len1 = 0;
		int len2 = 0;
		str1 = new Scanner(System.in).nextLine();

		str2 = new Scanner(System.in).nextLine();
		for (len1 = 0;str1.charAt(len1) != '\0';len1++)
		{
			;
		}
		for (len2 = 0;str2.charAt(len2) != '\0';len2++)
		{
			;
		}


		for (i = 0;i < len1;i++)
		{
						   if (str1.charAt(i) >= 97)
						   {
						   str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
						   }
						   if (str2.charAt(i) >= 97)
						   {
						   str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 32);
						   }

							if (str1.charAt(i) > str2.charAt(i))
							{
							   System.out.print(">");
							   System.out.print("\n");
						   sum = 1;
						   break;
							}
						   else if (str1.charAt(i) < str2.charAt(i))
						   {
							   System.out.print("<");
							   System.out.print("\n");
							   sum = 1;
							   break;
						   }
						   else if (str1.charAt(i) == str2.charAt(i))
						   {
						   continue;
						   }
		}

		if (len1 < len2)
		{
			System.out.print("<");
			System.out.print("\n");
		sum = 1;
		}
		if (sum != 1)
		{
		System.out.print("=");
		System.out.print("\n");
		}


	return 0;
	}

}

