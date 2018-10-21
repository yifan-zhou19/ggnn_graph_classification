package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int m;
		int len;
		String a = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a = tempVar2.charAt(0);
						 }
						 len = a.length();
						 for (i = 0;i < len;i++)
						 {
											switch (a.charAt(i))
											{
														 case 'A':
														 {
															 a = tangible.StringFunctions.changeCharacter(a, i, 'T');
															 break;
														 }
														 case 'T':
														 {
															 a = tangible.StringFunctions.changeCharacter(a, i, 'A');
															 break;
														 }
														 case 'C':
														 {
															 a = tangible.StringFunctions.changeCharacter(a, i, 'G');
															 break;
														 }
														 case 'G':
															 a = tangible.StringFunctions.changeCharacter(a, i, 'C');
											}
						 }
						 for (i = 0;i < len;i++)
						 {
							 System.out.printf("%c",a.charAt(i));
						 }
						 System.out.print("\n");
		}




	}
}

