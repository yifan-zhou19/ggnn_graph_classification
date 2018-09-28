package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct mingliu
	//	{
	//		int i;
	//		int j;
	//	}
	//	people[10000];
		int n;
		int k;
		int[] a = new int[10000];
		int p = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0 ;;k++)
		{
			people[k].i = ConsoleInput.readToWhiteSpace(true);
			people[k].j = ConsoleInput.readToWhiteSpace(true);
			if (people[k].i == 0 && people[k].j == 0)
			{
				break;
			}
			a[people[k].i]++;
		}
		for (k = 0 ; k < n ; k++)
		{
			if (a[k] == 0)
			{
				System.out.print(k);
				System.out.print("\n");
				p++;
			}
			if (k == n - 1 && p == 0)
			{
				System.out.print("NOT FOUND");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

