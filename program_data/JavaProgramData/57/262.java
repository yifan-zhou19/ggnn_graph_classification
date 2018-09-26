package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int[] l = new int[100];
		int i;
		char[][] s = new char[100][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			l[i] = String.valueOf(s[i]).length();
		}
	for (i = 0;i < a;i++)
	{
		if (s[i][l[i] - 1] == 'g')
		{
		   for (int k = 0;k < l[i] - 3;k++)
		   {
				System.out.printf("%c",s[i][k]);
		   }
		}
		else
		{
			for (int k = 0;k < l[i] - 2;k++)
			{
				System.out.printf("%c",s[i][k]);
			}

		}
	 System.out.print("\n");

	}
	}



}

