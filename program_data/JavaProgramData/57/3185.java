package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[50][32];
		String[] w = {"\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0", "\0"};
		int n;
		int i;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
		  s[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i <= n - 1;i++)
		{
		  l = String.valueOf(s[i]).length();
		  if (s[i][l - 1] == 'g' && s[i][l - 2] == 'n' && s[i][l - 3] == 'i')
		  {
			  w[i] = String.valueOf(s[i]).substring(0, l - 3);
		  }
		  else
		  {
			  w[i] = String.valueOf(s[i]).substring(0, l - 2);
		  }
		}
		 for (i = 0;i <= n - 1;i++)
		 {
		  System.out.println(w[i]);

		 }

	}

}

