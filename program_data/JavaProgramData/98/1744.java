package <missing>;

public class GlobalMembers
{
	//*******************************
	//*???????              **
	//*?????? 1300012965     **
	//*???20131211              **
	//*******************************
	public static int Main()
	{
		char[][] a = new char[999][41];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));
		int n;
		int i;
		int j;
		int count = 0;
		int nlen;
		String p;
		String q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		p = a;
		System.out.print((a + 1));
		nlen = String.valueOf(a[1]).length();
		count = nlen;
		for (j = 2; j <= n; j++)
		{
			nlen = String.valueOf(a[j]).length();
			if (count + nlen + 1 <= 80)
			{
				System.out.print(" ");
				System.out.print((a + j));
				count = count + nlen + 1;
			}
			else
			{
				count = nlen;
				System.out.print("\n");
				System.out.print((a + j));
			}
		}
		return 0;
	}
}

