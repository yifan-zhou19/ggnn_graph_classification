package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

		String a = new String(new char[301]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;

		a = new Scanner(System.in).nextLine();

		int i;
		int j;
		int flag = 0;

		for (i = 65,j = 0;i < 91;i++)

		{

			for (ps = a; * ps != '\0';ps++)

			{

				if (*ps == i)

				{

					j++;

				}

			}

			if (j != 0)

			{

			   System.out.printf("%c=",i);

			   System.out.printf("%d\n",j);

			   j = 0;

			   flag = 1;

			}

		}

		for (i = 97,j = 0;i < 123;i++)

		{

			for (ps = a; * ps != '\0';ps++)

			{

				if (*ps == i)

				{

					j++;

				}

			}

			if (j != 0)

			{

				System.out.printf("%c=",i);

				System.out.printf("%d\n",j);

				j = 0;

				flag = 1;

			}

		}

		if (flag == 0)
		{

			System.out.print("No\n");
		}



		return 0;

	}


}
