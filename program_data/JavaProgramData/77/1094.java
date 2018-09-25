package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int e;
		int f;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *e_point;
		int e_point;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *f_point;
		int f_point;
		int flag;
		char a;
		char b;
		String c = new String(new char[100]);
		char z = ' ';
		c = new Scanner(System.in).nextLine();
		e_point = e;
		f_point = f;
		a = c.charAt(0);
		b = c.charAt(c.length() - 1);
		for (k = 1;k <= c.length() / 2;k++)
		{
			for (i = 0;i < c.length();i++)
			{
				flag = 0;
				if (c.charAt(i) == a)
				{
					j = i + 1;
					while (c.charAt(j) == z)
					{
						j += 1;
					}
					if (c.charAt(j) == b)
					{
						e = i;
						f = j;
						c = tangible.StringFunctions.changeCharacter(c, i, z);
						c = tangible.StringFunctions.changeCharacter(c, j, z);
						flag = 1;
					}
				}
				if (flag != 0)
				{
					break;
				}
			}
			System.out.printf("%d %d\n",e,f);
		}
	}


}

