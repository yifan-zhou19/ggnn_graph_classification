package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String b = new String(new char[20000]);
		char[][] a = new char[200][100];
		int i;
		int n;
		int x = 0;
		int k = 0;
		int[] len = new int[200];
		int max;
		int min;
		b = new Scanner(System.in).nextLine();
		n = b.length();
		for (i = 0;i < n;i++)
		{
			if (b.charAt(i) != ' ' && b.charAt(i) != ',')
			{
				a[x][k] = b.charAt(i);
				k++;
			}
			else
			{
				if (k == 0)
				{
					continue;
				}
				a[x][k + 1] = '\0';
				len[x] = k;
				k = 0;
				x++;
			}
		}
		len[x] = k;
		a[x][k + 1] = '\0';
		max = 0;
		min = 0;
		for (i = 0;i <= x;i++)
		{
			if (len[i] > len[max])
			{
				max = i;
			}
			if (len[i] < len[min])
			{
				min = i;
			}
		}
		System.out.printf("%s\n%s",a[max],a[min]);
		return 0;
	}
}
