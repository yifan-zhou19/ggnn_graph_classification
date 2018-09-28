package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len1;
		int len2;
		int i;
		int j;
		int m;
		int control = 0;
		String st = new String(new char[256]);
		String sub = new String(new char[256]);
		String re = new String(new char[256]);
		st = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		re = new Scanner(System.in).nextLine();
		len1 = st.length();
		len2 = sub.length();
		int k = 0;
		for (i = 0,j = 0;i < len1;i++)
		{
			if (k == 0 && sub.charAt(j) == st.charAt(i))
			{
				if (len2 == 1)
				{
					for (m = 0;m < i;m++)
					{
						System.out.printf("%c",st.charAt(m));
					}
					System.out.printf("%s",re);
					for (m = m + 1;m < len1;m++)
					{
						System.out.printf("%c",st.charAt(m));
					}
					control = 1;
					break;
				}
				else
				{
					k++;
					j++;
				}
			}
			else if (k != 0 && sub.charAt(j) != st.charAt(i))
			{
				k = 0;
				j = 0;
			}
			else if (k != 0 && sub.charAt(j) == st.charAt(i))
			{
				if (j == len2 - 1)
				{
					for (m = 0;m < i - j;m++)
					{
						System.out.printf("%c",st.charAt(m));
					}
					System.out.printf("%s",re);
					for (m = m + len2;m < len1;m++)
					{
						System.out.printf("%c",st.charAt(m));
					}
					System.out.print("\n");
					control = 1;
					break;
				}
				else
				{
					k++;
					j++;
				}
			}
		}
		if (control == 0)
		{
			System.out.println(st);
		}
		return 0;
	}

}
