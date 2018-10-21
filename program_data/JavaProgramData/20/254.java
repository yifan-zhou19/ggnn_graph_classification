package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int k;
		int f;
		for (i = 0;;i++)
		{
			char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}; //???????
			char[] sub = {0, '\0', '\0', '\0'};
			char[] str1 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			char c;
			a = 0;
			j = 0;
			b = 0;
			f = 0;
			k = 0;
			n = 0;
			str = new Scanner(System.in).nextLine();
			if (str[0] == 0)
			{
				break;
			}
			k = str.length();
			while (str[j] != ' ')
			{
				str1[j] = str[j]; //??str1
				j++;
			}
			n = str1.length();
			b = j + 1;
			while (b < k && f < 3)
			{
				sub[f] = str[b]; //??sub
				b++;
				f++;
			}
			c = str1[0];
			for (j = 1;j < n;j++)
			{
				if (c < str1[j])
				{
					c = str1[j]; //?????
				}
			}
			for (j = 0;j < n;j++)
			{
				if (str1[j] == c)
				{
					a = j + 1; //???
					break;
				}
			}
			for (j = 0;j < a;j++)
			{
				System.out.printf("%c",str1[j]);
			}
			System.out.printf("%s",sub);
			for (j = a;j < n;j++)
			{
				System.out.printf("%c",str1[j]);
			}
			System.out.print("\n");
		}

	}
}
