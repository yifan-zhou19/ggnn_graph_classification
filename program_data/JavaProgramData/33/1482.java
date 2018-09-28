package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] A = new char[1000][300];
	final String B = "";
	int n;
	int a;
	int i;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   A[i] = tempVar2.charAt(0);
	   }
	   a = String.valueOf(A[i]).length();
	   for (b = 0;b < a;b++)
	   {
		   if (A[i][b] == 'T')
		   {
			 B = tangible.StringFunctions.changeCharacter(B, b, 'A');
		   }
	else if (A[i][b] == 'A')
	{
			 B = tangible.StringFunctions.changeCharacter(B, b, 'T');
	}
	else if (A[i][b] == 'G')
	{
			 B = tangible.StringFunctions.changeCharacter(B, b, 'C');
	}
	else if (A[i][b] == 'C')
	{
			 B = tangible.StringFunctions.changeCharacter(B, b, 'G');
	}
	   }
		B = tangible.StringFunctions.changeCharacter(B, b, '\0');
		System.out.printf("%s\n",B);
	}
	return 0;
	}
}

