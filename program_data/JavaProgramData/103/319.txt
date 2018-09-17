package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String yuan = new String(new char[1001]);
		String suo = new String(new char[1001]);
		int n;
		int i;
		int j;
		int a;
		int[] ya = new int[1001];
		yuan = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = yuan.length();
		for (i = 0;i < n ; i++)
		{
			if (yuan.charAt(i) >= 'a' && yuan.charAt(i) <= 'z')
			{
				yuan = tangible.StringFunctions.changeCharacter(yuan, i, yuan.charAt(i) + 'A' - 'a');
			}
		}
		suo = tangible.StringFunctions.changeCharacter(suo, 0, yuan.charAt(0));
		j = 0;
		for (i = 0 ;i < n ;i++)
		{
			if (yuan.charAt(i) == suo.charAt(j))
			{
				ya[j]++;
			}
			else
			{
				j++;
				suo = tangible.StringFunctions.changeCharacter(suo, j, yuan.charAt(i));
				ya[j] = 1;
			}
		}
		for (i = 0; i <= j; i++)
		{
			System.out.print("(");
			System.out.print(suo.charAt(i));
			System.out.print(",");
			System.out.print(ya[i]);
			System.out.print(")");
		}
		return 0;
	}
}

