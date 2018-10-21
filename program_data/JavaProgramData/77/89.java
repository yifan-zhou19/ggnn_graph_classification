package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] A = new int[80];
		int k = 1;
		String s = new String(new char[80]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
		   if (s.charAt(i) == s.charAt(0))
		   {
			   A[k] = i;
			   k++;
		   }
		   if (s.charAt(i) != s.charAt(0))
		   {
			  System.out.printf("%d %d\n",A[k - 1],i);
			  k--;
		   }
		}
		 return 0;
	}

}
