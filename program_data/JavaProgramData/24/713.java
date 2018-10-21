package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String juzi = new String(new char[3000]);
	   juzi = new Scanner(System.in).nextLine();
	   int n = juzi.length();
	   int i;
	   int cishu = 0;
	   char[][] danci =
	   {
		   {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	   };
	   int m = 0;
	   int j = 0;
	   for (i = 0; i < n; i++)
	   {
		   if (juzi.charAt(i) != ' ')
		   {
			danci[m][j] = juzi.charAt(i);
			j += 1;
		   }
		   if (juzi.charAt(i) == ' ')
		   {
			m += 1;
			j = 0;
		   }
	   }
	   int[] chang = new int[50];
	   int t;
	   for (i = 0; i <= m; i++)
	   {
		   chang[i] = String.valueOf(danci[i]).length();
	   }
	   for (i = 0; i <= m; i++)
	   {
		  for (j = m; j > i; j--)
		  {
			  if (chang[j] > chang[j - 1])
			  {
				 t = chang[j];
				 chang[j] = chang[j - 1];
				 chang[j - 1] = t;
			  }
		  }
	   }
	   int max = chang[0];
	   int min = chang[m];
	   cishu = 0;
	   int sum = 0;
	   for (i = 0; i <= m; i++)
	   {
		   if (String.valueOf(danci[i]).length() == max && cishu == 0)
		   {
			 System.out.printf("%s", danci[i]);
			 cishu += 1;
		   }
	   }
	   for (i = 0; i <= m; i++)
	   {
		   if (String.valueOf(danci[i]).length() == min && sum == 0)
		   {
			 System.out.printf("\n%s", danci[i]);
			 sum += 1;
		   }
	   }
		return 0;
	}
}
