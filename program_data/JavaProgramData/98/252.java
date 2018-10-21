package <missing>;

public class GlobalMembers
{
	// ????.cpp : Defines the entry point for the console application.
	//




	public static int Main()
	{
		int n;
		int lenth = 0;
		int i;
		int j;
		int flag = 0;
		String a = new String(new char[40]);
		String p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
				a = ConsoleInput.readToWhiteSpace(true).charAt(0);
				lenth += a.length() + 1;
				if ((lenth - 1) <= 80)
				{
					if (flag == 1)
					{
						System.out.print(' ');
					}
					System.out.print(a);
					flag = 1;
				}
				if (lenth - 1 > 80)
				{
					System.out.print("\n");
					lenth = a.length() + 1;
					System.out.print(a);
				}
				for (j = 0; j < 40; j++)
				{
					*(p.Substring(j)) = null; //???????
				}
		}
		return 0;
	}

}

