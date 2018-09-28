package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int i;
		int j;
		int k;
		int l;
		int flag;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 1; i < l; i++)
		{
			for (j = 0; j < l - i; j++)
			{
			   flag = 1;
			   for (k = j; k <= j + i; k++)
			   {
				   if (a.charAt(k) != a.charAt(2 * j + i - k))
				   {
					   flag = 0;
				   }
			   }
			   if (flag != 0)
			   {
				   for (k = j; k <= j + i; k++)
				   {
					  System.out.print(a.charAt(k));
				   }
				   System.out.print("\n");
			   }
			}
		}
		return 0;
	}
}
