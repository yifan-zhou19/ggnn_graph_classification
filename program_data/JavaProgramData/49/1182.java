package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str = "";
		final String b = "";
		final String a = "";
		int c;
		int len;
		int j;
		int i;
		int k;
		int p;
		a = new Scanner(System.in).nextLine();
		c = a.length();
		for (len = 2;len <= c;len++)
		{
			//??? 
			for (k = 0;k <= c - len;k++)
			{
			//?str?? 
				 for (j = k,p = 0;j <= len - 1 + k;j++,p++)
				 {
					 str = tangible.StringFunctions.changeCharacter(str, p, a.charAt(j));
				 }
			//????b; 
				 for (i = 0;i < len;i++)
				 {
					 b = tangible.StringFunctions.changeCharacter(b, i, str.charAt(len - 1 - i));
				 }
			//?????? 
				  if (strcmp(str,b) == 0)
				  {
					 System.out.printf("%s\n",str);
				  }
			}



		}



		return 0;
	}
}

