package <missing>;

public class GlobalMembers
{
	//?????????????????????????????????????
	//???????????????;break;???????
	//??????????????????

	public static void Main(String[] args)
	{
		String s = new String(new char[100]);
		int i;
		int j;

		while (scanf("%s",s) != EOF)
		{
			System.out.println(s);
			int[] a = new int[100];
			for (i = 0;s.charAt(i) != '\0';i++)
			{
				if (s.charAt(i) == '(')
				{
					a[i] = -1;
				}
				else if (s.charAt(i) == ')')
				{
					a[i] = 1;
				}
			}

				for (i = 0;s.charAt(i) != '\0';i++)
				{
					if (a[i] == 1)
					{
						for (j = i - 1;j >= 0;j--)
						{
							if (a[j] == -1)
							{
								a[i] = a[j] = 0;
								break;
							}
						}
					}
				}

				for (i = 0;s.charAt(i) != '\0';i++)
				{
					if (a[i] == 1)
					{
						System.out.print("?");
					}
					else if (a[i] == -1)
					{
						System.out.print("$");
					}
					else if (a[i] == 0)
					{
						System.out.print(" ");
					}
				}
				System.out.print("\n");
		}

	}
}
