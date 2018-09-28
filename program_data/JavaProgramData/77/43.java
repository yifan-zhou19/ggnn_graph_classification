package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct kid
	//	{
	//		char c;
	//		int num;
	//	}
	//	kid[100];
		int n;
		n = s.length();
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			kid[i].c = s.charAt(i);
		}
		for (i = 0;i < n;i++)
		{
			kid[i].num = i;
		}

		for (i = 0;i < n - 1;i++)
		{
			if (kid[i].c != kid[i + 1].c)
			{
				System.out.printf("%d %d\n",kid[i].num,kid[i + 1].num);

				for (j = i;j < n - 2;j++)
				{
					kid[j] = kid[j + 2];
				}
				n -= 2;
				i = -1;

			}

		}

	return 0;


	}

}
