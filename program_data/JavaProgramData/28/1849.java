package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


	String s = new String(new char[N]);
	s = new Scanner(System.in).nextLine();
	int n;
	int i;
	int j = 0;
	int m = 0;
	int q = 0;
	n = s.length();
	for (i = 0;i < n;i++)
	{
		if (s.charAt(i) != ' ')
		{

			j++;
		}
		else
		{
			if (s.charAt(i + 1) == ' ')
			{
			continue;
			}
			q++;
			if (q == 1)
			{
			System.out.printf("%d",j);
			}
			else if (q > 1)
			{
			   System.out.printf(",%d",j);
			}
			j = 0;
		}
	if (i == n - 1)
	{
		 if (q == 0)
		 {
		  System.out.printf("%d",j);
		 }
		  else
		  {
		  System.out.printf(",%d",j);
		  }
	}

	}
	return 0;
	}

}
