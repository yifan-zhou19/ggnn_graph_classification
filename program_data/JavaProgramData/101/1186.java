package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] d = new int[3];
		int A1;
		int B1;
		int C1;
		int i;
		int j;
		int m;
		int[] a = new int[3];
		String c = new String(new char[3]);
		char n;
		c = tangible.StringFunctions.changeCharacter(c, 0, 'A');
		c = tangible.StringFunctions.changeCharacter(c, 1, 'B');
		c = tangible.StringFunctions.changeCharacter(c, 2, 'C');
		for (d[0] = 1;d[0] <= 3;d[0]++)
		{
		for (d[1] = 1;d[1] <= 3;d[1]++)
		{
		for (d[2] = 1;d[2] <= 3;d[2]++)
		{
			a[0] = d[0];
			a[1] = d[1];
			a[2] = d[2];
		  if (d[0] != d[1] && d[0] != d[2] && d[1] != d[2])
		  {
			  A1 = (d[1] > d[0]);
			  B1 = (d[0] > d[1]) + (d[0] > d[2]);
			  C1 = (d[2] > d[1]) + (d[1] > d[0]);
			  if (d[0] + A1 == 3 && d[1] + B1 == 3 && d[2] + C1 == 3)
			  {
				for (i = 0;i < 2;i++)
				{
				for (j = 0;j < 2 - i;j++)
				{
					if (a[j] > a[j + 1])
					{
						m = a[j];
						a[j] = a[j + 1];
						a[j + 1] = m;
					n = c.charAt(j);
					c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j + 1));
					c = tangible.StringFunctions.changeCharacter(c, j + 1, n);
					}
				}
				}
			  }
		  }
		}
		}
		}
		System.out.printf("%c%c%c\n",c.charAt(0),c.charAt(1),c.charAt(2));
		return 0;
	}
}

