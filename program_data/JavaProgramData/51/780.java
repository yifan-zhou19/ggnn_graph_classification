package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String str = new String(new char[500]);
		final String gram = "";
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		//?????gram
		int i1;
		//?????\0???????????
		for (i1 = 0;str.charAt(i1 + n - 1) != '\0';i1++)
		{
			int i2;
			for (i2 = i1;i2 <= (n - 1 + i1);i2++)
			{
				gram.charAt(i1)[i2 - i1] = str.charAt(i2);
			}
		}
		int gram_len = i1;
		//???gram?????????
		int[] gram_count = new int[500];
		int i2;
		for (i2 = 0;i2 <= gram_len - 1;i2++)
		{
			int i3;
			for (i3 = i2;i3 <= gram_len - 1;i3++)
			{
				if (strcmp(gram.charAt(i2),gram.charAt(i3)) == 0)
				{
					gram_count[i2]++;
				}
			}
		}
		//???gram_count???????
		int max = gram_count[0];
		int i3;
		for (i3 = 0;gram_count[i3] != 0;i3++)
		{
			if (gram_count[i3] > max)
			{
				max = gram_count[i3];
			}
		}
		//??????max????printf
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",max);
		int i4;
		for (i4 = 0;gram_count[i4] != 0;i4++)
		{
			if (gram_count[i4] == max)
			{
				System.out.printf("%s\n",gram.charAt(i4));
			}
		}
		}
		return 0;
	}
}

