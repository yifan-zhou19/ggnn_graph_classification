package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[500]);
	public static String huiwen = new String(new char[500]);
	public static void Main()
	{
		int i;
		int j;
		int m;
		int leng;
		int f = new int(int, int);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (leng = 2; leng < str.length(); leng++)
		{
			for (i = 0; i < str.length(); i++)
			{
				if (f(i, i + leng - 1) == 1)
				{
					System.out.printf("%s\n",huiwen);
				}
			}
		}
		/*for(i=0; i<strlen(str); i++)
		{
			for(j=i+1; j<strlen(str); j++)
			{
				if (f(i, j)==1) printf("%s\n",huiwen);
				for(m=0; m<=500; m++) huiwen[m]='\0';
			}
		}*/
	}
	public static int f(int i, int j)
	{
		int flag = 0;
		int k = 0;
		String s1 = new String(new char[500]);
		String s2 = new String(new char[500]);
		for (k = 0; k <= j - i; k++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, k, str.charAt(i + k));
			s2 = tangible.StringFunctions.changeCharacter(s2, k, str.charAt(j - k));
			if (s1.charAt(k) == s2.charAt(k))
			{
				flag = flag;
			}
			else
			{
				flag = flag + 1;
			}
		}
		if (flag == 0)
		{
			for (k = 0; k <= j - i; k++)
			{
				huiwen = tangible.StringFunctions.changeCharacter(huiwen, k, s1.charAt(k));
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

