package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		  int i;
		  int j;
		  int n;
		  int la;
		  int lb;
		  int aa;
		  int bb;
		  int cc;
		  char[][] a = new char[100][100];
		  char[][] b = new char[100][100];
		  char[][] c = new char[100][100];
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
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = tempVar3.charAt(0);
				}
		  }
		  for (j = 0;j < n;j++)
		  {
			  la = String.valueOf(a[j]).length();
			  lb = String.valueOf(b[j]).length();
			  for (i = 0;i < la;i++)
			  {
					if ((lb - 1 - i) >= 0)
					{
						  aa = a[j][la - 1 - i] - 48;
						  bb = b[j][lb - 1 - i] - 48;
						  if (aa >= bb)
						  {
							   cc = aa - bb;
						  }
						  if (aa < bb)
						  {
								aa = aa + 10;
								cc = aa - bb;
								a[j][la - 2 - i] = a[j][la - 2 - i] - 1;
						  }
						  c[j][la - 1 - i] = cc + 48;
					}
					if ((lb - 1 - i) < 0)
					{
						  c[j][la - 1 - i] = a[j][la - 1 - i];
					}
			  }
		  }
		  for (i = 0;i < n;i++)
		  {
				System.out.printf("%s\n",c[i]);
		  }
	}
}

