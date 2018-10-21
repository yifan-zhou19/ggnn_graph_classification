package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		int n;
		int[] b = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		int m;
		int q = 0;
		int s = 0;
		int para = 0;
		int word = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.out.print(a);
		para = para + a.length();
		for (i = 1;i < n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			word = a.length();
			para = para + a.length() + 1;
			if (para == a.length() + 1)
			{
				System.out.print(a);
				para = para - 1; //???????
			}
			else
			{
			if (para < 80 && para != a.length() + 1)
			{
				System.out.print(" ");
				for (p = a;p < a + a.length();p++)
				{
					System.out.print(p);
				}
			}
			if (para == 80)
			{
				System.out.print(" ");
				for (p = a;p < a + a.length();p++)
				{
					System.out.print(p);
				}
				System.out.print("\n");
				para = 0;
			}
			if (para > 80)
			{
				para = a.length();
				System.out.print("\n");
				for (p = a;p < a + a.length();p++)
				{
				System.out.print(p);
				}
			}
			}

		}
		return 0;
	}

}

