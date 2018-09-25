package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String pa;
		String pb;
		a = new Scanner(System.in).nextLine();
		pa = a;
		pb = b;
		for (i = 0;i < a.length() - 1;i++)
		{
			*(pb.Substring(i)) = *(pa.Substring(i)) + *(pa.Substring(i) + 1);
		}
		*(pb + a.length() - 1) = *(pa + a.length() - 1) + pa;
		for (i = 0;i < a.length();i++)
		{
			System.out.printf("%c",*(pb.Substring(i)));
		}
	}
}
