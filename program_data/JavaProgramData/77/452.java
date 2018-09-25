public class stu
{
	public char c;
	public int x;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] stu1 = tangible.Arrays.initializeWithDefaultstuInstances(1000);
	public static stu p;

	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		n = s.length();
		p = stu1;
		for (i = 0;i < n;i++)
		{
			(p + i).c = s.charAt(i);
			(p + i).x = i;

		}

		for (i = 0;i < n;i++)
		{
			if ((p + i).c != s.charAt(0))
			{
				System.out.printf("%d %d\n",(p + i - 1).x,(p + i).x);
				n = n - 2;
				for (j = i - 1;j < n;j++)
				{
					(p + j).c = (p + j + 2).c;
					(p + j).x = (p + j + 2).x;
				}
				i = 0;
			}
		}
	}

}

