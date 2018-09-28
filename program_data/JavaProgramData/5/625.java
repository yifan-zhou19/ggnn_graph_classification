package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int len;
	   int ans = 0;
	   int len1;
	   double n;
	   char[][] s = new char[2][500];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Double.parseDouble(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   s[0] = tempVar2.charAt(0);
	   }
	   len1 = String.valueOf(s[0]).length();
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   s[1] = tempVar3.charAt(0);
	   }
	   len = String.valueOf(s[1]).length();
	   if (len1 != len)
	   {
		  System.out.print("error");
		  return 0;
	   }
		for (int j = 0;j < len1;j++)
		{
			if (s[0][j] != 'A' && s[0][j] != 'T' && s[0][j] != 'G' && s[0][j] != 'C')
			{
			 System.out.print("error");
			 return 0;
			}
		}
		for (int k = 0;k < len;k++)
		{
			if (s[1][k] != 'A' && s[1][k] != 'T' && s[1][k] != 'G' && s[1][k] != 'C')
			{
			 System.out.print("error");
			 return 0;
			}
		}
		if (len == len1)
		{
	   for (i = 0;i < len;i++)
	   {
		if (s[0][i] == s[1][i])
		{
			ans += 1;
		}
	   }
	   if (ans * 1.0 / len > n)
	   {
		   System.out.print("yes");
	   }
	   else
	   {
		   System.out.print("no");
	   }
		}
	   return 0;
	}
}

