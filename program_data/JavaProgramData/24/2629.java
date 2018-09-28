package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String[] s = {""};
		int n;
		int i;
		int[] len = new int[200];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *max;
		int max;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *min;
		int min;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(s[i]).length();
		}
		p = len[0];
		max = len[0];
		min = len[0];
		for (i = 0;i < n;i++)
		{
			if (*(p + i) > max)
			{
				max = p + i;
			}
			else if (*(p + i) < min)
			{
				min = p + i;
			}
		}
			for (i = 0;i < n;i++)
			{
				if (*(p + i) == max)
				{
					System.out.printf("%s\n",s[i]);
					break;
				}
			}

			for (i = 0;i < n;i++)
			{
				if (*(p + i) == min)
				{
					System.out.printf("%s",s[i]);
					break;
				}
			}


		return 0;
	}
}

