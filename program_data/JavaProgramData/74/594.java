package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int l;
		int t = 1;
		int p;
		int[] a = new int[200];
		String s1 = new String(new char[20]);
		String s2 = new String(new char[20]);
		int amount = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (i = m;i <= n;i++)
		{
			t = 1;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					t = 0;
					break;
				}
			}

			int si;
			si = i;

			s1 = String.format("%d", si);
			int len = s1.length();
			for (k = len - 1,l = 0;k >= 0,l < len;k--,l++)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, l, s1.charAt(k));
			}
			s2 = tangible.StringFunctions.changeCharacter(s2, len, '\0');

			if ((t == 1) && (strcmp(s2,s1) == 0))
			{
				amount++;
				a[amount - 1] = i;
			}


		}

		if (amount == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",a[0]);
			for (p = 1;p < amount;p++)
			{
				System.out.printf(",%d",a[p]);
			}
		}

		System.out.print("\n");

	}


}

