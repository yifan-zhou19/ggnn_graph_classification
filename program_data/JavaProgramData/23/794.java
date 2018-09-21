package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] inta = new int[10];
		int i = 1;
		int j;
		int k = 0;
		int m = 0;
		String str = new String(new char[100]);
		cin.get(str,100);


		for (i = 0;;i++)
		{
			if (str.charAt(i) == ' ' || str.charAt(i) == '\0')
			{
				inta[k] = i;
				k++;
				if (str.charAt(i) == '\0')
				{
						m = k - 1;
					 break;
				}
			}
		}

		for (j = m;j >= 1;j--)
		{
			for (i = inta[j - 1] + 1;i <= inta[j] - 1;i++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.print(" ");
		}

		for (i = 0;i <= inta[0] - 1;i++)
		{
			System.out.print(str.charAt(i));
		}
		return 0;
	}
}
