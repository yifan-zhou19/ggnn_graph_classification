package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[LEN]);
		char j;
		int[] count = new int[NUM];
		int i;
		int len;
		int e;
		e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word = tempVar.charAt(0);
		}
		len = word.length();
		for (i = 0;i < len;i++)
		{
			j = word.charAt(i);
				if (j <= 'Z' && j >= 'A')
				{
					count[j - 'A']++;
					e++;
				}
				else if (j <= 'z' && j >= 'a')
				{
					count[j - 'a' + 26]++;
					e++;
				}
		}
		for (j = 'A';j <= 'Z';j++)
		{
			if (count[j - 'A'] > 0)
			{
				System.out.printf("%c=%d\n",j,count[j - 'A']);
			}
		}
		for (j = 'a';j <= 'z';j++)
		{
			if (count[j - 'a' + 26] > 0)
			{
				System.out.printf("%c=%d\n",j,count[j - 'a' + 26]);
			}
		}
		  if (e == 0)
		  {
					System.out.print("No");
		  }
		return 0;
	}
}

