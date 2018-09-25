package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		while (true)
		{
			String str1 = new String(new char[100]);
			String str2 = new String(new char[100]);
			str1 = new Scanner(System.in).nextLine();

			if (feof(stdin))
			{
				break;
			}

			System.out.println(str1);

			int k;
			int n = str1.length();
			int[] left = new int[100];
			int[] right = new int[100];
			int l = 0;
			int r = 0;
			for (k = 0;k <= n - 1;k++)
			{
				if (str1.charAt(k) == '(')
				{
					left[l] = k;
					l++;
				}
				else if (str1.charAt(k) == ')')
				{
					right[r] = k;
					r++;
				}
				else
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, k, ' ');
				}
			}
			left[l] = 100;
			right[r] = 100;
			str2 = tangible.StringFunctions.changeCharacter(str2, n, '\0');

			int i;
			int j;
			int x = 1;
			int y = 1;
			for (i = l - 1;i >= 0;i--)
			{
				int p = 0;
				while (right[p] < left[i])
				{
					p++;
				}
				if (x > (r - p))
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, left[i], '$');
				}
				else
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, left[i], ' ');
					x++;
				}
			}
			for (j = 0;j <= r - 1;j++)
			{
				int q = 0;
				while (left[q] < right[j])
				{
					q++;
				}
				if (y > q)
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, right[j], '?');
				}
				else
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, right[j], ' ');
					y++;
				}
			}

			System.out.println(str2);
		}
	}
}

