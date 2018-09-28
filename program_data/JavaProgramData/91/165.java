package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String zifu = new String(new char[101]);
		String qinpeng = new String(new char[101]);
		int i;
		int len;
		String p1;
		String p2;
		zifu = new Scanner(System.in).nextLine();
		len = zifu.length();
		p1 = zifu.charAt(0);
		p2 = qinpeng.charAt(0);
		for (i = 0;i < len - 1;i++)
		{
			*(p2.Substring(i)) = *(p1.Substring(i)) + *(p1.Substring(i) + 1);
		}
		*(p2.Substring(len) - 1) = p1 + *(p1.Substring(len) - 1);
		for (i = 0;i < len;i++)
		{
			System.out.printf("%c",*(p2.Substring(i)));
		}
	}


}
