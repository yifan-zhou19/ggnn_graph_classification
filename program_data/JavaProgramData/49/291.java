package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[500]);
	  s = new Scanner(System.in).nextLine();
	  int i;
	  int j;
	  int k;
	  int l = 0;
	  int m = 0;
	  for (i = 2;i < s.length();i++)
	  {
	  for (j = i / 2;j <= (s.length() - i / 2);j++)
	  {
		  l = 0;
		 if (i % 2 == 0)
		 {
			for (k = 0;k < i / 2;k++)
			{
			if (s.charAt(j - k - 1) != s.charAt(j + k))
			{
				l = 1;
				break;
			}
			else
			{
				continue;
			}
			}
		 }
		   if (i % 2 == 1)
		   {
			  if (j == s.length() - i / 2)
			  {
			  break;
			  }
			  for (k = 1;k < (i / 2 + 1);k++)
			  {
			  if (s.charAt(j - k) != s.charAt(j + k))
			  {
					 l = 1;
					 break;
			  }
			  }
		   }
		  if (l == 0)
		  {
			  for (m = 0;m < i - 1;m++)
			  {
		   System.out.printf("%c",s.charAt(j - i / 2 + m));
			  }
		   System.out.printf("%c\n",s.charAt(j + i / 2 - 1));
		  }
	  }
	  }
	 return 0;
	}
}
