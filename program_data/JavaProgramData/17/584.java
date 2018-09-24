import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static final String x = "";
	public static final String y = "";
	public static int i;
	public static int j;
	public static int k;
	public static int l;
	public static int f()
	{
		for (i = 0;i < l - 1;i++)
		{
					for (j = 1;i + j < l;j++)
					{
						if (x.charAt(i) == '(' && x.charAt(i + j) == ' ')
						{
							continue;
						} //???????????
						if (x.charAt(i) == '(' && x.charAt(i + j) == '(')
						{
							break;
						} //?????????????
						if (x.charAt(i) == '(' && x.charAt(i + j) == ')')
						{
							x = tangible.StringFunctions.changeCharacter(x, i, ' ');
							x = tangible.StringFunctions.changeCharacter(x, i + j, ' ');
						} //??????????????????
					}
		}
		k++;
		if (k == l)
		{
			return 0;
		}
		if (k != l)
		{
			f();
		}
	}
	public static int Main()
	{
		while (x = new Scanner(System.in).nextLine())
		{
			y = x;
			l = x.length();
			for (i = 0;i < l;i++)
			{
					if (x.charAt(i) != '(' && x.charAt(i) != ')')
					{
						x = tangible.StringFunctions.changeCharacter(x, i, ' ');
					}
			} //?????????????
				k = 0;
				f();
				System.out.print(y);
				System.out.print("\n");
			for (i = 0;i < l;i++) //???????
			{
				if (x.charAt(i) == '(')
				{
					System.out.print("$");
				}
				if (x.charAt(i) == ')')
				{
					System.out.print("?");
				}
				if (x.charAt(i) == ' ')
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

