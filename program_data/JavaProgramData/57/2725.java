package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char s[50],a[50];
	//		int l;
	//	}
	//	w[100];
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
				w[i].s = tempVar2;
			}
			w[i].l = String.valueOf(w[i].s).length();
			if (w[i].s[w[i].l - 1] == 'r' || w[i].s[w[i].l - 1] == 'y')
			{
				w[i].s[w[i].l - 1] = '\0';
				w[i].s[w[i].l - 2] = '\0';
			}
			else if (w[i].s[w[i].l - 1] == 'g')
			{
				w[i].s[w[i].l - 1] = '\0';
				w[i].s[w[i].l - 2] = '\0';
				w[i].s[w[i].l - 3] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n", w[i].s);
		}
	}


}

