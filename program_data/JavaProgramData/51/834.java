public class zifu
{
	public int tou;
	public int num;
	public String e = new String(new char[5]);
}
public class chuan
{
	public int num;
	public String e = new String(new char[5]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		int i;
		int j;
		int k = 0;
		int t = 0;
		int q = 0;
		int w = 0;
		int m = 0;
		int d;
		int s = 0;
		int max;
		String a = new String(new char[500]);
		zifu[] zi = tangible.Arrays.initializeWithDefaultzifuInstances(1000);
		zifu temp = new zifu();
		chuan[] b = tangible.Arrays.initializeWithDefaultchuanInstances(1000);
		chuan p = new chuan();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		scanf("\n");
		for (i = 0;i < 500;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar2);
			}
			if (a.charAt(i) == '\n')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '\0');
				break;
			}
		}
		c = a.length();
		for (i = 0;i < 1000;i++)
		{
			zi[i].num = 0;
			zi[i].tou = 0;
		}
		temp.num = 0;
		for (i = 0;i <= c - n;i++)
		{
			k = 0;
			for (j = i;j < i + n;j++)
			{
				b[i].e = tangible.StringFunctions.changeCharacter(b[i].e, k, a.charAt(j));
				k++;
			}
			b[i].num = i;
			b[i].e = tangible.StringFunctions.changeCharacter(b[i].e, k, '\0');
		}
		for (j = 1;j <= c - n;j++)
		{
			for (i = 0;i <= c - n - 1;i++)
			{
				if (strcmp(b[i].e,b[i + 1].e) > 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=b[i];
						p.copyFrom(b[i]);
					b[i] = b[i + 1];
					b[i + 1] = p;
				}
			}
		}
		for (i = 0;i <= c - n - 1;i++)
		{
			m = 0;

			for (d = 0;d < n;d++)
			{
				if (b[i + 1].e.charAt(d) == b[i].e.charAt(d))
				{
					m++;
				}
			}
				if (m == n)
				{
				for (j = 0;j < n;j++)
				{
				zi[t].e = tangible.StringFunctions.changeCharacter(zi[t].e, j, b[i].e.charAt(j));
				}
				if (s == 0)
				{
					zi[t].tou = b[i].num;
					s++;
				}
				zi[t].num++;
				w++;
				}
			else
			{
				t++;
			s = 0;
			}
		}
		if (w == 0)
		{
			System.out.print("NO");
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=zi[0];
		temp.copyFrom(zi[0]);
		for (i = 0;i <= t - 1;i++)
		{
			if (zi[i].num > temp.num)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=zi[i];
				temp.copyFrom(zi[i]);
				q = i;
			}
		}
		max = temp.num + 1;

		System.out.printf("%d\n",max);
		for (j = 1;j <= t;j++)
		{
			for (i = 0;i <= t - 1;i++)
			{
				if (zi[i].tou > zi[i + 1].tou)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=zi[i];
						temp.copyFrom(zi[i]);
					zi[i] = zi[i + 1];
					zi[i + 1] = temp;
				}
			}
		}
		for (i = 0;i <= t;i++)
		{
			if (zi[i].num == max - 1)
			{
				for (j = 0;j < n;j++)
				{
					System.out.printf("%c",zi[i].e.charAt(j));
				}
				System.out.print("\n");
			}
		}
		}
		return 0;
	}
}

