package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Character.SIZE / Byte.SIZE));
		int i;
		int j;
		int n;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = tangible.StringFunctions.changeCharacter(a, 100, 1);
		for (i = 0 ; i < n ; i++)
		{
			j = 100;
			do
			{
				a = tangible.StringFunctions.changeCharacter(a, j, 2 * a.charAt(j));
				j--;
			}while (!(a.charAt(j) == 0 && a.charAt(j - 1) == 0 && a.charAt(j - 2) == 0));
			j = 100;
			do
			{
				if (a.charAt(j) >= 10)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, (int)a.charAt(j) % 10);
					a.charAt(j - 1) += 1;
				}
				j--;
			}while (!(a.charAt(j) == 0 && a.charAt(j - 1) == 0 && a.charAt(j - 2) == 0));
		}
		for (i = 0 ; i <= 100 ; i++)
		{
			if (a.charAt(i) == 0 && flag == 0)
			{
				continue;
			}
			else
			{
				flag = 1;
				System.out.print((int)a.charAt(i));
			}
		}
		return 0;
	}

}

