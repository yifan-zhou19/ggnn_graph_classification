package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int[] s = new int[100];
		int i = 0;
		int k = 0;
		  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  s[1] = 1;
		  for (k = 1;k <= n;k++)
		  {
			   for (i = 1;i <= 80;i++)
			   {
					s[i] = s[i] * 2;
			   }
			   for (i = 1;i <= 79;i++)
			   {
					 if (s[i] >= 10)
					 {
						 s[i + 1]++;
						 s[i] = s[i] % 10;
					 }
			   }
		  }
		for (i = 80;i >= 1;i--)
		{
			 if (s[i] != 0)
			 {
			 break;
			 }
		}
		for (;i >= 1;i--)
		{
		  System.out.print(s[i]);
		}
	return 0;
	}

}

