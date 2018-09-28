package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String origin = new String(new char[30000]);
	  origin = new Scanner(System.in).nextLine();

	  int i;
	  int total = 0;
	  int first = 1;

	  for (i = 0; origin.charAt(i); i++)
	  {
		if (origin.charAt(i) != ' ')
		{
		  ++total;
		}
		else
		{
		  if (origin.charAt(i - 1) != ' ')
		  {
			if (first == 1)
			{
			  System.out.printf("%d", total);
			  first = 0;
			}
			else
			{
			  System.out.printf(",%d", total);
			}
		  }
		  total = 0;
		}
	  }

	  if (first == 1)
	  {
		System.out.printf("%d",total);
	  }
	  else
	  {
		System.out.printf(",%d",total);
	  }
	  return 0;
	}
}
