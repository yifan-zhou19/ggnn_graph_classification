package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[301]);
		char[] a = {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
		int i;
		int[] b = new int[26];
		int num = 0;
		int j;
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				num++;
			}
			for (j = 0;j < 26;j++)
			{
				if (str.charAt(i) == a[j])
				{
					b[j] = b[j] + 1;
				}
			}
		}
		for (j = 0;j < 26;j++)
		{
			if (b[j] != 0)
			{
				System.out.printf("%c=%d\n",a[j],b[j]);
			}
		}
		if (num == 0)
		{
			System.out.print("No\n");
		}
	}

}
