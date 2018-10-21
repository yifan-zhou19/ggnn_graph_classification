package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String arr = new String(new char[300]);
		int i;
		int flag = 0;
		int[] a = new int[123];
		arr = new Scanner(System.in).nextLine();
		for (i = 0;i < arr.length();i++)
		{
			if ((arr.charAt(i) >= 65 && arr.charAt(i) <= 90) || (arr.charAt(i) >= 97 && arr.charAt(i) <= 122))
			{
				a[((int)arr.charAt(i))]++;
			}
		}
		for (i = 0;i < 123;i++)
		{
			if (a[i] != 0)
			{
				flag++;
				System.out.printf("%c=%d\n",i,a[i]);
			}
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}

		return 0;
	}

}
