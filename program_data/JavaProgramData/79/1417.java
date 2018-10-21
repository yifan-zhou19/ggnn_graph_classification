package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  final String n = "";
		  int m;
		  int i;
		  int j;
		  int k;
		  int d;
		  int x = 1;
		  int num;

		  for (x = 1;x <= 2;)
		  {
						String tempVar = ConsoleInput.scanfRead();
						if (tempVar != null)
						{
							num = Integer.parseInt(tempVar);
						}
						String tempVar2 = ConsoleInput.scanfRead(" ");
						if (tempVar2 != null)
						{
							m = Integer.parseInt(tempVar2);
						}
						if (num == 0 && m == 0)
						{
						break;
						}
						if (num == 1)
						{
								  System.out.print("1\n");
								  continue;
						}
		  for (i = 0;i <= num - 1;i++)
		  {
				  n = tangible.StringFunctions.changeCharacter(n, i, '1');
		  }
		  int count = 0;
		  j = 1;
		  i = 0;
		  for (d = 1;;d++)
		  {

				  j = 0;
				for (;i <= num;)
				{
								  if (n.charAt(i) != '\0')
								  {
									  j = j + 1;
											   if (j == m)
											   {
												   n = tangible.StringFunctions.changeCharacter(n, i, '\0');
											   count++;
												break;
											   }
												if (i == num - 1 && j < m)
												{
												i = -1;
												}

								  }
									i = i + 1;
									if (i >= num)
									{
									i = 0;
									}

				}
				if (count == num - 1)
				{
				break;
				}
		  }
		  for (i = 0;i <= num;i++)
		  {
							 if (n.charAt(i) != '\0')
							 {
							 break;
							 }
		  }
		  System.out.printf("%d\n",i + 1);
		  }
	}


}

