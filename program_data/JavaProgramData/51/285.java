public class string
{
	public String a = new String(new char[6]);
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static string[] sub = new string[1000];
	public static void Main()
	{
		String str1 = new String(new char[10]);
		String str = new String(new char[1000]);
		int n;
		int i;
		int j;
		int k;
		int l;
		int jishu;
		int zonshu1 = 0;
		int zonshu2 = 0;
		int max;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str1 = new Scanner(System.in).nextLine();
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			sub[999].a = tangible.StringFunctions.changeCharacter(sub[999].a, i, '0');
		}
		len = str.length();
		for (i = 0;i <= len - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				sub[i].a [j] = str.charAt(i + j);
				sub[i].num = 0;
			}
			for (k = 0;k <= len - n;k++)
			{
				jishu = 0;
				for (l = 0;l < n;l++)
				{
					if (str.charAt(k + l) == sub[i].a.charAt(l))
					{
						jishu++;
					}
				}
				if (jishu == n)
				{
					sub[i].num++;
				}
			}
		}
		max = sub[0].num;
		for (i = 0;i <= len - n;i++)
		{
			max = (max > sub[i].num)?max:sub[i].num;
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
		for (i = 0;i <= len - n;i++)
		{
			if (sub[i].num == max)
			{
				zonshu1++;
			}
		}
		for (i = 0;i <= len - n;i++)
		{
			if (strcmp(sub[i].a,sub[999].a) != 0 && sub[i].num == max)
			{
				for (j = i + 1;j <= len - n;j++)
				{
					if (strcmp(sub[j].a,sub[i].a) == 0 && sub[j].num == max)
					{
					 sub[j].a = sub[999].a;
					}
				}
			}
		}
		for (i = 0;i <= len - n;i++)
		{
			if (strcmp(sub[i].a,sub[999].a) != 0 && sub[i].num == max)
			{
				zonshu2++;
			}
		}
		System.out.printf("%d\n",zonshu1 / zonshu2);
		for (i = 0;i <= len - n;i++)
		{
			if (strcmp(sub[i].a,sub[999].a) != 0 && sub[i].num == max)
			{
				System.out.printf("%s\n",sub[i].a);
			}
		}
		}
	}

}

