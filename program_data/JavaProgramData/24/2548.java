package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max;
		int min;
		int p;
		int q;
		int[] len = new int[200];
		char[][] word = new char[200][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			len[i] = String.valueOf(word[i]).length();
		}
		max = len[0];
		p = 0;
		min = len[0];
		q = 0;
		for (i = 0;i < n;i++)
		{
			if (len[i] > max)
			{
				max = len[i];
				p = i;
			}
			if (len[i] < min)
			{
				 min = len[i];
				 q = i;
			}
		}
		System.out.printf("%s\n",word[p]);
		System.out.printf("%s\n",word[q]);
		return 0;
	}
}

