package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[120]);
	public static int n;
	public static void dispose(int x)
	{
		int i;
		int j;
		int k = 0;
		for (i = x + 1,k = 0;i < n;i++)
		{
			if (str.charAt(i) == '(' && k == 0)
			{
				dispose(i);
				k++;

			}
			if (str.charAt(i) == ')')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, ' ');
				str = tangible.StringFunctions.changeCharacter(str, x, ' ');
				for (j = i + 1;j < n;j++)
				{
					if (str.charAt(j) == '(')
					{
						dispose(j);
					}
				}
				break;
			}
		}
	}
	public static int Main()
	{
		int N;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (e = 0;e < N;e++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			System.out.printf("%s\n",str);
			int i;
			int j;
			int k;
			n = str.length();
			for (i = 0;i < n;i++)
			{
				if (str.charAt(i) == '(')
				{
					break;
				}
			}
			dispose(i); //printf("%d\n",i);printf("%s\n",str);
			for (i = 0;i < n;i++)
			{
				if (str.charAt(i) == '(')
				{
					System.out.print("$");
				}
				else
				{
					if (str.charAt(i) == ')')
					{
						System.out.print("?");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}
	}
}

