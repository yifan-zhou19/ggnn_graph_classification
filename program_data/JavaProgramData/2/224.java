package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] at = new int[26];
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct st
	//	{
	//		int id;
	//		char s[27];
	//	}
	//	a[999],*p;
		for (p = a;p < a + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.s = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;;j++)
			{
				c = a[i].s[j];
				if (c != '\0')
				{
					at[c - 65]++;
				}
				else
				{
					break;
				}
			}
		}
		int max = 0;
		for (i = 0;i < 26;i++)
		{
			if (at[i] > max)
			{
				max = at[i];
				j = i;
			}
		}
		char x;
		x = j + 65;
		System.out.printf("%c\n%d\n",x,max);
		for (i = 0;i < n;i++)
		{
			for (j = 0;;j++)
			{
				c = a[i].s[j];
				if (c == x)
				{
					System.out.printf("%d\n",a[i].id);
				}
				if (c == '\0')
				{
					break;
				}
			}
		}
	}
}

