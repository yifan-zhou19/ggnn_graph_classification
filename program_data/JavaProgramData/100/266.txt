package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[300]);
		int i;
		int n;
		int[] let = new int[130];
		int a;
		int m = 0;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) > 96 && str.charAt(i) < 123)
			{
				a = str.charAt(i);
				let[a]++;
				m++;
			}
		}
			for (i = 97;i < 123;i++)
			{
				if (let[i] > 0)
				{
			System.out.printf("%c=%d\n",i,let[i]);
				}
			}
				if (m == 0)
				{
					System.out.print("No");
				}
	}
}
