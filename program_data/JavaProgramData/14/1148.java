public class student //?????
{
	public int NO;
	public int chinese;
	public int math;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100001);
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i].NO = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i].chinese = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i].math = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= 3;i++)
		{
			for (j = n - 1;j >= i;j--)
			{
				if (a[j].chinese + a[j].math < a[j + 1].chinese + a[j + 1].math) //??????????
				{
					a[0] = a[j];
					a[j] = a[j + 1];
					a[j + 1] = a[0];
				}
			}
		}
		for (i = 1;i <= 3;i++)
		{
			System.out.print(a[i].NO);
			System.out.print(' ');
			System.out.print(a[i].chinese + a[i].math);
			System.out.print("\n");
		}
	}

}

