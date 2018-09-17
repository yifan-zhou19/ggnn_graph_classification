package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		int[] b = new int[26];
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 97 && a.charAt(i) <= 122)
			{
				k = a.charAt(i) - 97;
				b[k]++;
			}
		}
		k = 0;
		for (j = 0;j <= 25;j++)
		{
			if (b[j] != 0)
			{
				System.out.printf("%c=%d\n",j + 97,b[j]);
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("No\n");
		}
	}
}

