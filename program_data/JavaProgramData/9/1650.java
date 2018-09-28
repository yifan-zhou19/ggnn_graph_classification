package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] l = new int[100];
		int[] b = new int[100];
		int i = 0;
		int j;
		int k;
		int p = 0;
		int q = 0;
		int t = 0;
		char[][] s = new char[100][12];
		final String lao = "";
		final String bu = "";
		final String w = "";
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		if (a[i] >= 60)
		{
			l[p] = a[i],strcpy(lao.charAt(p),s[i]),p++;
		}
		else
		{
			b[q] = a[i],strcpy(bu.charAt(q),s[i]),q++;
		}
		}

		for (i = 0;i < p;i++)
		{
			for (j = 0;j < p - 1;j++)
			{
				if (l[j] < l[j + 1])
				{
					t = l[j],l[j] = l[j + 1],l[j + 1] = t,strcpy(w,lao.charAt(j)),strcpy(lao.charAt(j),lao.charAt(j + 1)),strcpy(lao.charAt(j + 1),w);
				}
			}
		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("%s\n",lao.charAt(i));
		}
		for (i = 0;i < q;i++)
		{
			System.out.printf("%s\n",bu.charAt(i));
		}
	}
}

