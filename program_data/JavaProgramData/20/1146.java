package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] f = new int[300][300];
		String s1 = new String(new char[300]);
		String s2 = new String(new char[300]);
		int l1;
		int max;
		int p;
		int i;
		   while (scanf("%s%s",s1,s2) != EOF)
		   {
			l1 = s1.length();
			max = 0;
			p = 0;
			for (i = 0;i < l1;i++)
			{
			   if (s1.charAt(i) > max)
			   {
				 max = s1.charAt(i);
				 p = i;
			   }
			}
			for (i = 0;i < l1;i++)
			{
			   System.out.printf("%c",s1.charAt(i));
			   if (p == i)
			   {
				 System.out.printf("%s",s2);
			   }
			}

			System.out.print("\n");
		   }

	}
}
