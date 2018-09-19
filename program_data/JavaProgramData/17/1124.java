package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char s;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int t;
		int[] b = new int[100];
		int[] c = new int[100];
		for (;;)
		{
			a = new Scanner(System.in).nextLine();
			if (a.charAt(0) == '\n')
			{
			break;
			}
			n = a.length();
			for (i = 0,j = 0,k = 0;i < n;i++)
			{
				if (a.charAt(i) == '(')
				{
					b[j] = i;
					j++;
				}
				else if (a.charAt(i) == ')')
				{
					c[k] = i;
					k++;
				}
			}
			for (i = n - 1;i >= 0;i--)
			{
				for (l = j - 1;l >= 0;l--)
				{
					if (b[l] == i)
					{
						for (t = 0;t < k;t++)
						{
							if (c[t] > i)
							{
								b[l] = -1;
								c[t] = -1;
								break;
							}
						}
						break;
					}
				}
			}
			System.out.printf("%s\n",a);
			for (i = 0;i < n;i++)
			{
				for (l = 0;l < j;l++)
				{
					if (b[l] == i)
					{
						System.out.print("$");
						break;
					}
				}
				if (l != j)
				{
				continue;
				}
				for (t = 0;t < k;t++)
				{
					if (c[t] == i)
					{
						System.out.print("?");
						break;
					}
				}
				if (t != k)
				{
				continue;
				}
				System.out.print(" ");
			}

		 System.out.print("\n");
		 a = tangible.StringFunctions.changeCharacter(a, 0, '\n');
		}
	}

}

