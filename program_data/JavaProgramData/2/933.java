//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public int[] location = new int[1001];
	public int num;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] ans = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(27);
	public static int Main()
	{
		int n;
		int value = -1;
		int order;
		int m;
		String s = new String(new char[28]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= 26;i++)
		{
			ans[i].num = ans[i].sum = 0;
		}
		for (int i = 1;i <= n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (int j = 0;j < s.length();j++)
			{
				ans[s.charAt(j) - 'A' + 1].num++;
				ans[s.charAt(j) - 'A' + 1].sum++;
				ans[s.charAt(j) - 'A' + 1].location[ans[s.charAt(j) - 'A' + 1].num] = m;
			}
		}
		for (int i = 1;i <= 26;i++)
		{
		if (ans[i].sum > value)
		{
			value = ans[i].sum;
			order = i;
		}
		}
		System.out.print((char)(order + 'A' - 1));
		System.out.print("\n");
		System.out.print(ans[order].num);
		System.out.print("\n");
		for (int i = 1;i <= ans[order].num;i++)
		{
			System.out.print(ans[order].location[i]);
			System.out.print("\n");
		}
			return 0;
	}

}

