package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String[] aa = new String[1000];
			int[] b = new int[1000];
			int i;
			int n = 0;
			a = new Scanner(System.in).nextLine();
			aa[n++] = a;
			for (i = 0;a.charAt(i);i++)
			{
			if (a.charAt(i) == ' ')
			{
					   a = a.substring(0, i);
					   aa[n++] = i + a.Substring(1);
			}
			}
			for (i = 0;i < n;i++)
			{
				if (i < n - 1)
				{
			 b[i] = String.valueOf(aa[i]).length();
			 if (b[i] > 0)
			 {
			 System.out.printf("%d,",b[i]);
			 }
				}
			 else if (i == n - 1)
			 {
				 b[i] = String.valueOf(aa[i]).length();
			 if (b[i] > 0)
			 {
					  System.out.printf("%d",b[i]);
			 }
			 }
			}
			   return 0;
	}

}
