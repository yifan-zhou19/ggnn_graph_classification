package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[10]);
	public static int huiwen(int k)
	{
		int i;
		int j;
		int len_a;
		convert(k);

		len_a = a.length();
		for (i = 0,j = len_a - 1;i < j;i++,j--)
		{
			if (a.charAt(i) != a.charAt(j))
			{
				break;
			}
		}
		if (i < j)
		{
			return (0);
		}
		else
		{
			return (1);
		}
	}
	public static int sushu(int k)
	{
		int i;
		for (i = 2;i < k;i++)
		{
			if (k % i == 0)
			{
				break;
			}
		}
		if (i == k)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static char convert(int k)
	{
		int i = 0;
		do
		{
			a = tangible.StringFunctions.changeCharacter(a, i, k % 10 + '0');
			k = k / 10;
			i++;
		}while (k / 10 != 0);
		a = tangible.StringFunctions.changeCharacter(a, i, k + '0');
	}

	public static void Main()
	{

		int m; //mark????m?n????????
		int n;
		int k;
		int mark = 0;
		int mark1;
		int mark2;

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
		for (k = m;k <= n;k++)
		{
			mark1 = huiwen(k);
			mark2 = sushu(k);
			if (mark1 != 0 && mark2 != 0)
			{
				if (mark == 0)
				{
					System.out.printf("%d",k);
					mark = 1;
				}
				else
				{
					System.out.printf(",%d",k);
				}
			}
		}
		if (mark == 0)
		{
			System.out.print("no\n");
		}
	}




}

