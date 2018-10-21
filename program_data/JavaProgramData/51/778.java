package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  int[] c = new int[500];
		  int p;
		  int max;
		  int count = 0;
		  String a = new String(new char[500]);
		  char[][] b = new char[500][5];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  max = 0;
		  for (i = 0;i < 500;i++)
		  {
							a = tangible.StringFunctions.changeCharacter(a, i, '\0');
							c[i] = 0;
							for (j = 0;j < 5;j++)
							{
											b[i][j] = '\0';
							}
		  }
		  a = new Scanner(System.in).nextLine();
		  for (i = 0;i < 500;i++)
		  {
							if (a.charAt(i) == '\0')
							{
								break;
							}
							else
							{
							count++;
							}
		  }
		  for (i = 0;i <= count - n;i++)
		  {
							  for (j = 0;j < n;j++)
							  {
											  b[i][j] = a.charAt(i + j);
							  }
		  }
		  for (i = 0;i < count - n;i++)
		  {
							  for (j = 0;j <= count - n;j++)
							  {
												  p = strcmp(b[i],b[i + j]);
												  if (p == 0)
												  {
												  c[i]++;
												  }
							  }
		  }
		  for (i = 0;i < 101;i++)
		  {
							  if (max <= c[i])
							  {
							  max = c[i];
							  }
		  }
		  if (max == 1)
		  {
		  System.out.print("NO");
		  }
		  else
		  {
			  System.out.printf("%d\n",max);
			  for (i = 0;i < 200;i++)
			  {
							  if (c[i] == max)
							  {
										   System.out.printf("%s\n",b[i]);
							  }
			  }
		  }
	}

}

