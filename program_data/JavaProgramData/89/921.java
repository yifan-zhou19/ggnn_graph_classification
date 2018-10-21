package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int counta;
		int countb;
		int[] person1 = new int[50000];
		int[] person2 = new int[50000];
		int flag = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * Person1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * Person2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (Person1 = person1, Person2 = person2; ; Person1++, Person2++)
		{
			*Person1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			*Person2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (*Person1 == 0 && *Person2 == 0)
			{
				break;
			}
		}
		for (i = 0; i < n; i++)
		{
			counta = 0;
			countb = 0;
			for (Person1 = person1, Person2 = person2; ; Person1++, Person2++)
			{
				if (*Person1 == 0 && *Person2 == 0)
				{
					break;
				}
				if (*Person1 == i)
				{
					counta++;
				}
				if (*Person2 == i)
				{
					countb++;
				}
			}
			if (counta == 0 && countb == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}


}

