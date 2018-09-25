package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int l;
		int i;
		int j;
		int k;
		int n = 0;
		String str = new String(new char[1000]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = str.length();
		for (i = 0; i <= l; i++)
		{
			if (str.charAt(i) == str.charAt(0))
			{
				a[i] = 1;
			}
			else
			{
				a[i] = 2;
			}
		}
		for (j = 0; j <= l - 1; j++)
		{
			if (a[j] == 2)
			{
				for (k = j - 1; k >= 0; k--)
				{
					if (a[k] == 1)
					{
						System.out.print(k);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
						a[j] = 0;
						a[k] = 0;
						j = 0;
						k = 0;
						break;
					}
				}
			}
		}
		return 0;
	}



}

