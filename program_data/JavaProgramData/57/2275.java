package <missing>;

public class GlobalMembers
{
	public static int Main()
	{ //declaration
		void del(char * str,int n);
		char[][] word = new char[50][10];
		int n;
		int i;
	//input
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*(word + i) = tempVar2;
			}
		}
	//process
		for (i = 0;i <= n - 1;i++)
		{
			del(*(word + i), String.valueOf(*(word + i)).length());
		}
	//output
		for (i = 0;i <= n - 1;i++)
		{
			System.out.printf("%s\n",word + i);
		}
		return 0;
	}

	public static void del(tangible.RefObject<String> str, int n)
	{ //declaration

	//process
		if (str.argValue.charAt(n - 2) == 'e' && str.argValue.charAt(n - 1) == 'r')
		{
			str.argValue.charAt(n - 2) = '\0';
		}
		if (str.argValue.charAt(n - 2) == 'l' && str.argValue.charAt(n - 1) == 'y')
		{
			str.argValue.charAt(n - 2) = '\0';
		}
		if (str.argValue.charAt(n - 3) == 'i' && str.argValue.charAt(n - 2) == 'n' && str.argValue.charAt(n - 1) == 'g')
		{
			str.argValue.charAt(n - 3) = '\0';
		}

	}
}

