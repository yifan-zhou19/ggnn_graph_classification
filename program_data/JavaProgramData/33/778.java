package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[260]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * ps;
	String str2 = new String(new char[260]);
	int n;
	int i;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	for (k = 0;k < n;k++)
	{
	   str = new Scanner(System.in).nextLine();
	   i = 0;
	   for (ps = str; * ps != '\0';ps++)
	   {
		 if (*ps == 'A')
		 {
			 str2 = tangible.StringFunctions.changeCharacter(str2, i, 'T');
		 }
			 else if (*ps == 'T')
			 {
				 str2 = tangible.StringFunctions.changeCharacter(str2, i, 'A');
			 }
				   else if (*ps == 'G')
				   {
					   str2 = tangible.StringFunctions.changeCharacter(str2, i, 'C');
				   }
						else
						{
							str2 = tangible.StringFunctions.changeCharacter(str2, i, 'G');
						}
		 i++;
	   }
		 str2 = tangible.StringFunctions.changeCharacter(str2, i, '\0');
		System.out.printf("%s\n",str2);
	}
	return 0;
	}
}

