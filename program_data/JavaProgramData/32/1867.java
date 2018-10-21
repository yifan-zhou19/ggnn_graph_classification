package <missing>;

public class GlobalMembers
{
	public static void subtr(String a, String b)
	{
		int[] c = new int[101];
		int i;
		int k;
		int d = 0;
		for (i = 0;i <= 100;i++)
		{
			a[i] = a[i] - '0';
			b[i] = b[i] - '0';
		}
		for (i = 100;i >= 0;i--)
		{
			if ((a[i] - b[i]) < 0)
			{
				a[i - 1] = a[i - 1] - 1;
				c[i] = a[i].Substring(10) - b[i];
			}
			else
			{
				c[i] = a[i] - b[i];
			}
		}
		for (k = 0;k < 100;k++)
		{
				if (c[k] == 0)
				{
					d++;
				}
				else
				{
					break;
				}
		}
			for (k = d;k < 101;k++)
			{
				System.out.printf("%d",c[k]);
			}
			System.out.print("\n");

	}

	public static void Main()
	{
		int l;
		int k;
		int i;
		int j;
			int[] l1 = new int[20];
			int[] l2 = new int[20];
		char m;
		char[][] a = new char[20][101];
		char[][] b = new char[20][101];
		String c = new String(new char[101]);
		String d = new String(new char[101]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
			for (i = 1;i <= l;i++)
			{
			for (j = 1;j <= 100;j++)
			{
				a[i][j] = '\0';
				b[i][j] = '\0';
			}
			}
		for (i = 1;i <= l;i++)
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
		for (i = 1;i <= l;i++)
		{
			  l1[i] = 0;
			  l2[i] = 0;
			  for (j = 0;j < 100;j++)
			  {
				 if (a[i][j] != '\0')
				 {
				 l1[i] = l1[i] + 1;
				 }
			  }
			  for (j = 0;j < 100;j++)
			  {
			   if (b[i][j] != '\0')
			   {
				 l2[i] = l2[i] + 1;
			   }
			  }
		}



		for (i = 1;i <= l;i++)
		{
			for (j = 0;j < 100;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, a[i][j]);
				d = tangible.StringFunctions.changeCharacter(d, j, b[i][j]);
			}
			for (k = 100;k >= (101 - l1[i]);k--)
			{
				c = tangible.StringFunctions.changeCharacter(c, k, c.charAt(k - (101 - l1[i])));
			}

			for (k = 0;k < (101 - l1[i]);k++)
			{
				c = tangible.StringFunctions.changeCharacter(c, k, '0');
			}

			for (k = 100;k >= (101 - l2[i]);k--)
			{
				d = tangible.StringFunctions.changeCharacter(d, k, d.charAt(k - (101 - l2[i])));
			}
			for (k = 0;k < (101 - l2[i]);k++)
			{
				d = tangible.StringFunctions.changeCharacter(d, k, '0');
			}


			subtr(c, d);
		}
	}


}

