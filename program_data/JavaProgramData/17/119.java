import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void find()
	{
		String ch = new String(new char[101]);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ch,'\0',(Character.SIZE / Byte.SIZE));
		while (ch = new Scanner(System.in).nextLine())
		{
		System.out.print(ch);
		System.out.print("\n");
		int i = 0;
		int j = 0;
		int num = 0;
		for (i = 0;i < 100;i++) //???????????????
		{
			if (ch.charAt(i) == '(')
			{
			num = 0;
				for (j = i;j < 100;j++)
				{
					if (ch.charAt(j) == '(')
					{
						num++;
					}
					if (ch.charAt(j) == ')')
					{
						num--;
					}
					if (num == 0)
					{
						break;
					}
				}
				if (num > 0)
				{
					ch = tangible.StringFunctions.changeCharacter(ch, i, '$');
				}
			}
		}
		for (i = 99;i >= 0;i--)
		{
			if (ch.charAt(i) == ')')
			{
			num = 0;
				for (j = i;j >= 0;j--)
				{
					if (ch.charAt(j) == '(')
					{
						num++;
					}
					if (ch.charAt(j) == ')')
					{
						num--;
					}
					if (num == 0)
					{
						break;
					}
				}
				if (num < 0)
				{
					ch = tangible.StringFunctions.changeCharacter(ch, i, '?');
				}
			}
		}
		int len;
		len = ch.length();
		for (i = 0;i < len;i++)
		{
			if (ch.charAt(i) != '$' && ch.charAt(i) != '?')
			{
				ch = tangible.StringFunctions.changeCharacter(ch, i, ' ');
			}
		}
		System.out.print(ch);
		System.out.print("\n");
		}
	}
	public static int Main()
	{

		find();
			return 0;
	}
}

