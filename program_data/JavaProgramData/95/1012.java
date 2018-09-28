import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int flag = 0;
		int i;
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;str1.charAt(i) != '\0' && str2.charAt(i) != '\0';i++)
		{
			if (str1.charAt(i) < 91 && str2.charAt(i) < 91)
			{
				if (str1.charAt(i) < str2.charAt(i))
				{
					System.out.print('<');
					System.out.print("\n");
					flag = 1;
					break;
				}
				else if (str1.charAt(i) > str2.charAt(i))
				{
					System.out.print('>');
					System.out.print("\n");
					flag = 1;
					break;
				}
				else
				{
					continue;
				}
			}
			 if (str1.charAt(i) > 91 && str2.charAt(i) < 91)
			 {
				 str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
				 if (str1.charAt(i) < str2.charAt(i))
				 {
					 System.out.print('<');
					 System.out.print("\n");
					 flag = 1;
					 break;
				 }
				 else if (str1.charAt(i) > str2.charAt(i))
				 {
					 System.out.print('>');
					 System.out.print("\n");
					 flag = 1;
					 break;
				 }
				 else
				 {
					 continue;
				 }
			 }
			 if (str1.charAt(i) < 91 && str2.charAt(i)>91)
			 {
				 str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 32);
				if (str1.charAt(i) < str2.charAt(i))
				{
					System.out.print('<');
					System.out.print("\n");
					flag = 1;
					break;
				}
				else if (str1.charAt(i) > str2.charAt(i))
				{
					System.out.print('>');
					System.out.print("\n");
					flag = 1;
					break;
				}
				else
				{
					continue;
				}
			 }
			if (str1.charAt(i) > 91 && str2.charAt(i) > 91)
			{
				if (str1.charAt(i) < str2.charAt(i))
				{
					System.out.print('<');
					System.out.print("\n");
					flag = 1;
					break;
				}
				else if (str1.charAt(i) > str2.charAt(i))
				{
					System.out.print('>');
					System.out.print("\n");
					flag = 1;
					break;
				}
				else
				{
					continue;
				}
			}

		}
		if (flag == 0)
		{
			if (str1.charAt(i) == '\0' && str2.charAt(i) == '\0')
			{
				System.out.print('=');
				System.out.print("\n");
			}
		else if (str1.charAt(i) != '\0')
		{
			System.out.print('>');
			System.out.print("\n");
		}
		else
		{
			System.out.print('<');
			System.out.print("\n");
		}
		}
		return 0;
	}

}

