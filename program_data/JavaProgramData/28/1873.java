package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int num = 0;
		int l = 0;
		int temp = 0;
		String words = new String(new char[LEN]);
		words = new Scanner(System.in).nextLine();
		l = words.length();
		for (i = 0;i < l;i++)
		{
		  if (words.charAt(i) != ' ')
		  {
			num++;
			if (i == l - 1)
			{
			  System.out.printf("%d",num);
			}
		  }
		  if (words.charAt(i) == ' ')
		  {
			if (num != 0)
			{
			  System.out.printf("%d",num);
			  System.out.print(",");
			}
			num = 0;
		  }
		}
		return 0;
	}


}
