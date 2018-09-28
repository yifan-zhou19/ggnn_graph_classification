package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		int j;
		int k;
		String str = new String(new char[31]);
		str = new Scanner(System.in).nextLine();
		l = str.length();
		if (str.charAt(0) - '0' >= 0 && str.charAt(0) - '0' <= 9)
		{
				System.out.printf("%c",str.charAt(0));
				for (k = 1;;k++)
				{
				  if (str.charAt(k) - '0' >= 0 && str.charAt(k) - '0' <= 9)
				  {
				  System.out.printf("%c",str.charAt(k));
				  }
				  else
				  {
				  break;
				  }
				}
				System.out.print("\n");
		}
		for (i = 0;i < l - 1;i++)
		{
			if ((str.charAt(i) - '0' > 9 || str.charAt(i) < '0') && str.charAt(i + 1) - '0' <= 9 && str.charAt(i + 1) - '0' >= 0)
			{
			   for (j = i + 1;;j++)
			   {
				  if (str.charAt(j) - '0' <= 9 && str.charAt(j) - '0' >= 0)
				  {
				  System.out.printf("%c",str.charAt(j));
				  }
				  else if (str.charAt(j) == ' ')
				  {
				  break;
				  }
				  else
				  {
				  break;
				  }
			   }
			   System.out.print("\n");
			}
		}
		System.in.read();
		System.in.read();
	}
}
