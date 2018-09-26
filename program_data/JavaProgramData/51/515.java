package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		int l;
		int count = 0;
		char[][] record = new char[500][6];
		String a = new String(new char[500]);
		String temp = new String(new char[6]);
		int[] num = new int[500];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		l = a.length();
		for (i = 0;i <= l - n;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j, a.charAt(i + j));
			}
			temp = tangible.StringFunctions.changeCharacter(temp, j, '\0');
			int found = 0;
			for (p = 0;p < count;p++)
			{
				if (strcmp(record[p],temp) == 0)
				{
					found = 1;
					num[p]++;
					break;
				}

			}

			if (found == 0)
			{

				for (j = 0;j <= n;j++)
				{
					record[count][j] = temp.charAt(j);
					num[count] = 1;
				}

				count++;
			}
		}

		int max = 0;
		for (i = 0;i <= count;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}

		System.out.printf("%d\n",max);

		for (i = 0;i <= count;i++)
		{
			if (num[i] == max)
			{

				System.out.printf("%s\n",record[i]);

			}

		}

	}

}

