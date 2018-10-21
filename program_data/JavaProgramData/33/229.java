package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String jj = new String(new char[500]);
		int l;
		int n;
		int j;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j <= n;j++)
		{

		   jj = new Scanner(System.in).nextLine();
		   l = jj.length();

		   for (i = 0;i < l;i++)
		   {
			  if (jj.charAt(i) == 'A')
			  {
				 jj = tangible.StringFunctions.changeCharacter(jj, i, 'T');
			  }
			  else if (jj.charAt(i) == 'T')
			  {
				 jj = tangible.StringFunctions.changeCharacter(jj, i, 'A');
			  }
			  else if (jj.charAt(i) == 'C')
			  {
				 jj = tangible.StringFunctions.changeCharacter(jj, i, 'G');
			  }
			  else
			  {
				 jj = tangible.StringFunctions.changeCharacter(jj, i, 'C');
			  }
		   }

		   System.out.println(jj);
		   System.out.print("\n");

		}






		return 0;

	}
}

