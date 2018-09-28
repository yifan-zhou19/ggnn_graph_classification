package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[300][40];
		int n;
		int i;
		int[] a = new int[300];
		int flag = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word[i] = tempVar.charAt(0);
			}
		}

		int begin = 0;
		int j = 0;
		int s = String.valueOf(word[0]).length();

		for (i = 1; i < n; i++)
		{
			s += String.valueOf(word[i]).length() + 1;
			if (s > 80)
			{
				for (j = begin; j < i; j++)
				{
					if (flag == 0)
					{
						System.out.print(word[j]);
						a[j] = 1;
						flag = 1;
					}
					else
					{
						System.out.print(" ");
						System.out.print(word[j]);
						a[j] = 1;
					}
				}
				System.out.print("\n");
				flag = 0;
				begin = i;
				s = String.valueOf(word[i]).length();
			}
		}

		flag = 0;
		for (i = 0; i < n; i++)
		{
			if (a[i] == 0)
			{
				for (j = i; j < n; j++)
				{
					if (flag == 0)
					{
						System.out.print(word[j]);
						flag = 1;
					}
					else
					{
						System.out.print(" ");
						System.out.print(word[j]);
					}
				}
				break;
			}
		}

		return 0;
	}

}

