package <missing>;

public class GlobalMembers
{
	public static String fun(String str)
	{
		int k;
	  k = str.length();
	  if (str[k - 1].equals('r') && str[k - 2].equals('e'))
	  {
		  str = str.substring(0, k - 2);
		  str[k - 2] = '\0';
	  }
	  if (str[k - 1].equals('y') && str[k - 2].equals('l'))
	  {
		  str = str.substring(0, k - 2);
		  str[k - 2] = '\0';
	  }
	  if (str[k - 1].equals('g') && str[k - 2].equals('n') && str[k - 3].equals('i'))
	  {
		  str = str.substring(0, k - 3);
		  str[k - 3] = '\0';
	  }
	  return str;
	}
	public static void Main()
	{
		int n;
		int i;
		char[][] str = new char[50][50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{

			System.out.printf("%s\n",fun(str[i]));
		}
	}


}

