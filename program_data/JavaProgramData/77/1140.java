package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char p;
		String s = new String(new char[101]);
		int[] b = new int[101];
		int i;
		int j;
		int l;
		s = new Scanner(System.in).nextLine();
		p = s.charAt(0);
		l = s.length();
		for (i = 0;i < l;i++)
		{
		   if (s.charAt(i) == p)
		   {
			   b[i] = 1;
		   }
		   else
		   {
			   for (j = i - 1;j >= 0;j--)
			   {
				 if (b[j] == 1)
				 {
				 b[j] = 0;
				 break;
				 }
			   }
			   System.out.printf("%d %d\n",j,i);
		   }
		}

	}

}
