package <missing>;

public class GlobalMembers
{
	public static int f(String b, int m)
	{
		 int i;
		 int j;
		 int k;
		 int l;
		 int flag;
		 for (j = 2; j <= m; j++)
		 {
			  for (i = 1; i <= m - 1; i++)
			  {
				   flag = 1;
				   for (k = 0; k < j; k++)
				   {
						if (!b[i + k].equals(b[i + j - k - 1]))
						{
							flag = 0;
						}
				   }
				   if (flag != 0)
				   {
						for (l = 0; l < j; l++)
						{
							 System.out.print(b[i + l]);
						}
						System.out.print("\n");
				   }
			  }
		 }
		 return 0;
	}

	public static int Main()
	{
		int m;
		String a = new String(new char[501]);
		for (m = 1; m > 0; m++)
		{
			 if (a.charAt(m - 1) == '\n')
			 {
				 break;
			 }
			 a = tangible.StringFunctions.changeCharacter(a, m, System.in.read());
		}
		f(a, m);
		return 0;
	}
}

