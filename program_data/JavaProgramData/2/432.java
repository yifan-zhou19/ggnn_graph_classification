public class book
{
	public int H;
	public String writer = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] b = tangible.Arrays.initializeWithDefaultbookInstances(max);
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int[] sum = new int[26];
		int t;
		int Max;
		int g;
		char y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i].H = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i].writer = tempVar3.charAt(0);
			}
			t = String.valueOf(b[i].writer).length();
			for (j = 0;j < t;j++)
			{
				k = b[i].writer.charAt(j) - 65;
				sum[k]++;
			}
		}
		Max = sum[0];
		for (i = 0;i < 26;i++)
		{
			if (sum[i] > Max)
			{
				Max = sum[i];
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (sum[i] == Max)
			{
				y = i + 65;
				System.out.printf("%c\n%d\n",y,Max);
			}
		}
		for (i = 0;i < m;i++)
		{
			g = 0;
			t = String.valueOf(b[i].writer).length();
			for (j = 0;j < t;j++)
			{
			if (b[i].writer.charAt(j) == y)
			{
				g++;
				break;
			}
			}
			if (g != 0)
			{
				System.out.printf("%d\n",b[i].H);
			}
		}
		return 0;
	}


}

