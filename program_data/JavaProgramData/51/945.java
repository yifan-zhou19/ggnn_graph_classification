package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ngram
	//	{
	//		char ngstr[5];
	//		int ifx;
	//	}; //??ngram ngstr?n????  ifx??????????????0?????1?ngram???????????
	//	int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar;
		}
		/*?????*/
		String str = new String(new char[505]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		int i;
		int j;
		ngram[] a = tangible.Arrays.initializeWithDefaultngramInstances(505);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memset(a,0,sizeof(ngram) * 505);
		int len = str.length();
		/*ngram??*/
		for (i = 1;i <= len - n + 1;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i - 1].ngstr[j - 1] = str.charAt(i + j - 2);
			}
			a[i - 1].ifx = 1;
			a[i - 1].ngstr[j] = 0;
		}
		/*ngram??????????????ifx++*/
		for (i = 1;i <= len - n + 1;i++)
		{
			if (a[i - 1].ifx == 0)
			{
				continue;
			}
			else
			{
				for (j = i + 1;j <= len - n + 1;j++)
				{
					if (strcmp(a[i - 1].ngstr,a[j - 1].ngstr) == 0)
					{
						a[i - 1].ifx++;
						a[j - 1].ifx = 0;
					}
					else
					{
					}
				}
			}
		}
		/*To find the Max of "ifx"*/
		int max;
		max = a[0].ifx;
		for (i = 1;i <= len - n + 1;i++)
		{
			if (a[i - 1].ifx == 0)
			{
				continue;
			}
			else
			{
				if (a[i - 1].ifx > max)
				{
					max = a[i - 1].ifx;
				}
				else
				{
				}
			}
		}
		/*print*/
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 1;i <= len - n + 1;i++)
			{
				if (a[i - 1].ifx == max)
				{
					System.out.printf("%s\n",a[i - 1].ngstr);
				}
			}
		}
		return 0;
	}
}

