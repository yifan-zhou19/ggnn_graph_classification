public class student
{
	public String name = new String(new char[20]);
	public int smark;
	public int cmark;
	public char lead;
	public char west;
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(200);
	public static int[] s = new int[100];
	public static int n;

	public static int js(int x)
	{
		int reval = 0;
		if (stu[x].smark > 80 && stu[x].num >= 1)
		{
			reval += 8000;
		}
		if (stu[x].smark > 85 && stu[x].cmark > 80)
		{
			reval += 4000;
		}
		if (stu[x].smark > 90)
		{
			reval += 2000;
		}
		if (stu[x].smark > 85 && stu[x].west == 'Y')
		{
			reval += 1000;
		}
		if (stu[x].cmark > 80 && stu[x].lead == 'Y')
		{
			reval += 850;
		}
	return reval;
	}

	public static int Main()
	{
		int maxnum = 0;
		int max = 0;
		int sum = 0;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			stu[i].name = ConsoleInput.readToWhiteSpace(true).charAt(0);
			stu[i].smark = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].cmark = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].lead = ConsoleInput.readToWhiteSpace(true).charAt(0);
			stu[i].west = ConsoleInput.readToWhiteSpace(true).charAt(0);
			stu[i].num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
	//		cout<<js(i)<<endl;
			sum += js(i);
			if (js(i) > max)
			{
				maxnum = i;
				max = js(i);
			}
		}
		System.out.print(stu[maxnum].name);
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

