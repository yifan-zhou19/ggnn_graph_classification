package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] s1 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] s2 = {0, '\0', '\0', '\0'};
		String p;
		int i;
		int n;
		int m;
		while (scanf("%s%s",s1,s2) != EOF)
		{
			  n = s1.length();
		 p = s1[0];
		 for (i = 0;i < n;i++)
		 {
		 if (p < s1[i])
		 {
			 p = s1[i];
		 }
		 }
		 m = p - s1[0] + 1;
		 for (i = 0;i < m;i++)
		 {
		 System.out.printf("%c",s1[i]);
		 }
		 System.out.printf("%s",s2);
		 for (i = m;s1[i] != 0;i++)
		 {
		 System.out.printf("%c",s1[i]);
		 }
		 System.out.print("\n");
		}
	}

}
