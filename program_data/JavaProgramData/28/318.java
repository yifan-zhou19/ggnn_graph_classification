package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int x;
		int m = 0;
		int p = 0;
		int t = 0;
		String a = new String(new char[10000]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			t++;
		}
		for (i = 0;i <= t;i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != '\0')
			{
				 p++;
			}
			if (a.charAt(i) == ' ')
			{
			   if (p != 0)
			   {
				   System.out.printf("%d,",p);
				   p = 0;
			   }
			}
			if (a.charAt(i) == '\0')
			{
			   if (p != 0)
			   {
				   System.out.printf("%d",p);
				   p = 0;
			   }
			}
		}
	}

}
