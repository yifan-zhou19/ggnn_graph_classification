package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j;
		int k = 0;
		int[] cnt = new int[500];
		int largest;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q=&cnt[0];
		int q = cnt[0];
		String str = new String(new char[500]);
		char[][] gram = new char[500][5];
		String p = str.charAt(0);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		while (i <= str.length() - n)
		{
			for (j = 0;j < n;j++)
			{
				*(gram[k] + j) = *(p.Substring(i));
				i++;
			}
			i = i - n + 1;
			k++;
		}
		for (i = 0;i < k;i++)
		{
			*(gram[i] + n) = '\0';
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k - i;j++)
			{
				if (strcmp(*(gram + i),*(gram + i + j)) == 0)
				{
					*(q + i) = *(q + i) + 1;
				}
			}
		}
		largest = q;
		for (i = 1;i < k - 1;i++)
		{
			if (*(q + i) > largest)
			{
				largest = (q + i);
			}
		}
		if (largest <= 1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(largest);
			System.out.print("\n");
			for (i = 0;i < k;i++)
			{
				if (*(q + i) == largest)
				{
					System.out.print((gram + i));
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

