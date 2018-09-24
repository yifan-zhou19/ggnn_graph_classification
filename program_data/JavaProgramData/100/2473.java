package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int leap = 0;
		int i;
		int j;
		String s = new String(new char[301]);
		int[] b = new int[60];
		final String z = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			 if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			 {
			 for (j = 0;j < 52;j++)
			 {
							  leap = 1;
				 if (s.charAt(i) == z.charAt(j))
				 {
				 b[j]++;
				 }
			 }
			 }
		}
		if (leap == 0)
		{
		System.out.print("No");
		}
		else
		{
		   for (i = 0;i < 52;i++)
		   {
			if (b[i] != 0)
			{
			System.out.printf("%c=%d\n",z.charAt(i),b[i]);
			}
		   }
		}
	}
}
