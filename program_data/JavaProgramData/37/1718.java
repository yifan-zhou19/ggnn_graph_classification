package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int t;
		  int l;
		  int m;
		  int n;
		  int j;
		  int no;
		  char i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (l = 0;l < t;l++)
		  {
						  no = 0;
						  String a = new String(new char[100000]);
						  int[] b = new int[26];
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a = tempVar2.charAt(0);
						  }
						  n = a.length();
						  for (i = 'a';i <= 'z';i++)
						  {
							   for (j = 0;a.charAt(j) != '\0';j++)
							   {
													  m = i - 'a';
													  if (i == a.charAt(j))
													  {
														  b[m] = b[m] + 1;
													  }
							   }
						  }
						  for (j = 0;j < 26;j++)
						  {
							 if (b[j] == 1)
							 {
									  i = 'a' + j;
									  no = 1;
									  for (m = 0;a.charAt(m) != '\0';m++)
									  {
															 if (a.charAt(m) == i && n > m)
															 {
																 n = m;
															 }
									  }
							 }
						  }
						  if (no == 1)
						  {
							  System.out.printf("%c\n",a.charAt(n));
						  }
						  else
						  {
							  System.out.print("no\n");
						  }
		  }
		  return 0;

	}
}

