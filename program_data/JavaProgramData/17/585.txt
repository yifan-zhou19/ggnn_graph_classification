import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		String b = new String(new char[110]);
		int len;
		int mark;
		int sign = 0;
		int s = 0;
		while (a = new Scanner(System.in).nextLine())
		{
			len = a.length();
			for (int i = 0;i <= len - 1;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i));
			}
			for (int j = 1;j <= len;j++)
			{
				mark = 0;
				sign = 0;
				s = 0;
				for (int i = 0;i < len;i++)
				{
					if (a.charAt(i) == '(')
					{
						mark = i;
						s = 1;
					}
				}
				if (mark == len - 1)
				{
					a = tangible.StringFunctions.changeCharacter(a, mark, '$');
				}
				if (s != 0)
				{
				for (int i = mark + 1;i < len;i++)
				{
					if (a.charAt(i) == ')')
					{
						a = tangible.StringFunctions.changeCharacter(a, mark, 'a');
						a = tangible.StringFunctions.changeCharacter(a, i, 'a');
						sign = 1;
						break;
					}
				}
				}
				if (s != 0)
				{
					if (sign == 0)
					{
						a = tangible.StringFunctions.changeCharacter(a, mark, '$');
					}
				}
				sign = 0;
				mark = 0;
				s = 0;
				for (int i = len - 1;i >= 0;i--)
				{
					if (a.charAt(i) == ')')
					{
						mark = i;
						s = 1;
					}
				}
				if (s != 0)
				{
				if (mark == 0)
				{
					a = tangible.StringFunctions.changeCharacter(a, mark, '?');
				}
				}
				if (s != 0)
				{
				for (int i = mark - 1;i >= 0;i--)
				{
					if (a.charAt(i) == '(')
					{
						a = tangible.StringFunctions.changeCharacter(a, mark, 'a');
						a = tangible.StringFunctions.changeCharacter(a, i, 'a');
						sign = 1;
						break;
					}
				}
				}
				if (s != 0)
				{
					if (sign == 0)
					{
						a = tangible.StringFunctions.changeCharacter(a, mark, '?');
					}
				}
			}
			for (int i = 0;i < len - 1;i++)
			{
				System.out.print(b.charAt(i));
			}
			System.out.print(b.charAt(len - 1));
			System.out.print("\n");
			for (int i = 0;i < len - 1;i++)
			{
				if (a.charAt(i) != '?' && a.charAt(i) != '$')
				{
					System.out.print(' ');
				}
				else
				{
					System.out.print(a.charAt(i));
				}
			}
			if (a.charAt(len - 1) != '?' && a.charAt(len - 1) != '$')
			{
				System.out.print(' ');
				System.out.print("\n");
			}
			else
			{
				System.out.print(a.charAt(len - 1));
				System.out.print("\n");
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,'\0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,'\0',(Character.SIZE / Byte.SIZE));
			mark = 0;
			sign = 0;
			len = 0;
		}
			return 0;
	}
}

