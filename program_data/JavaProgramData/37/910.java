package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String a = new String(new char[100000]);
		  int m;
		  for (m = 1;m <= n;m++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = tempVar2.charAt(0);
			  }
			  int count1;
			  int count2;
			  int i;
			  int j;
			  count2 = 0;
			  for (i = 0;a.charAt(i) != '\0';i++)
			  {
				  if (a.charAt(i) != '1')
				  {
								count1 = 1;
								for (j = i + 1;a.charAt(j) != '\0';j++)
								{
									if (a.charAt(j) == a.charAt(i))
									{
												   count1++;
												   a = tangible.StringFunctions.changeCharacter(a, j, '1');
									}
								}
								if (count1 == 1)
								{
											  System.out.printf("%c\n",a.charAt(i));
											  count2++;
											  break;
								}
				  }
			  }
			  if (count2 == 0)
			  {
				   System.out.print("no");
			  }
		  }
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}





}

