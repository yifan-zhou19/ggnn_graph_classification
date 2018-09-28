package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int i;
	  int k = 0;
	  final String a = "";
	  a = new Scanner(System.in).nextLine();
	  for (i = 0;i < 9999;i++)
	  {
			if (a.charAt(i) == ' ' || a.charAt(i) == '\0')
			{
			  System.out.printf("%d",i);
		   k = i;
		   break;
			}
	  }
	  if (a.charAt(i) == ' ')
	  {
		  for (i = k + 1;i < 9999;i++)
		  {
		   if (a.charAt(i) == '\0')
		   {
			System.out.printf(",%d",i - k - 1);
		 break;
		   }

		if (a.charAt(i) == ' ' && a.charAt(i - 1) != ' ')
		{
		  System.out.printf(",%d",i - k - 1);
		  k = i;
		}
		  if (a.charAt(i) == a.charAt(i + 1) && a.charAt(i) == ' ')
		  {
		   k = k + 1;
		  }
		  }
	  }
	}

}
