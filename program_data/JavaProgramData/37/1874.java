package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] t = new int[100000];
		  int i;
		  int j;
		  int k;
		  int q;
		  int count;
		  int mark;
		  String a = new String(new char[100000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  q = Integer.parseInt(tempVar);
		  }
		  mark = 0;
		  for (i = 0;i < q;i++)
		  {
	mark = 0;
						  for (j = 0;j < 100000;j++)
						  {
											   a = tangible.StringFunctions.changeCharacter(a, j, '\0');
											   t[j] = 0;
						  }
						  count = 0;
						  a = new Scanner(System.in).nextLine();
						  for (j = 0;j < 100000;j++)
						  {
											   if (a.charAt(j) == '\0')
											   {
												   break;
											   }
											   count++;
						  }
						  for (j = 0;j < count;j++)
						  {
											  for (k = 0;k < count;k++)
											  {
																  if (a.charAt(k) == a.charAt(j))
																  {
																	  t[j]++;
																  }
											  }
						  }
						  for (j = 0;j < count;j++)
						  {
											  if (t[j] == 1)
											  {
														 System.out.printf("%c\n",a.charAt(j));
														 mark = 1;
														 break;
											  }

						  }
						  if (mark == 0)
						  {
							  System.out.print("no\n");
						  }
		  }
	}
}

