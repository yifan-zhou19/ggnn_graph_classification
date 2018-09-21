package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		int len;
		int t;
		int i;
		int[] start = new int[1000];
		int[] endd = new int[1000];
		int max;
		int min;

		s = new Scanner(System.in).nextLine();
		len = s.length();
		t = 1;
		start[1] = 0;
		for (i = 1;i < len;i++)
		{
			if (s.charAt(i) == ' ')
			{
				endd[t] = i - 1;
				if (s.charAt(endd[t]) == ',')
				{
					endd[t]--;
				}
				t++;
				start[t] = i + 1;
			}
		}
		endd[t] = len - 1;
		max = 1;
		min = 1;
		for (i = 2;i <= t;i++)
		{
			if (endd[i] - start[i] > endd[max] - start[max])
			{
				max = i;
			}
			if (endd[i] - start[i] < endd[min] - start[min])
			{
				min = i;
			}
		}
		for (i = start[max];i <= endd[max];i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
		for (i = start[min];i <= endd[min];i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");

		return 0;
	}
}
