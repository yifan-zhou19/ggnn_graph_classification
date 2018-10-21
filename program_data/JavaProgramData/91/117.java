package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "\0";
		final String s1 = "\0";
		int i;
		String pa = s;
		String pb = s1;
		pa = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			*(pb.Substring(i)) = *(pa.Substring(i)) + *(pa.Substring(i) + 1);
			if (*(pa.Substring(i) + 2) == '\0')
			{
				break;
			}
		}
		*(pb.Substring(i) + 1) = *(pa.Substring(i) + 1) + pa;
		System.out.printf("%s", s1);
		return 0;
	}
}
