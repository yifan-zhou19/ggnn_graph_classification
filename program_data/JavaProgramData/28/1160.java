package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		int n = 0;
		int i;
		int j;
		int[] wn = new int[300];
		int wd = 0;
		int t = 0;
		s = new Scanner(System.in).nextLine();
		s += " ";
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == ' ')
			{
		  wd = 0;
		  if (s.charAt(i - 1) != ' ' && i >= 1)
		  {
			  wn[n] = i - t;
		  }
			}
		   else
		   {
			 if (wd == 0)
			 {
				n++;
			  wd = 1;
			  t = i;
			 }

		   }
		}
		for (i = 1;i < n;i++)
		{
			System.out.printf("%d,",wn[i]);
		}
		System.out.printf("%d",wn[n]);
	}
}
