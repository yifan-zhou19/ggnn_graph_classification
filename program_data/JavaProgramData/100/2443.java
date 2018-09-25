public class c
{
	public char m;
	public int n;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		c[] fh = tangible.Arrays.initializeWithDefaultcInstances(90);
		c y = new c();
		String a = new String(new char[400]);
		String b = new String(new char[400]);
		char x;
		int i;
		int j = 0;
		int k;
		int l;
		int t = 0;
		int cou;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if ((a.charAt(i) >= 97 && a.charAt(i) <= 122) || (a.charAt(i) >= 65 && a.charAt(i) <= 90))
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
		}
		l = j;
		if (j == 0)
		{
			System.out.print("No");
			return 0;
		}
		else
		{
		for (i = 0;i < j;i++)
		{
			cou = 0;
			for (k = 0;k < i;k++)
			{
				if (b.charAt(i) == b.charAt(k))
				{
					cou++;
				}
			}
			if (cou == 0)
			{
				fh[t].m = b.charAt(i);
				fh[t].n = 0;
				t++;
			}
		}
		for (i = 0;i < t;i++)
		{
			for (j = 0;j < l;j++)
			{
				if (b.charAt(j) == fh[i].m)
				{
					fh[i].n++;
				}
			}
		}
		for (i = t - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (fh[i].m < fh[j].m)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: y=fh[i];
					y.copyFrom(fh[i]);
					fh[i] = fh[j];
					fh[j] = y;
				}
			}
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%c=%d\n",fh[i].m,fh[i].n);
		}
		}
		return 0;
	}
}

