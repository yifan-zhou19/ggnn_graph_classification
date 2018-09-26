package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//int num = 0;
		int[] a = new int[500];
		int max = 0;
		String temp = new String(new char[5]);
		int n;
		String str = new String(new char[500]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int m;
		for (int i = 0; i <= str.length() - n; i++)
		{
			for (int k = i; k < i + n; k++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, k - i, str.charAt(k));
			}
			for (int j = i + 1; j <= str.length() - n; j++)
			{
				for (m = 0; m < n ;m++)
				{
					if (temp.charAt(m) != str.charAt(j + m))
					{
						break;
					}
				}
				if (m == n)
				{
					a[j] = -1000;
					a[i]++;
					max = max > a[i] != 0? max:a[i];
				}
			}
		}
		if (max != 0)
		{
			System.out.print(max + 1);
			System.out.print("\n");
			for (int i = 0; i <= str.length() - n; i++)
			{
				if (a[i] == max)
				{
					for (int p = i; p < i + n; p++)
					{
						System.out.print(str.charAt(p));
					}
					System.out.print("\n");
				}
			}
		}
		else
		{
		  System.out.print("NO");
		}
		return 0;
	}

}

