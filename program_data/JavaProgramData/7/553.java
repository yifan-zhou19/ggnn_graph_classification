package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String s = new String(new char[100]);
		String ex = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int k;
		int flag;
		int len;
		int D;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			flag = 1;
			if (s.charAt(i) == a.charAt(0))
			{
				k = i;
				for (j = i;j < i + len;j++)
				{
					ex = tangible.StringFunctions.changeCharacter(ex, j - i, s.charAt(k));
					k++;
				}
				  for (j = 0;j < len;j++)
				  {
					if (ex.charAt(j) != a.charAt(j))
					{
						   flag = 0;
					}
				  }
			}
			else
			{
				flag = 0;
			}

			   if (flag != 0)
			   {
				D = i;
				break;
			   }
		}
		if (flag != 0)
		{
			for (i = 0;i < D;i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
			for (i = 0;b.charAt(i) != '\0';i++)
			{
				System.out.printf("%c",b.charAt(i));
			}
			for (i = D + len;s.charAt(i) != '\0';i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
		else
		{
			for (i = 0;s.charAt(i) != '\0';i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
		System.out.print("\n");
		return 0;
	}
}

