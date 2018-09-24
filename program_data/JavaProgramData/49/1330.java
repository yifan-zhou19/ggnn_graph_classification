package <missing>;

public class GlobalMembers
{
	public static int find(tangible.RefObject<String> a, int n)
	{
		int i;
		int j;
		int t;
		int k;
		for (i = 0;a.argValue.charAt(i) != '\0';i++)
		{
			t = 1;
			if (a.argValue.charAt(i) == a.argValue.charAt(i + n - 1))
			{
				j = i + 1;
				k = i + n - 2;
				do
				{
					if (a.argValue.charAt(j) == a.argValue.charAt(k))
					{
						j++;
						k--;
						t++;
					}
					else
					{
						break;
					}
				} while (k >= j);
				if (t == n / 2 || t == n / 2 + 1)
				{
					for (j = i;j <= i + n - 1;j++)
					{
						System.out.printf("%c",a.argValue.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
	}

	public static int Main()
	{
		String a = new String(new char[501]);
		int l;
		int i;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 2;i <= l;i++)
		{
		tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
			find(tempRef_a, i);
			a = tempRef_a.argValue;
		}
	}
}

