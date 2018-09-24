package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		char st;
	   while (scanf("%s", str) != EOF)
	   {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   substr = tempVar.charAt(0);
		   }
			int i = 0;
			int k;
			int t = 0;
			k = str.length();
			st = str.charAt(0);
			for (i = 0;i < k;i++)
			{
				if (str.charAt(i) > st)
				{
					st = str.charAt(i);
					t = i;
				}
			}
				for (i = 0;i < t + 1;i++)
				{
					System.out.printf("%c",str.charAt(i));
				}
				System.out.printf("%s",substr);
				for (i = t + 1;i < k;i++)
				{
					System.out.printf("%c",str.charAt(i));
				}

			 System.out.print("\n");
	   }
	}



}

