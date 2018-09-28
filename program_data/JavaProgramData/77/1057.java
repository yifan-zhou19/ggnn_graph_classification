package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		char c;
		int l;
		int sp = 0;
		int i;
		int j = 1;
		int[] b = new int[100];
		a = new Scanner(System.in).nextLine();
		l = a.length();
		c = a.charAt(0);
		b[0] = 0;
		for (i = 1;i < l - 1;i++)
		{
			if (a.charAt(i) == c)
			{
				b[j++] = i;
			}
			else
			{
				System.out.printf("%d %d\n",b[--j],i);
			}
		}
		System.out.printf("0 %d",l - 1);

		return 0;
	}


}
