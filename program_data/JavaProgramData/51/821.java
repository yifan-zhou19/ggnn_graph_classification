package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[MAX]);
		int n;
		int len;
		int i;
		int j = 0;
		int k;
		int flag;
		int max;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct subs
	//	{
	//		char s[5];
	//		int num;
	//	}
	//	sub[MAX];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		str = new Scanner(System.in).nextLine();
		len = str.length();

		for (i = 0;i <= len - n;i++)
		{
			sub[i].num = 0;
			if (i == 0)
			{
				sub[j].s = str.substring(i, i + n);
				sub[j].s[n] = '\0';
				sub[j].num++;
				j++;
			}
			else
			{
				flag = 1;
				for (k = 0;k < j;k++)
				{
					if (strncmp(sub[k].s,str.Substring(i),n) == 0)
					{
						sub[k].num++;
						flag = 0;
						break;
					}
				}

				if (flag != 0)
				{
					sub[j].s = str.substring(i, i + n);
					sub[j].s[n] = '\0';
					sub[j].num++;
					j++;
				}
			}
		}

		for (i = 0;i < j;i++)
		{
			if (i == 0)
			{
				max = sub[i].num;
			}
			else if (sub[i].num > max)
			{
				max = sub[i].num;
			}
		}

		if (max == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < j;i++)
			{
				if (sub[i].num == max)
				{
					System.out.println(sub[i].s);
				}
			}
		}
	}

}

