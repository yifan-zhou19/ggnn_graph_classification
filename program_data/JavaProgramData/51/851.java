package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int len;
		int max = 1;
		int mark = 0;
		String s = new String(new char[505]);
		String temp = new String(new char[5]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct example
	//	{
	//		int word;
	//		int num;
	//	}
	//	a[505];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		len = s.length();
		for (i = 0;i < len - n + 1;i++)
		{
			a[i].word = 0;
			a[i].num = 1;
			for (j = 0;j < n;j++)
			{
				a[i].word = a[i].word * 100 + s.charAt(i + j) - 32;
			}
		}
		i = 0;
		for (i = 0;i < len - n + 1;i++)
		{
			for (j = i + 1;j < len - n + 1;j++)
			{
				if (a[i].word != 0 && a[i].word == a[j].word)
				{
					a[i].num++;
					a[j].word = 0;
				}
			}

		}
		for (i = 0;i < len - n + 1;i++)
		{
			if (a[i].num > max)
			{
				max = a[i].num;
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);

		for (i = 0;i < len - n + 1;i++)
		{
			if (a[i].num == max)
			{
				for (j = 0;j < n;j++)
				{
					System.out.printf("%c",s.charAt(i + j));
				}
				System.out.print("\n");
			}
		}
		}

		return 0;
	}
}

