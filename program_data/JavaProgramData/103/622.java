package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1001]);
		  String b = new String(new char[1001]);
		  int[] c = new int[1001];
		  int i;
		  int m;
		  int M;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }


		  for (i = 0;a.charAt(i) != 0;i++)
		  {

			 if ('a' <= a.charAt(i) && a.charAt(i) <= 'z')
			 {
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			 }
		  }



		   for (i = 0,m = 0,c[m] = 1,b[m] = a.charAt(0);a.charAt(i + 1) != 0;i++)
		   {

				if (a.charAt(i) == a.charAt(i + 1))
				{
				   c[m]++;
				}

				else
				{
					  m++;
				  b = tangible.StringFunctions.changeCharacter(b, m, a.charAt(i + 1));
				  c[m] = 1;
				}

		   }
		   M = m;
		   for (m = 0;m <= M;m++)
		   {
		   System.out.printf("(%c,%d)",b.charAt(m),c[m]);
		   }

	}

}

