package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int a;
		String word = new String(new char[20]);
		String p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			a = word.length();
			p = word.Substring(a) - 1;
			if (*(p - 1) == 'e' && p == 'r')
			{
				*(p - 1) = '\0';
				System.out.printf("%s\n",word);
			}
			else if (*(p - 1) == 'l' && p == 'y')
			{
				*(p - 1) = '\0';
				System.out.printf("%s\n",word);
			}
			else if (*(p - 2) == 'i' && *(p - 1) == 'n' && p == 'g')
			{
				*(p - 2) = '\0';
				System.out.printf("%s\n",word);
			}
			 n--;
		}
	}
}

