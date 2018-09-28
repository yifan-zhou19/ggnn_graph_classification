package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int j = 0;
		int i = 3;
		int k = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i <= 7)
		{
			 if (a % i == 0)
			 {
			 j++;
			 }
			 i += 2;
		}
		if (j == 0)
		{
		System.out.print("n");
		}
		else
		{
			i = 3;
			while (i <= 7)
			{
				  if (a % i != 0)
				  {
					i += 2;
					continue;
				  }
				  System.out.print(i);
				  i += 2;
				  k++;
				  if (k == j)
				  {
				  break;
				  }
				  System.out.print(" ");
			}
		}
		return 0;
	}


}

