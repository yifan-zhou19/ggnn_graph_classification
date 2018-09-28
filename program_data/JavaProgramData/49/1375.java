package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[501]);
		int l;
		int length;
		int i;
		int j;
		int k;
		int p;
		int start;
		int end;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		length = str.length();
		for (i = 0;i + 1 < length;i++)
		{
			if (str.charAt(i) == str.charAt(i + 1))
			{
				System.out.printf("%c%c\n",str.charAt(i),str.charAt(i + 1)); //??????2?????
			}
		}
		for (l = 3;l <= length;l++) //l??????????
		{
			for (i = 0;i + l - 1 < length;i++) //i????????????
			{
				start = i;
				end = i + l - 1; //????????
				j = i + l - 1;
				k = i;
				while (k <= j)
				{
					if (str.charAt(k) == str.charAt(j))
					{
						k++;
						j--;
					}
					else
					{
						break; //????????????????
					}
				}
				if (((l % 2 == 0) && (k - 1 == j)) || ((l % 2 == 1) && (k - 1 == j + 1))) //??k?j??
				{
					for (p = start;p <= end;p++)
					{
						System.out.printf("%c",str.charAt(p));
					}
				}
					System.out.print("\n");
			}
		}
		return 0;
	}

}

