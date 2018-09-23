package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s1 = new char[100][11];
		char[][] s2 = new char[100][4];
		int i;
		int j;
		int m;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1[0] = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2[0] = tempVar2.charAt(0);
		}
		m = 0;
		p = 0;
		do
		{
		   m = 0;
		   for (k = 0;k < String.valueOf(s1[p]).length();k++)
		   {


			   if (s1[p][k] > s1[p][m])
			   {
				   m = k;
			   }
		   }
		   for (i = 0;i <= m;i++)
		   {
			   System.out.printf("%c",s1[p][i]);

		   }
		   System.out.printf("%s",s2[p]);
		   for (j = m + 1;j < String.valueOf(s1[p]).length();j++)
		   {
			   System.out.printf("%c",s1[p][j]);

		   }
		   System.out.print("\n");
		   p++;
		} while (scanf("%s%s",s1[p],s2[p]) != EOF);


	}

}

