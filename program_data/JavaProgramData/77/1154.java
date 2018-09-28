package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] d = new int[100];
		int n;
		char b;
		char c;
		for (int i = 0;i < 100;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
			if (a.charAt(i) == '\n')
			{
			   n = i;
			   break;
			}
			b = a.charAt(0);
			if (a.charAt(i) != b)
			{
			c = a.charAt(i);
			}
		}
		for (int i = 1;i <= n / 2;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (a.charAt(j) == b || d[j] == 1)
				{
				continue;
				}
				for (int k = j;k >= 0;k--)
				{
					if (a.charAt(k) == c || d[k] == 1)
					{
					continue;
					}
					System.out.print(k);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
					d[j] = 1;
					d[k] = 1;
					break;
				}
			}
		}
		return 0;
	}


}

