package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int num;
		int max = 0;
		int len;
		int[] count = new int[1000];
		String s = new String(new char[1000]);
		char[][] zi = new char[500][6];
		String now = new String(new char[6]);
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


		for (i = 0;i < n;i++)
		{
			zi[0][i] = s.charAt(i);
		}
		zi[0][i] = '\0';
		count[0] = 1;

		num = 1;


		for (i = 1;i < len - n + 1;i++)
		{
			for (k = 0;k < n;k++)
			{
				now = tangible.StringFunctions.changeCharacter(now, k, s.charAt(i + k));
			}
			now = tangible.StringFunctions.changeCharacter(now, k, '\0');
			int p = 0;
			while ((p < num) && (strcmp(now,zi[p]) != 0))
			{
			p++;
			}
			if (p < num)
			{
				count[p]++;
			}
			else
			{
				count[num] = 1;
				zi[num] = now;
				num++;
			}
		}
		for (i = 0;i < num;i++)
		{
			if (count[i] > max)
			{
				max = count[i];
			}

		}
		if (max > 1)
		{

		System.out.printf("%d\n",max);

		for (i = 0;i < num;i++)
		{
			if (count[i] == max)
			{
				System.out.println(zi[i]);

			}
		}
		}
		else
		{
			System.out.print("NO");
		}
	}


}

