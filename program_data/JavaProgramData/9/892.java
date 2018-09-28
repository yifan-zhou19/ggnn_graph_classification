package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct data
	//	{
	//		int age;
	//		char id[10];
	//	}
	//	o[101],y[101],tmp;
		int no = 0;
		int ny = 0;
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			tmp.id = ConsoleInput.readToWhiteSpace(true);
			tmp.age = ConsoleInput.readToWhiteSpace(true);
			if (tmp.age >= 60)
			{
				o[no] = tmp;
				no++;
			}
			else
			{
				y[ny] = tmp;
				ny++;
			}
		}
		for (i = no - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (o[j].age < o[j + 1].age)
				{
					o[100] = o[j];
					o[j] = o[j + 1];
					o[j + 1] = o[100];
				}
			}
		}
		for (i = 0;i < no;i++)
		{
			System.out.print(o[i].id);
			System.out.print("\n");
		}
		for (i = 0;i < ny;i++)
		{
			System.out.print(y[i].id);
			System.out.print("\n");
		}
		return 0;
	}
}

