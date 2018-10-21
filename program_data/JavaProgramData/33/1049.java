package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		final String a = "";
		final String b = "";
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
			  a = tangible.StringFunctions.changeCharacter(a, i, tempVar2);
		  }
		}

		   for (i = 0;i < n;i++)
		   {

				m = String.valueOf(a.charAt(i)).length();
			 for (int k = 0;k < m;k++)
			 {


			   if (a.charAt(i)[k] == 'A')
			   {
				   b.charAt(i)[k] = 'T';
			   }
			   else if (a.charAt(i)[k] == 'T')
			   {
				   b.charAt(i)[k] = 'A';
			   }
			   else if (a.charAt(i)[k] == 'C')
			   {
				   b.charAt(i)[k] = 'G';
			   }
			   else if (a.charAt(i)[k] == 'G')
			   {
				   b.charAt(i)[k] = 'C';
			   }

			 }
		   }
		   for (i = 0;i < n;i++)
		   {
		   System.out.printf("%s\n",b.charAt(i));
		   }

	return 0;



	}
}

