package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[10000]);
	public static int[] a = new int[10000];
	public static int[] wlen = new int[301];
	public static int Main()
	{
		int len;
		int i;
		int j;
		int k;
		int sig;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (j = 0,i = 0;i < len;i++)
		{
			if (i == 0)
			{
				if (s.charAt(i) == ' ')
				{
					sig = 0;
				}
				else
				{
					sig = 1;
					a[j++] = i;
				}
			}
			else if (i < len - 1)
			{
				if (sig == 0 && s.charAt(i) != ' ')
				{
					sig = 1;
					a[j++] = i;
				}
				else if (s.charAt(i) == ' ' && sig == 1)
				{
					sig = 0;
					a[j++] = i;
				}
			}
			else
			{
				if (s.charAt(i) == ' ')
				{
					if (sig == 1)
					{
					a[j++] = i;
					}
				}
				else
				{
					if (sig == 0)
					{
						a[j++] = i;
						a[j++] = i + 1;
					}
					else
					{
					a[j++] = i + 1;
					}
				}
			}
		}
		for (k = 0,i = 0;i < j / 2;i++)
		{
			wlen[k++] = a[2 * i + 1] - a[2 * i];
		}
		for (i = 0;i < k;i++)
		{
			if (i == 0)
			{
			System.out.printf("%d",wlen[i]);
			}
			else
			{
			System.out.printf(",%d",wlen[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}
}
