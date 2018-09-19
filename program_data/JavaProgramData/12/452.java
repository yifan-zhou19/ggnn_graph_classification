package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20]; //a?????? i?????????????  s???????
		int i;
		int j;
		int k;
		int s;
		for ((a[1];a[1] != -1;s = 0,cin = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{ //??????????
			i = 1;
			while (a[i] != 0)
			{
				i++;
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = 1;j < i;j++)
			{
				for (k = 1;k < i;k++)
				{
					if (a[j] == 2 * a[k])
					{
						s++;
					}
				}
			}
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}
}

