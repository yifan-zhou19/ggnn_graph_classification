package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String zfc = new String(new char[LEN]);
	   char[][] dc = new char[N][LEN];
	   int i;
	   int len;
	   int m;
	   int n;
	   int k;
	   zfc = new Scanner(System.in).nextLine();
	   len = zfc.length();
	   m = 0;
	   n = 0;
	   for (i = 0;i < len;i++)
	   {
		   if (zfc.charAt(i) != ' ' && zfc.charAt(i) != ',')
		   {
			   dc[m][n] = zfc.charAt(i);
			   n++;
		   }
		   else
		   {
				if (zfc.charAt(i + 1) != ' ' && zfc.charAt(i + 1) != ',')
				{
				dc[m][n] = '\0';
				m++;
				n = 0;
				}
		   }
	   }
	   dc[m][n] = '\0';
	   for (k = 1;k <= m + 1;k++)
	   {
		  for (i = 0;i < m + 1 - k;i++)
		  {
			 if (String.valueOf(dc[i + 1]).length() > String.valueOf(dc[i]).length())
			 {
				String e = new String(new char[LEN]);
				e = dc[i + 1];
				dc[i + 1] = dc[i];
				dc[i] = e;
			 }
		  }
	   }
	   System.out.printf("%s\n",dc[0]);
	   for (k = 1;k <= m + 1;k++)
	   {
		  for (i = 0;i < m + 1 - k;i++)
		  {
			if (String.valueOf(dc[i + 1]).length() < String.valueOf(dc[i]).length())
			{
				String e = new String(new char[LEN]);
			  e = dc[i + 1];
				dc[i + 1] = dc[i];
				dc[i] = e;
			}
		  }
	   }
	  System.out.printf("%s\n",dc[0]);
		return 0;
	}

}
