package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[800]);
	  a = new Scanner(System.in).nextLine();
	  int i;
	  int j;
	  int[] z = new int[300];
	  z[0] = 0;
	  for (i = 0,j = 0;a.charAt(i) != '\0';i++)
	  {
		 if (a.charAt(i) == ' ')
		 {
			if (a.charAt(i + 1) != ' ')
			{
				j++;
				z[j] = 0;
			}
		 }
		else
		{
		  z[j]++;
		}
	  }
	  for (i = 0;i < j;i++)
	  {
		  System.out.printf("%d,",z[i]);
	  }
	  System.out.printf("%d",z[j]);
	  return 0;
	}
}
