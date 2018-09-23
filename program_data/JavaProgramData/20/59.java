package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][100];
		char[][] b = new char[100][4];
		char[][] c = new char[100][100];
		char e;
		int i;
		int j;
		int max;
		int k;
		int l;
		for (i = 0;i < 10;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				b[i] = tempVar2.charAt(0);
			}
			l = (Character.SIZE / Byte.SIZE);
			max = a[i][0];
			for (j = 1;j < 10;j++)
			{
			  if (a[i][j] > max)
			  {
				  max = a[i][j];
			  }
			}
			for (j = 0;j < 10;j++)
			{

				c[i][j] = a[i][j];
				if (a[i][j] == max)
				{
					break;
				}
			}
			j++;
			for (k = j;k < j + 3;k++)
			{
				c[i][k] = b[i][k - j];
			}
			for (k = j + 3;k < 3 + l;k++)
			{
				c[i][k] = a[i][k - 3];
			}
			System.out.printf("%s\n",c[i]);
					  if ((e = System.in.read()) == EOF)
					  {
						  break;
					  }
		}

	}

}

