package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len;
		int sum;
		String S = new String(new char[100]);
		S = new Scanner(System.in).nextLine();
		len = S.length();
		for (i = 0;i < len - 1;i++)
		{
			sum = (S.charAt(i) - 48) + (S.charAt(i + 1) - 48);
			System.out.printf("%c",sum + 'a' - 1);
		}
			sum = (S.charAt(0) - 48) + (S.charAt(len - 1) - 48);
			System.out.printf("%c\n",sum + 'a' - 1);

	//	printf("%d\n",'1');
		return 0;
	}
}
