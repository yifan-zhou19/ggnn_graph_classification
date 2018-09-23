package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int max;
		int i;
		int j;
		int e;
		int k;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		for (;;)
		{
			max = 0;
			if (scanf("%s%s",str,substr) != EOF)
			{
				for (i = 0;str.charAt(i);i++)
				{
					if (str.charAt(i) > max)
					{
						max = str.charAt(i);
						e = i;
					}
				}
				for (j = 0;j < e+1;j++)
				{
					System.out.printf("%c",str.charAt(j));
				}
				System.out.printf("%s",substr);
				for (k = e+1;str.charAt(k);k++)
				{
					System.out.printf("%c",str.charAt(k));
				}
				System.out.print("\n");
			}
			else
			{
				break;
			}
		}
	}
}
