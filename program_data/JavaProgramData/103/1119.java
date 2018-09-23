package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;i < 1000;i++)
		{
			if (a.charAt(i) != 0)
			{
				n++;
			}
			else
			{
				break;
			}
		}

		int[] b = new int[1000];
		int j;
		int k = 0;
		int m;
		for (j = 0;j < n;j++) //???j<n?????a[n]?a[n-1]????
		{
			if (a.charAt(j + 1) == a.charAt(j) || a.charAt(j + 1) == a.charAt(j) - 'a'+'A' || a.charAt(j) == a.charAt(j + 1) - 'a'+'A')
			{
				b[k]++;
			}
			else
			{
				b[k] = b[k] + 1;
				if (a.charAt(k) >= 'a' && a.charAt(k) <= 'z')
				{
					m = a.charAt(k) - 'a'+'A';
				}
				else
				{
					m = a.charAt(k);
				}
				System.out.printf("(%c,%d)",m,b[k]);
				k = j + 1;
			}
		}
		return 0;
	}
}

