package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		str = new Scanner(System.in).nextLine();
		int tag = 0;
		int[] sz = new int[126];
		int i;
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) || ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z')))
			{
				sz[str.charAt(i)]++;
				tag = 1;
			}
		}
		for (i = 'A';i <= 'Z';i++)
		{
			if (sz[i] != 0)
			{
				System.out.printf("%c=%d\n",i,sz[i]);
			}
		}
		for (i = 'a';i <= 'z';i++)
		{
			if (sz[i] != 0)
			{
				System.out.printf("%c=%d\n",i,sz[i]);
			}
		}
		if (tag == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}
