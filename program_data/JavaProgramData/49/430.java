package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int i;
	  int j;
	  int k;
	  int n = 0;
	  final String a = "";
	  a = new Scanner(System.in).nextLine();
	  for (i = 0;i < 500;i++)
	  {
		  if (a.charAt(i) == '\0')
		  {
		 n = i;
		 break;
		  }
	  }
	  for (i = 1;i < n;i++)
	  {
		  for (j = 0;j + i < n;j++)
		  {
				for (k = j;k <= j + i;k++)
				{
					 if (a.charAt(k) != a.charAt(2 * j + i - k))
					 {
					 break;
					 }
				}
				if (k == j + i + 1)
				{
				for (k = j;k <= j + i;k++)
				{
					System.out.printf("%c",a.charAt(k));
				}
				System.out.print("\n");
				}
		  }
	  }
	}

}
