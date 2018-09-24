package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int t = 0;
		int n;
		int[] b = new int[5000];
		int j = 0;
		int k = -1;
		String s = new String(new char[5000]);
		s = new Scanner(System.in).nextLine();
		n = s.length();
		while (i < n)
		{
			if (s.charAt(i) == ' ' || s.charAt(t) == null)
			{
				i = i + 1;
			}
			else
			{
				t = i;
				j = 0;
				while (true)
				{
					if (s.charAt(t) == ' ' || s.charAt(t) == null)
					{
						break;
					}
					else
					{
						j = j + 1;
					}
					t = t + 1;
				}
				k = k + 1;
				b[k] = j;
				i = i + j;
			}
		}
		i = 0;
		while (i < k)
		{
			System.out.printf("%d,",b[i]);
			i = i + 1;
		}
		System.out.printf("%d",b[i]);
		return 0;
	}


}
