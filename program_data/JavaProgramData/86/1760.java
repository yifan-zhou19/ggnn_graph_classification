package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int l;
		int s;
		int[] a = new int[70];
		while (n-- != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			a[0] = 100;
			m = 0;
			s = 0;
			j = 0;
			l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < l;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			while (m < 60)
			{
				if (s == a[j])
				{
					m = m + 3;
					j = j + 1;
				}
				else
				{
					s = s + 1;
					m = m + 1;
				}
			}
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}


}

