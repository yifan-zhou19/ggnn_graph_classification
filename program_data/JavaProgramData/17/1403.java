package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c2 = new String(new char[101]);
		int i;
		int j;
		int n;
		for (;;)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c2 = tempVar.charAt(0);
		}
		if (c2.charAt(0) == '\n')
		{
			break;
		}
		System.out.printf("%s\n",c2);
		for (i = 0,n = 0;c2.charAt(i) != '\0';i++)
		{
			if (c2.charAt(i) == '(')
			{
				n = i;
			}
			//else if(c2[i]!=')'&&c2[i]!='(') c2[i]='a';
		}
		for (i = n;i >= 0;i--)
		{
			if (c2.charAt(i) == '(')
			{
				   for (j = i + 1;c2.charAt(j) != '\0';j++)
				   {
					 if (c2.charAt(j) == ')')
					 {
						 c2 = tangible.StringFunctions.changeCharacter(c2, j, 'a');
						 c2 = tangible.StringFunctions.changeCharacter(c2, i, 'a');
						 break;
					 }
				   }
			}
		}
		for (i = 0;c2.charAt(i) != '\0';i++)
		{
			if (c2.charAt(i) == '(')
			{
				System.out.print("$");
			}
			else if (c2.charAt(i) == ')')
			{
				System.out.print("?");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
		c2 = tangible.StringFunctions.changeCharacter(c2, 0, '\n');
		}
	}

}

