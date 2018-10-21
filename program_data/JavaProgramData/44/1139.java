package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void p(int m);
		int i;
		int[] a = new int[100];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[i] == 0)
			{
				System.out.print("0\n");
			}
			else if (a[i] > 0)
			{
				p(a[i]);
			}
			else
			{
				System.out.print("-");
				a[i] = (-a[i]);
				p(a[i]);
			}
		}
	}
	public static void p(int m)
	{
		int i;
		int j;
		int k;
		final String a = "";
		for (i = 0,k = m,j = 1;;i++,j++)
		{
			if (k < 10)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, k);
				break;
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, i, k - k / 10 * 10);
				k = k / 10;
			}
		}
		for (i = 0,k = 0;;i++)
		{
			if (a.charAt(i) == 0)
			{
				k++;
				continue;
			}
			else
			{
			break;
			}
		}
		for (i = k;i < j;i++)
		{
			System.out.printf("%d",a.charAt(i));
		}
		System.out.print("\n");
	}



}

