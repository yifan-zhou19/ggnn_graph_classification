package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		String a = new String(new char[14]);
		String b = new String(new char[4]);
			 while (scanf("%s%s",a,b) != EOF)
			 {
					k = 0;
			for (i = 0;a.charAt(i) != '\0';i++)
			{
			   if (a.charAt(k) < a.charAt(i))
			   {
				   k = i;
			   }
			}
			for (i = 12;i > k + 3;i--)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - 3));
			}
			for (i = k + 1;i < k + 4;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, b.charAt(i - k - 1));
			}
			System.out.printf("%s\n",a);
			 }
	}

}

