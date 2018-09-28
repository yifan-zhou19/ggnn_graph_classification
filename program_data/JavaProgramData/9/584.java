package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int t;
		  int m;
		  int x;
		  int k;
		  char[][] a = new char[100][100];
		  String b = new String(new char[100]);
		  String c = new String(new char[100]);
		  char[][] d = new char[100][100];
		  String e = new String(new char[100]);
		  char[][] f = new char[100][100];
		  String s = new String(new char[100]);
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
			  a[i] = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = tangible.StringFunctions.changeCharacter(b, i, tempVar3);
		  }
		  }
		  k = 0;
		  for (i = 0;i < n;i++)
		  {
						  if (b.charAt(i) >= 60)
						  {
							  c = tangible.StringFunctions.changeCharacter(c, k, b.charAt(i));
							  d[k] = a[i];
							  k++;
						  }
		  }
		  for (i = 0;i < k - 1;i++)
		  {
						  for (j = 0;j < k - 1 - i;j++)
						  {
											  if (c.charAt(j) < c.charAt(j + 1))
											  {
												  t = c.charAt(j);
												  c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j + 1));
												  c = tangible.StringFunctions.changeCharacter(c, j + 1, t);
												  s = d[j];
												  d[j] = d[j + 1];
												  d[j + 1] = s;
											  }
						  }
		  }
		  for (i = 0;i < k;i++)
		  {
		  System.out.printf("%s\n",d[i]);
		  }
		  m = 0;
		  for (i = 0;i < n;i++)
		  {
						  if (b.charAt(i) < 60)
						  {
							  e = tangible.StringFunctions.changeCharacter(e, m, b.charAt(i));
							  f[m] = a[i];
							  m++;
						  }
		  }
		  for (i = 0;i < m;i++)
		  {
		  System.out.printf("%s\n",f[i]);
		  }
	}

}

