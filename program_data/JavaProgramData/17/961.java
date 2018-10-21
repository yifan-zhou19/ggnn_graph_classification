package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		int l;

		while ((c = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			int[] a = new int[100];
			int left = 0;

			l = c.length();

			for (int i = 0; i < l; i++)
			{

				if (left == 0 && c.charAt(i) == ')')
				{
				a[i] = 1;
				}

				if (c.charAt(i) == '(')
				{
				left++;
				}

				if (c.charAt(i) == ')' && left > 0)
				{
					left--;

					for (int j = i; j >= 0; j--)
					{
						if ((c.charAt(j) == '(') && (a[j] != 2))
						{
							a[j] = 2;
							break;
						}
					}
				}
			}

			int count = 0;

			if (left != 0)
			{
			for (int i = l; count < left; i--)
			{
				if (c.charAt(i) == '(' && a[i] != 2)
				{
					a[i] = -1;
					count++;
				}
			}
			}

			for (int i = 0; i < l; i++)
			{
			System.out.print(c.charAt(i));
			}

			System.out.print("\n");

			for (int i = 0; i < l; i++)
			{
				if (a[i] == 0 || a[i] == 2)
				{
				System.out.print(" ");
				}
				else if (a[i] == 1)
				{
				System.out.print('?');
				}
				else if (a[i] == -1)
				{
				System.out.print('$');
				}
			}

			System.out.print("\n");

		}

		return 0;
	}
}

