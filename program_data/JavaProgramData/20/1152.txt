package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		while (scanf("%s%s", s1, s2) != EOF)
		{
			  j = 0;
			  k = 0;
			  for (i = 0;i < s1.length();i++)
			  {
				  if ((int)s1.charAt(i) > j)
				  {
					 j = (int)s1.charAt(i);
					 k = i;
				  }
			  }
			  for (i = 0;i < s1.length();i++)
			  {
				  System.out.print(s1.charAt(i));
				  if (i == k)
				  {
					 for (j = 0;j < s2.length();j++)
					 {
						 System.out.print(s2.charAt(j));
					 }
				  }
			  }
			  System.out.print("\n");
		}
	}

}
