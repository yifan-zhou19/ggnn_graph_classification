package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p_a = null;
		a = new Scanner(System.in).nextLine();
		p_a = a;


		int flag = 1;

		while (p_a < (a + a.length()))
		{
			if (flag == 1)
			{
					System.out.print(p_a);
					if (*p_a == ' ')
					{
						flag = 0;
					}
					*p_a++;
					continue;
			}
			else
			{
				if (*p_a != ' ')
				{
					flag = 1;
					System.out.print(p_a);
				}
					*p_a++;
					continue;

			}
		}
		System.out.print("\n");

		return 0;
	}

}
