package <missing>;

public class GlobalMembers
{
	public static void reverse(String a)
	{
		int i = 0;
		int k = 0;
		int s = 0;
		String b = new String(new char[10]);

		if (strcmp(a,"0") == 0)
		{
		   System.out.print("0\n");
		   return;
		}

		if (strcmp(a,"-0") == 0)
		{
		   System.out.print("0\n");
		   return;
		}

		if (a[0].equals('-'))
		{

		   System.out.print("-");
		   k = 1;
		}

		for (i = 0;i < a.length() - k;++i)
		{
			if (a[a.length() - 1 - i].equals('0') && s == 0)
			{
			   continue;
			}
			else
			{
			   s = 1;
			}
			b = tangible.StringFunctions.changeCharacter(b, i, a[a.length() - 1 - i]);
			System.out.printf("%c",b.charAt(i));
		}
		System.out.print("\n");
		//printf("reverse: %s\m",b);
	}

	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		String a = new String(new char[10]);
		for (i = 0;i < 6;++i)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = tempVar.charAt(0);
			}
			reverse(a);
		}
	}

}

