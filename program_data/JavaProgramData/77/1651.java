import java.util.*;

package <missing>;

public class GlobalMembers
{
		public static String str = new String(new char[101]);
	public static int test(int num,char sex)
	{
		if (str.charAt(num) != '\0')
		{
			if (str.charAt(num) == sex)
			{
				test(num + 1, sex);
			}
			else
			{
				int i = 0;
				for (i = num - 1;i >= 0;i--)
				{
					if (str.charAt(i) == sex)
					{
					 System.out.print(i);
					 System.out.print(" ");
					 System.out.print(num);
					 System.out.print("\n");
					str = tangible.StringFunctions.changeCharacter(str, i, '!');
					 str = tangible.StringFunctions.changeCharacter(str, num, '!');
					 break;
					}
				}
			}
			test(num + 1, sex);
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		str = new Scanner(System.in).nextLine();
		char boy = str.charAt(0);
		test(1, boy);
		return 0;
	}

}

