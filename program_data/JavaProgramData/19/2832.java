package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int k = 0;
		int len;
		final String s = "";
		final String a = "";
		final String b = "";
		final String temp = "";
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
	//	printf("%s\n",s);
	//	printf("%s\n",a);
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) != ' ')
			{
				temp.charAt(j)[k] = s.charAt(i);
				k++;
			}
			else
			{
				k = 0;
				j++;
			}
		}
		for (i = 0;i <= j;i++)
		{
		//	printf("%s\n",temp[i]);
			if (strcmp(a,temp.charAt(i)) == 0)
			{
				if (i == 0)
				{
					System.out.printf("%s",b);
				}
				else
				{
					System.out.printf(" %s",b);
				}
			}
			else if (i == 0)
			{
				System.out.printf("%s",temp.charAt(i));
			}
			else
			{
				System.out.printf(" %s",temp.charAt(i));
			}
		}
	}

}
