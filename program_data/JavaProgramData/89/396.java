package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] people = new int[10000];
		int i;
		int n;
		int a;
		int b;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0 && b == 0)
			{
			   break;
			}
			people[a] = -1;
			people[b]++;
		}
		for (i = 0; i < n; i++)
		{
			if (people[i] == (n - 1))
			{
			   System.out.print(i);
			   System.out.print("\n");
			   flag = 1;
			}
		}
		if (flag == 0)
		{
		   System.out.print("NOT FOUND");
		   System.out.print("\n");
		}
		return 0;
	}
}

