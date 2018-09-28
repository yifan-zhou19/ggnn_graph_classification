package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			String a = new String(new char[100]);
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int[] count = new int[26];
			int sum;
			sum = 0;
			int i;
			int j;
			int[] b = new int[100];
			for (i = 0;i < 26;i++)
			{
					count[i] = 0;
			}
			for (i = 0;i < 100;i++)
			{
				b[i] = 0;
			}
			for (i = 0;i < a.length();i++)
			{
				count[a.charAt(i) - 'a']++;
			}
			for (i = 0;i < 26;i++)
			{
					if (count[i] == 1)
					{
					sum++;
					}
			}
			if (sum == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				for (i = 0;i < a.length();i++)
				{
					for (j = 0;j < a.length();j++)
					{
						if (a.charAt(i) == a.charAt(j))
						{
								b[i]++;
						}

					}
				}
				for (i = 0;i < a.length();i++)
				{
					if (b[i] == 1)
					{
						System.out.print(a.charAt(i));
						System.out.print("\n");
						break;
					}
				}
			}


		}
	}

}

