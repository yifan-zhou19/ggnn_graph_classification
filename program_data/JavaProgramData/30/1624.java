package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int sum = 0;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i < n + 1;i++)
	   {
			if (i % 7 != 0)
			{
				if (i % 10 != 7)
				{
					 if ((i / 10) % 10 != 7)
					 {
						 sum = sum + i * i;
					 }
				}
			}
	   }
		System.out.print(sum);
		return 0;
	}


}

