package <missing>;

public class GlobalMembers
{
	public static char c1;
	public static char c2;
	public static int num;
	public static int k = 0;
	public static int[][] s = new int[1000][2];
	public static int Main()
	{
		void f(char str[1000]);
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		c1 = a.charAt(0);
		int i;
		int j;

		num = a.length();
		for (i = 1;i < num;i++)
		{
			if (a.charAt(i) != c1)
			{
				c2 = a.charAt(i);
				break;
			}
		}
		f(a);
		int temp1;
		int temp2;
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k - 1 - i;j++)
			{
				if (s[j][1] > s[j + 1][1])
				{
					temp1 = s[j + 1][1];
					s[j + 1][1] = s[j][1];
					s[j][1] = temp1;
					temp2 = s[j + 1][0];
					s[j + 1][0] = s[j][0];
					s[j][0] = temp2;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d %d\n", s[i][0], s[i][1]);
		}
		System.out.print("\n");
		return 0;
	}
	public static void f(String str)
	{
		int i;
		int j;


		num = str.length();
		for (i = 0;i < num - 1;i++)
		{

			   if (str[i].equals(c1) && str[i + 1].equals(c2))
			   {
				  s[k][0] = i;
				  s[k++][1] = i + 1;
				  str[i] = ' ';
				  str[i + 1] = ' ';

			   }
			   else
			   {
				 for (j = i;j < num - 1;j++)
				 {
					 int p;
					 int judge = 0;
					if (str[i].equals(c1) && str[j].equals(' ') && str[j + 1].equals(c2))
					{
						for (p = i + 1;p <= j;p++)
						{
							if (str[p].equals(' '))
							{
								judge = judge+1;
							}
							if (judge == j - i)
							{
								s[k][0] = i;
								s[k++][1] = j + 1;
							  str[i] = ' ';
							  str[j + 1] = ' ';
							  break;
							}
						}
					}
				 }

			   }

		}

		if (k * 2 < num)
		{
			f(str); //zhuyixunhuanjiesudexianzhitiaojian
		}

	}


}
