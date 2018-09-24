package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[501]);
		int i;
		int j;
		int k;
		int lenth;
		int l;
		int flag;
		l = 2;
		flag = 1;
		str = new Scanner(System.in).nextLine();
		lenth = str.length();
		for (l = 2 ; l <= lenth - 1 ; l++)
		{
			for (i = 0 ; i <= lenth - l ; i++)
			{
				if (str.charAt(i) == str.charAt(i + l - 1))
				{
					for (j = i,k = i + l - 1; j < k ; j++, k--)
					{
						if (str.charAt(j) != str.charAt(k))
						{
							flag = 0;
							break;
						}
					}
					if (flag == 1)
					{
						for (j = i ; j <= i + l - 1; j++)
						{
						System.out.printf("%c",str.charAt(j));
						}
						System.out.print("\n");
					}
					flag = 1;
				}
			}
		}
		return 0;
	}


}
