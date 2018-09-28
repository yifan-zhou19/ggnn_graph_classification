package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int i;
		int i1;
		int n;
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		k = a.length();
		n = b.length();
		for (i = 0;i < n;i++)
		{
			int j = 0;
			int l = 0;
			if (a[j] == b[i])
			{
				i1 = i;

			while (j <= k - 2 && i1 <= n - 2 && a[j] == b[i1] && a[j + 1] == b[i1 + 1])
			{

				l++;
				j++;
				i1++;
			}
			}
			if (l == k - 1)
			{
				System.out.printf("%d",i);
				break;
			}

		}





	}
}

