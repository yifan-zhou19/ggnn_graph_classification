package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   String str1 = new String(new char[100]);
	   String str2 = new String(new char[100]);
	   char c;
	   int n;
	   int k;
	   int t;
	   int i;
	   int j;
	   int a;
	   int q;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }

	   for (i = 1;i <= n;i++)
	   {
		   scanf("\n");
		  for (j = 0;(c = System.in.read()) != '\n';j++)
		  {
		  str1 = tangible.StringFunctions.changeCharacter(str1, j, c);
		  }
		j--;
		for (k = 0;(c = System.in.read()) != '\n';k++)
		{
		  str2 = tangible.StringFunctions.changeCharacter(str2, k, c);
		}
		k--;
		for (t = j;t >= 0;t--)
		{
			if (t >= j - k)
			{
			str2 = tangible.StringFunctions.changeCharacter(str2, t, str2.charAt(t - j + k));
			}

			else
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, t, '0');
			}
		}
		 for (a = j;a >= 0;a--)

		 {
		   if (str2.charAt(a) > str1.charAt(a))
		   {
			 str2 = tangible.StringFunctions.changeCharacter(str2, a, str1.charAt(a) + 10 - str2.charAt(a) + '0');
			 str1 = tangible.StringFunctions.changeCharacter(str1, a - 1, str1.charAt(a - 1) - 1);
		   }
		   else
		   {
		   str2 = tangible.StringFunctions.changeCharacter(str2, a, str1.charAt(a) - str2.charAt(a) + '0');
		   }
		 }
		 for (q = 0;q <= j;q++)
		 {
			System.out.printf("%c",str2.charAt(q));
		 }
		  System.out.print("\n");
	   }
	}

}

