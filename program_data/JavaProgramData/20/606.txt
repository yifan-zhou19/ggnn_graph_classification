package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max;
		int maxindex;
		int i;
		int j;
		int k;
		int m;
		int n;
		int l;
		String str1 = new String(new char[20]);
		String str2 = new String(new char[10]);
		while (scanf("%s%s",str1,str2) != EOF)
		{
		   max = 0;
		   for (i = 0;str1.charAt(i);i++)
		   {
			  if (str1.charAt(i) > max)
			  {
				max = str1.charAt(i);
				maxindex = i;
			  }
		   }
		   m = str1.length();
		   n = str2.length();
		   for (j = 0;j <= maxindex;j++)
		   {
			  System.out.printf("%c",str1.charAt(j));
		   }
		   for (k = 0;k < n;k++)
		   {
			   System.out.printf("%c",str2.charAt(k));
		   }
		   for (l = maxindex + 1;l < m;l++)
		   {
			   System.out.printf("%c",str1.charAt(l));
		   }
		   System.out.print("\n");
		}

	}
}
