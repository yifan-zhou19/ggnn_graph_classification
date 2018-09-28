package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[101]);
		String p1;
		p1 = String;

		String = new Scanner(System.in).nextLine();

		String mid = new String(new char[101]);
		String p2;
		p2 = mid;
		mid = String;

		int i;
		int time = -1;
		for (i = 0; * (p1.Substring(i)) != '\0';i++)
		{
			*(p1.Substring(i)) = *(p2.Substring(i)) + *(p2.Substring(i) + 1);
			time++;
		}
		*(p1.Substring(time)) = *(p2.Substring(time)) + *(p2.Substring(0));

		System.out.printf("%s\n",p1);

		return 0;
	}
}
