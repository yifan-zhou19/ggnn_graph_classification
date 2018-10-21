package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int j;
	 int k;
	 char[][] a = new char[100][100];
	 String c = new String(new char[100]);
	 c = new Scanner(System.in).nextLine();
	 for (j = 0;j < 100;j++)
	 {
		 for (i = 0;i < 100;i++)
		 {
			 a[j][i] = '\0';
		 }
	 }
	 for (i = 0,j = 0,k = 0;c.charAt(k) != '\0';k++)
	 {
		 if (c.charAt(k) != ' ')
		 {
		  a[i][j] = c.charAt(k);
		  j++;
		 }
		  if (c.charAt(k) == ' ')
		  {
			if (i != 0)
			{
			a[i][j] = ' ';
			}
			i++;
			j = 0;
		  }
	 }
		if (i != 0)
		{
		System.out.printf("%s ",a[i]);
		for (i = i - 1;i >= 0;i--)
		{
			System.out.printf("%s",a[i]);
		}
		}
		else
		{
		System.out.println(c);
		}
	}

}
