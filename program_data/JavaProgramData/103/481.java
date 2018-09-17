package <missing>;

public class GlobalMembers
{
	public static final String da = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String xiao = "abcdefghijklmnopqrstuvwxyz";
	public static String a = new String(new char[1000]);
	public static int num(char p)
	{
		int m;
		for (m = 0;m < 26;m++)
		{
			if (p == da.charAt(m) || p == xiao.charAt(m))
			{
				return m;
			}
		}
			return 1000;
	}
	public static int Main()
	{

		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j;
		int len = 1;
		for (i = 0; a.charAt(i) != '\0' ;i++)
		{
			for (j = i + 1;;j++)
			{
				if (num(a.charAt(j)) == num(a.charAt(i)))
				{
					len++;
				}
				else
				{
					break;
				}

			}
			System.out.print("(");
			System.out.print(da.charAt(num(a.charAt(i))));
			System.out.print(",");
			System.out.print(len);
			System.out.print(")");
			len = 1;
			i = j - 1;
		}
		return 0;
	}



}

