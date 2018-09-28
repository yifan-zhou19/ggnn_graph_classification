package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[105]);
		int[] b = new int[105];
		int i;
		int j = 0;
		int t = 0;
		int k;
		int res;
		int remain;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if ((a.charAt(i + 1)) == '\0')
			{
				t = (t * 10) + a.charAt(i) - '0';
				res = t / 13;
				b[j] = res;
				j++;
				remain = t - res * 13;
				break;
			}
			else
			{
				t = (t * 10) + a.charAt(i) - '0';
				res = t / 13;
				if ((res == 0) && (b[0] == 0))
				{
					continue;
				}
				else
				{
					b[j] = res;
					j++;
				}
				t = t - res * 13;
			}
		}
		for (i = 0; i < j; i++)
		{
			System.out.print(b[i]);
		}
		System.out.print("\n");
		System.out.print(remain);

		return 0;
	}
}

