package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] m = new int[1000];
		int j;
		char[][] s = new char[1000][255];
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
				s[i] = tempVar2.charAt(0);
			}
			m[i] = String.valueOf(s[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (m[i] >= 2)
			{
			   for (j = 0;j < m[i] - 1;j++)
			   {
					 if (s[i][j] == 'A')
					 {
					   System.out.print("T");
					 }
					if (s[i][j] == 'T')
					{
					   System.out.print("A");
					}
					  if (s[i][j] == 'G')
					  {
					   System.out.print("C");
					  }
					if (s[i][j] == 'C')
					{
					   System.out.print("G");
					}
			   }
			   if (s[i][m[i] - 1] == 'A')
			   {
				  System.out.print("T\n");
			   }
			   if (s[i][m[i] - 1] == 'T')
			   {
				  System.out.print("A\n");
			   }
			   if (s[i][m[i] - 1] == 'G')
			   {
				  System.out.print("C\n");
			   }
			   if (s[i][m[i] - 1] == 'C')
			   {
				  System.out.print("G\n");
			   }
			}
			else
			{
				 if (s[i][0] == 'A')
				 {
					   System.out.print("T\n");
				 }
				 if (s[i][0] == 'T')
				 {
					   System.out.print("A\n");
				 }
				 if (s[i][0] == 'G')
				 {
					   System.out.print("C\n");
				 }
				 if (s[i][0] == 'C')
				 {
					   System.out.print("G\n");
				 }
			}
		}
		return 0;
	}



}

