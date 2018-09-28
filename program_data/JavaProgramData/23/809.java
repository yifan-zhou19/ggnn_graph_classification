package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str;
		String p;
		int n; //?m??????????//
		int m = 0;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = n - 1;i >= 0;i--)
		{
			if (*(str.Substring(i)) != ' ')
			{
				m++;
			}
			else if (*(str.Substring(i)) == ' ')
			{
				for (j = 1;j <= m;j++)
				{
					System.out.printf("%c",*(str.Substring(i) + j));
				}
				System.out.print(" ");
				m = 0;
			}
			if (i == 0)
			{
				for (j = 0;j < m;j++)
				{
					System.out.printf("%c",*(str.Substring(j)));
				}
			}
		}
		return 0;
	}

}
