package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][20];
		String b = new String(new char[100]);
		char c;
		int i = 0;
		int j = 0;
		int k = 0;
		int m;
		int n;
		b = null;
		while ((c = System.in.read()) != '\n')
		{
				 if (c != ' ')
				 {
					  a[i][j] = c;
					  j++;
					  b.charAt(i)++;
				 }
				 else
				 {
					i++;
					b = b.substring(0, i);
					j = 0;
				 }
		}
		for (m = i;m >= 0;m--)
		{
			if (m > 0)
			{
			   for (n = 0;n < b.charAt(m);n++)
			   {
				  System.out.print(a[m][n]);
			   }
			   System.out.print(" ");
			}
			else
			{
				for (n = 0;n < b.charAt(m);n++)
				{
					System.out.print(a[m][n]);
				}
			}
		}
		return 0;
	}
}
