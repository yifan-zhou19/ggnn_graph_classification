package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		String c = new String(new char[100]);
		int[] a = new int[100];
		while (scanf("%s",c) != EOF)
		{

			if (c.charAt(0) == '\0')
			{
				break;
			}
				System.out.printf("%s\n",c);
			k = c.length();
			for (i = 0;i <= k - 1;i++)
			{
				if (c.charAt(i) == '(')
				{
					a[i] = -1;
				}
			 else if (c.charAt(i) == ')')
			 {
				 a[i] = 1;
				 for (j = i;j >= 0;j--)
				 {
					 if (a[j] == -1)
					 {
					a[j] = 2;
					a[i] = 2;
					break;
					 }
				 }
			 }


				else
				{
					a[i] = 2;
				}
			}
			if (c.charAt(0) == ')')
			{
			   a[0] = 1;
			}

				for (i = 0;i <= k - 1;i++)
				{
					if (a[i] == 2)
					{
						System.out.print(" ");
					}
					if (a[i] == -1)
					{
						System.out.print("$");
					}
					if (a[i] == 1)
					{
						System.out.print("?");
					}
				}
		System.out.print("\n");
		}
	}

}
