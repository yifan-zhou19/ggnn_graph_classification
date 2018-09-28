package <missing>;

public class GlobalMembers
{
	//*******************************
	//*????                    **
	//*????? 1300012848       **
	//*???2013.12.11            **
	//*******************************
	public static int mystrlen(tangible.RefObject<String> p)
	{
		int i = 0;
		while (*(p.argValue.Substring(i)) != 0)
		{
			i++;
		}
		return i;
	}
	public static int Main()
	{
		char[][] a = new char[999][41];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));
		int n;
		int i;
		int j;
		int cnt = 0;
		int nlen;
		String p;
		String q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		p = a; //??a[0]
		System.out.print((a + 1));
		nlen = myString.valueOf(*(a + 1)).length();
		cnt = nlen;
		for (j = 2; j <= n; j++)
		{
			nlen = myString.valueOf(*(a + j)).length();
			if (cnt + nlen + 1 <= 80) //????????
			{
				System.out.print(" ");
				System.out.print((a + j));
				cnt += nlen + 1;
			}
			else //????????
			{
				cnt = nlen;
				System.out.print("\n");
				System.out.print((a + j));
			}
		}
		return 0;
	}
}

