package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int i;
		int n = 0;
		int t;
		String p;
		String a = new String(new char[100]);
		p = a;
		p = new Scanner(System.in).nextLine();



		for (i = 0;i < 99;i++)
		{
			if ((*(p.Substring(i))) != '\0')
			{
			 n++;
			}
			else
			{
				break;
			}
		}

		for (k = n - 1;k >= 0;k--)
		{
			if (*(p.Substring(k)) == ' ')
			{
				for (t = k + 1;t < n;t++)
				{
					System.out.printf("%c",*(p.Substring(t)));
				}
				 System.out.print(" ");
				 n = k;
			}
		}
		for (t = 0;t < n;t++)
		{
			System.out.printf("%c",*(p.Substring(t)));
		}

	}
}
