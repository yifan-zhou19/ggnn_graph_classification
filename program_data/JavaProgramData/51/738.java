public class d
{
		public String a = new String(new char[5]);
		public int t;
}

package <missing>;

public class GlobalMembers
{
		public static d[] str = tangible.Arrays.initializeWithDefaultdInstances(500);
	public static int compare(d m, d n)
	{
		return n.t - m.t;
	}

	public static int Main()
	{
		int k;
		int i;
		int r = 0;
		int l;
		int j;
		int p;
		int q;
		String s = new String(new char[501]);

		int[] u = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if (u[i] == 0)
			{
				for (j = 0;j < k;j++)
				{
					str[r].a = tangible.StringFunctions.changeCharacter(str[r].a, j, s.charAt(i + j));
				}
				str[r].a = tangible.StringFunctions.changeCharacter(str[r].a, k, '\0');
				str[r].t = 999 - i;
				u[i] = 1;
				j = i + 1;
				while (j < l + 1 - k)
				{
					q = 0;
					for (p = 0;p < k;p++)
					{
						if (s.charAt(j + p) != str[r].a.charAt(p))
						{
							q = 1;
							break;
						}
					}
					if (q == 0)
					{
						u[j] = 1;
						str[r].t = str[r].t + 500;
					}
					j++;
				}
				r++;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(str,r,sizeof(d),compare);
		if ((str[0].t) / 500 == 1)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",(str[0].t) / 500);
		for (i = 0;(str[i].t) / 500 == (str[0].t) / 500;i++)
		{
		System.out.println(str[i].a);
		}
		}
		return 0;
	}
}

