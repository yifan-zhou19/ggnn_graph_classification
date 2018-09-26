package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[10000]);
		char[][] sz = new char[300][30];
		str = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		int k = 0;
		int tag;
		int c;
		c = str.length();
		for (i = 0;i <= c;i++)
		{
			if (str.charAt(i) != ' ')
			{
				sz[j][k] = str.charAt(i);
				k++;
				tag = 0;
			}
			else if ((str.charAt(i) == ' ') && (tag == 0))
			{
				sz[j][k] = '\0';
				j++;
				k = 0;
				tag = 1;
			}
		}
		for (i = 0;i < j;i++)
		{
			int a;
			a = String.valueOf(sz[i]).length();
			System.out.printf("%d,",a);
		}
		int b;
		b = String.valueOf(sz[j]).length();
		System.out.printf("%d",b);
		return 0;
	}


}
