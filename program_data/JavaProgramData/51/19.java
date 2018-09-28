package <missing>;

public class GlobalMembers
{
	public static int record(String[] str, String curstr, int[] count, int num)
	{
		int k = 0;
		while ((k < num) && (strcmp(str[k],curstr) != 0))
		{
			++k;
		}
		if (k < num)
		{
			count[k]++;
			return num;
		}
		else
		{
			str[num] = curstr;
			count[num] = 1;
			return num + 1;
		}
	}
	public static int sub_count(String s, String[] str, int[] count, int n)
	{
		int m;
		int k;
		int len = s.length();
		int num = 0;
		String curstr = new String(new char[6]);
		for (m = 0;m <= len - n;m++)
		{
			for (k = 0;k < n;k++)
			{
				curstr = tangible.StringFunctions.changeCharacter(curstr, k, s[m + k]);
			}
			curstr = tangible.StringFunctions.changeCharacter(curstr, k, '\0');
			num = record(str, curstr, count, num);
		}
		return num;
	}
	public static void Main()
	{
		String s = new String(new char[1000]);
		char[][] str = new char[1000][6];
		int[] count = new int[1000];
		int num;
		int n;
		int i;
		int max;
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
		num = sub_count(s, str, count, n);
		max = count[0];
		for (i = 0;i < num - 1;i++)
		{
			if (max < count[i + 1])
			{
				max = count[i + 1];
			}
		}
		if (max <= 1)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",max);
		for (i = 0;i < num;i++)
		{
			if (count[i] == max)
			{
				System.out.printf("%s\n",str[i]);
			}
		}
		}
	}
}

