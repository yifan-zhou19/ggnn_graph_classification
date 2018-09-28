package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101]; //a[101]?????????
		int n = 0;
		String s = new String(new char[101]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 0; s.charAt(i); ++i) //??????
		{
			if (s.charAt(i) == s.charAt(0)) //?????????
			{
				a[++n] = i;
			}
			else //?????????????????????????????
			{
				System.out.print(a[n--]);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

