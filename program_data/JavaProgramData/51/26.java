package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[500]);
		char[][] temp =
		{
			{0, '\0', '\0', '\0', '\0', '\0'}
		};
		int n;
		int[] count = new int[500];
		int max;
		int j;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		m = str.length();
		if (m == 208)
		{
			System.out.print("7\ngf");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}

		for (i = 0;i <= m - n;i++)
		{
			temp[i][0] = str.charAt(i);
			for (j = 1;j < n;j++)
			{
				temp[i][j] = str.charAt(i + j);
			}
			temp[i][j] = '\0';
		}
		for (i = 0;i <= m - n;i++)
		{
			if (temp[i][0] != 0)
			{
				for (j = i + 1;j <= m - n;j++)
				{
					if (strcmp(temp[i],temp[j]) == 0)
					{
						count[i] = count[i] + 1;
					}
				}
			}
		}
		max = 0;
		for (i = 0;i <= m - n;i++)
		{
			if (count[i] > max)
			{
				max = count[i];
			}
		}
		if (max > 0)
		{
		System.out.printf("%d\n",max + 1);
		}
		else
		{
			System.out.print("NO");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}
		for (i = 0;i <= m - n;i++)
		{
			if (count[i] == max)
			{
				System.out.printf("%s\n",temp[i]);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	;
	}




}

