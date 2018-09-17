package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		String s = new String(new char[300]);
		char temp;
		int i;
		int k = 0;
		int j = 0;
		int m = 0;
		int n = 0;
		int count = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		n = str.length();
		for (i = 0;i < n;i++)
		{
			   if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			   {
				  s = tangible.StringFunctions.changeCharacter(s, k, str.charAt(i));
				   k = k + 1;
			   }
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		else if (k == 1)
		{
			System.out.printf("%c=1",s.charAt(0));
			System.out.print("\n");
		}

		else
		{


		for (i = k - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (s.charAt(j + 1) < s.charAt(j))
				{
				   temp = s.charAt(j + 1);
				   s = tangible.StringFunctions.changeCharacter(s, j + 1, s.charAt(j));
				   s = tangible.StringFunctions.changeCharacter(s, j, temp);
				}
			}
		}

		for (i = 0;i < k;i++)
		{
			if (s.charAt(i) == s.charAt(i + 1))
			{
				count++;
				if (i == k - 2)
				{
					System.out.printf("%c=%d",s.charAt(i),count);
				}
			}
			if (s.charAt(i) < s.charAt(i + 1) && i < k - 2)
			{
				System.out.printf("%c=%d",s.charAt(i),count);
				System.out.print("\n");
				count = 1;
			}
			if (s.charAt(i) < s.charAt(i + 1) && i == k - 2)
			{
			   System.out.printf("%c=%d",s.charAt(i),count);
				System.out.print("\n");
				  System.out.printf("%c=1",s.charAt(k - 1));
				System.out.print("\n");
			}


		}
		}
		return 0;
	}

}

