package <missing>;

public class GlobalMembers
{
	//*********************************************
	//*?????????                        **
	//*?????? 1100012914                   **
	//*???2011.12.9                           **
	//*********************************************


	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int[] fam1 = new int[100000];
		int[] fam2 = new int[100000];
		int flag = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (!(a == 0 && b == 0))
		{
			fam1[a] = 1;
			fam2[b]++;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p1 = fam1;
		p2 = fam2;
		for (i = 0; i < n; i++)
		{
			if (*(p1 + i) == 0 && *(p2 + i) == n - 1)
			{
				flag++;
				System.out.print(i);
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
		}
			return 0;
	}
}

