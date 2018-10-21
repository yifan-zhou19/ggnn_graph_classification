package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int end;
		int j;
		int lon;
		int st;
		String a = new String(new char[100000]);
		int[] b = new int[300];
		a = new Scanner(System.in).nextLine();
		lon = a.length();
		end = 0;
		j = 0;
		for (i = 0;i < lon;i++)
		{
			if ((a.charAt(i) == ' ') && (st == 0))
			{
				b[j] = end;
				end = 0;
				j++;
				st = 1;
			}
			else if (a.charAt(i) != ' ')
			{
				end++;
				st = 0;
			}
		}
		b[j] = end;
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[j]);



		return 0;
	}
}
