package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		int k = 0;
		int[] p = new int[320];
		int[] q = new int[320];
		String s = new String(new char[9999]);
		String t = new String(new char[9999]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 1;i < l + 1;i++)
		{
			  t = tangible.StringFunctions.changeCharacter(t, i, s.charAt(i - 1));
		}
		t = tangible.StringFunctions.changeCharacter(t, 0, ' ');
		t = tangible.StringFunctions.changeCharacter(t, l + 1, ' ');
		for (i = 1;i < l + 1;i++)
		{
			   if (t.charAt(i) != ' ' && t.charAt(i - 1) == ' ')
			   {
					p[k] = i - 1;
					k++;
			   }
		}
		   k = 0;
		 for (i = 1;i < l + 2;i++)
		 {
			  if (t.charAt(i) != ' ' && t.charAt(i + 1) == ' ')
			  {
					 q[k] = i;
					 k++;
			  }
		 }
		 for (i = 0;i < k - 1;i++)
		 {
			  System.out.printf("%d,",q[i] - p[i]);
		 }
		 System.out.printf("%d\n",q[k - 1] - p[k - 1]);
		return 0;
	}


}

