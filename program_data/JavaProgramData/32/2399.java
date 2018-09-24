package <missing>;

public class GlobalMembers
{
	public static String minus(tangible.RefObject<String> a, tangible.RefObject<String> b)
	{
		int i;
		int j;
		for (i = a.argValue.length() - 1,j = b.argValue.length() - 1;j >= 0;i--,j--)
		{
			a.argValue.charAt(i) -= (b.argValue.charAt(j) - '0');
			if (a.argValue.charAt(i) < '0')
			{
				a.argValue.charAt(i) += 10;
				a.argValue.charAt(i - 1)--;
			}
		}
		return a.argValue;
	}
	public static int Main()
	{
		char[][] a = new char[10][100];
		char[][] b = new char[10][100];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead("\n");
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
			System.out.print("\n");

		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%s\n",minus(a[i], b[i]));
		}
		return 0;
	}



}

