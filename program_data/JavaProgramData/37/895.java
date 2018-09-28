package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int t;
		  int m;
		  int j;
		  int[] b = new int[100001];
		  int k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (j = 0;j < 100000;j++)
		  {
			 b[j] = 1;
		  }
		  String str = new String(new char[100001]);
		  for (int i = 0;i < t;i++)
		  {
				   for (j = 0;;j++)
				   {
						   String tempVar2 = ConsoleInput.scanfRead(null, 1);
						   if (tempVar2 != null)
						   {
							   str = tangible.StringFunctions.changeCharacter(str, j, tempVar2);
						   }
						   if (str.charAt(j) == '\n')
						   {
						   break;
						   }
				   }
				   m = j;
				   for (j = 0;j < m - 1;j++)
				   {
					  for (k = j + 1;k < m;k++)
					  {
							if (str.charAt(j) == str.charAt(k))
							{
								  b[j] = 0;
								  b[k] = 0;
							}
					  }
				   }
				   for (j = 0;j < m;j++)
				   {
					   if (b[j] == 1)
					   {
								  System.out.printf("%c\n",str.charAt(j));
								  break;
					   }
				   }
				   if (j == m)
				   {
				   System.out.print("no\n");
				   }
				   for (j = 0;j < 100000;j++)
				   {
					  b[j] = 1;
				   }
		  }
	}
}

