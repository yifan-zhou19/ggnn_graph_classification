package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}

		n = a.length();
		 m = b.length();
		  if (n != m)
		  {
			 System.out.print("NO");
		  }
		 else
		 {
		for (i = 0;i <= n;i++)
		{

			for (j = 0;j <= n;j++)
			{
				if (a.charAt(i) == b.charAt(j))


				{
					c = tangible.StringFunctions.changeCharacter(c, i, b.charAt(j));
				b = tangible.StringFunctions.changeCharacter(b, j, '\0');


					   break;
				}

			}
		}


				if (strcmp(a,c) == 0)
				{
					System.out.print("YES");
				}
				else
				{
					System.out.print("NO");
				}
		 }
	}

}

