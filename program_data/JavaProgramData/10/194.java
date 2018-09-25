package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] s = new int[60];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int key = 1;
		for (int i = 0;i < n;i++)
		{
		   s[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   s[i + 30] = 1;
		   for (int j = i - 1;j >= 0;j--)
		   {
				   if (s[j] >= s[i])
				   {
						   if (s[j + 30] >= s[i + 30])
						   {
							   s[i + 30] = s[j + 30] + 1;
						   }
				   }
		   }
		   if (s[i + 30] > key)
		   {
			   key = s[i + 30];
		   }
		}
		System.out.print(key);

		return 0;
	}

}

