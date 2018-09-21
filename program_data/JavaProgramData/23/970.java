package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  final String a = "";
	  int i;
	  int j;
	  int n;
	  int k;
	  int m;
	  a = new Scanner(System.in).nextLine();
	  for (i = 0;i < 100;i++)
	  {
		  if (a.charAt(i) == '\0')
		  {
		  n = i - 1;
		  break;
		  }
	  }
	  for (i = n,j = n;i >= 0;i--)
	  {
		if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
		{
		  for (k = i + 1;k < j + 1;k++)
		  {
			  System.out.printf("%c",a.charAt(k));
		  }
		  System.out.print(" ");
		  m = i;
		  for (;1;i--)
		  {
			  if (a.charAt(i) != ' ')
			  {
			  j = i;
			  break;
			  }
		  }
		  i = m;
		}
		else if (i == 0 && a.charAt(0) != ' ')
		{
			for (k = i;k <= j;k++)
			{
				System.out.printf("%c",a.charAt(k));
			}
		}
	  }
	}

}
