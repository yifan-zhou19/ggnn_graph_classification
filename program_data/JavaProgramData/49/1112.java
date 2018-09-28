package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[501]);
	int a;
	int c;
	int i;
	int j;
	int m;
	int n;
	int temp;
	str = new Scanner(System.in).nextLine();
	c = str.length();
	for (i = 1;i <= c;i++)
	{
			for (j = 0;j < c - i;j++)
			{
				temp = 0;
				m = j;
				n = j + i;
				while (m < n)
				{
								if (str.charAt(m) == str.charAt(n))
								{
									m++;
									n--;
								}
								else
								{
									temp = 0;
									break;
								}
								temp = 1;
				}
				if (temp == 1)
				{
				   for (a = j;a <= i + j;a++)
				   {
					   System.out.printf("%c",str.charAt(a));
				   }
				   System.out.print("\n");
				}
			}
	}
	return 0;
	}

}
