package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len1; //???????
		int len2;
		int len3;
		String a = new String(new char[100]); //????
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		len1 = a.length();
		len2 = b.length();
		len3 = c.length();
		int i; //space????????
		int j = 0;
		int m;
		int n;
		int k;
		int[] space = new int[100];
		space[0] = 0;
		for (i = 0;i < len1;i++)
		{
			if (a.charAt(i) == ' ')
			{
				j = j + 1;
				space[j] = i + 1; //space[i]??i???+1???
									//?????i????
			}
		}
		for (i = 0;i < j;i++) //???????????
		{
			k = 0;
			for (m = space[i];m < space[i] + len2;m++) //?????len2?????
			{
				if (a.charAt(m) == b.charAt(m - space[i]))
				{
					k = k + 1; //???k?+1
				}
			}
			if (k == len2 && a.charAt(space[i] + len2) == ' ')
			{
				//??????????(?youself?you???s,??)**
				System.out.print(c);
				System.out.print(' ');
			}
			else //??????
			{
				for (n = space[i];n < space[i + 1];n++)
				{
					System.out.print(a.charAt(n));
				}
			}
		}
		k = 0;
		for (i = space[j];i < len1;i++) //????
		{
			if (a.charAt(i) == b.charAt(i - space[j]))
			{
				k = k + 1;
			}
		}
			if (k == len2 && len1 - space[j] == len2) //???**
			{
				System.out.print(c);
			}
			else
			{
				for (n = space[j];n < len1;n++)
				{
					System.out.print(a.charAt(n));
				}
			}

		return 0;
	}
}
