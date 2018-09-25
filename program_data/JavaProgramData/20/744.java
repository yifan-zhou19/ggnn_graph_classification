package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s1 = new char[103][12];
		char[][] s2 = new char[103][4];
		int i = 0;
		int j;
		int max = 0;
		int k;
		int u;
		int len;
			 while (scanf("%s%s",s1[i],s2[i]) != EOF)
			 {
				 i++;
			 }
			 for (j = 0;j < i;j++)
			 {
				 len = String.valueOf(s1[j]).length();
				 max = 0;
				 u = 0;
				 for (k = 0;k < len;k++)
				 {
					 if (s1[j][k] > max)
					 {
						 max = s1[j][k];
						 u = k;
					 }
				 }
				 for (k = 0;k <= u;k++)
				 {
				 System.out.printf("%c",s1[j][k]);
				 }
				 for (k = 0;k <= 2;k++)
				 {
					 System.out.printf("%c",s2[j][k]);
				 }
				 for (k = u + 1;k < len;k++)
				 {
					 System.out.printf("%c",s1[j][k]);
				 }
				 System.out.print("\n");
			 }

	}

}
