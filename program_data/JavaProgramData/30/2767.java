package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s = 0;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			 if (i % 7 != 0)
			 {
				 if (i % 10 != 7)
				 {
					 if (i / 10 != 7)
					 {
						 s = s + i * i;
					 }
				 }
			 }
		}
		System.out.print(s);
		return 0;
	}
}

