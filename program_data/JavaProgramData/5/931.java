package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] s = new int[100];
		int m;
		int l = 0;
		char[][] a = new char[256][256];
		String b = new String(new char[256]);
		double c;
		double d = 0;
		double e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[1] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[0] = tempVar3.charAt(0);
		}
		if (String.valueOf(a[1]).length() == String.valueOf(a[0]).length())
		{
		for (i = 0;a[0][i] != '\0';i++)
		{
			if ((a[0][i] != 'A' && a[0][i] != 'T' && a[0][i] != 'C' && a[0][i] != 'G') || (a[1][i] != 'A' && a[1][i] != 'T' && a[1][i] != 'C' && a[1][i] != 'G'))
			{
				System.out.print("error");
				e = 0;
				break;
			}
			else
			{
			d++;
			if (a[0][i] == a[1][i])
			{
				e++;
			}
			}
		}
		if (d == String.valueOf(a[0]).length())
		{
		if (c < (e / d))
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}

}

