package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final String zhen = ""; // to store the state of each room
		for (int i = 1; i <= n; i++) // input part
		{
			for (int j = 1; j <= n; j++)
			{
				zhen.charAt(i)[j] = ConsoleInput.readToWhiteSpace(true);
			}
		}
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final String zhen1 = "";
		if (m != 1)
		{
			for (int i = 1; i < m; i++)
			{
				  for (int i = 1; i <= n; i++) // build a new zhen1 to store the change of state of each day
				  {
					  for (int j = 1; j <= n; j++)
					  {
						  zhen1.charAt(i)[j] = zhen.charAt(i)[j]; // copy the whole zhen to the zhen1
					  }
				  }
				  for (int i = 1; i <= n; i++)
				  {
					  for (int j = 1; j <= n; j++)
					  { // make the change in the zhen1
						  if (zhen.charAt(i)[j] == '@' && zhen.charAt(i - 1)[j] != '#')
						  {
							  zhen1.charAt(i - 1)[j] = '@';
						  }
						  if (zhen.charAt(i)[j] == '@' && zhen.charAt(i + 1)[j] != '#')
						  {
							  zhen1.charAt(i + 1)[j] = '@';
						  }
						  if (zhen.charAt(i)[j] == '@' && zhen.charAt(i)[j - 1] != '#')
						  {
							  zhen1.charAt(i)[j - 1] = '@';
						  }
						  if (zhen.charAt(i)[j] == '@' && zhen.charAt(i)[j + 1] != '#')
						  {
							  zhen1.charAt(i)[j + 1] = '@';
						  }
					  }
				  }
				  for (int i = 1; i <= n; i++) // copy the whole zhen1 to the zhen
				  {
					  for (int j = 1; j <= n; j++)
					  {
						  zhen.charAt(i)[j] = zhen1.charAt(i)[j];
					  }
				  }
			}
		}
		int sum = 0; // count the number of  patients
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (zhen.charAt(i)[j] == '@')
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

