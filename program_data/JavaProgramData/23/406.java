package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] a = new int[105];
		String str = new String(new char[102]);
		cin.get(str,102,'\n');
		a[0] = str.length();
		k = 0;
		for (i = a[0];i > 0;i--)
		{
			if (str.charAt(i) == ' ')
			{
				k++;
				a[k] = i;
				for (j = a[k] + 1;j < a[k - 1];j++)
				{
					System.out.print(str.charAt(j));
				}
				System.out.print(' ');
			}

		}
		for (i = 0;i < a[k];i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}
