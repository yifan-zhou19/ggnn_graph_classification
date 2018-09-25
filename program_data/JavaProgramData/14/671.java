public class score
{
	public int id;
	public int chinese;
	public int maths;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		score[] p = tangible.Arrays.initializeWithDefaultscoreInstances(100000);
		score temp;
		score[] stu = tangible.Arrays.initializeWithDefaultscoreInstances(100000);
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{ //????p????stu??
			p[i] = stu[i];
			p[i].id = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p[i].chinese = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p[i].maths = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p[i].sum = p[i].chinese + p[i].maths;
		}
		for (i = 0; i < 3; i++) //???????????
		{
			for (j = n - 1; j > i; j--)
			{
				if (p[j].sum > p[j - 1].sum)
				{ //????????????
					temp = p[j];
					p[j] = p[j - 1];
					p[j - 1] = temp;
				}
			}
		}
		for (i = 0; i < 3; i++) //?????
		{
			System.out.print(p[i].id);
			System.out.print(' ');
			System.out.print(p[i].sum);
			System.out.print("\n");
		}
		return 0;
	}

}

