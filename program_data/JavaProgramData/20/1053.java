package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[11];
		int i;
		int j;
		int b;
		int c;
		int n;
		int k;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		char max;
		for (i = 0;;i++)
		{
			int d = 0;
			if (scanf("%s%s",str,substr) == EOF)
			{
				break;
			}
			b = str.length();
			c = substr.length();
			max = str.charAt(0);
			for (j = 0;j < b;j++)
			{
				if (str.charAt(j) - max > 0)
				{
					max = str.charAt(j);
				}
			}
			for (j = 0;j < b;j++)
			{
				System.out.printf("%c",str.charAt(j));
				if (str.charAt(j) == max)
				{
					break;
				}
			}
			System.out.printf("%s",substr);
			for (k = j + 1;k < b;k++)
			{
				System.out.printf("%c",str.charAt(k));
			}
			System.out.print("\n");
		}
		return 0;
	}




}
