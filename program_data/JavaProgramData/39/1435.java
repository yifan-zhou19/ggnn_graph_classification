package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] b = new int[100];
		int[] c = new int[100];
		int[] f = new int[100];
		int[] s = new int[100];
		int v;
		int k = 0;
		int max = 0;
		final String a = "";
		String d = new String(new char[100]);
		String e = new String(new char[100]);


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
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				e = tangible.StringFunctions.changeCharacter(e, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				f[i] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] > 80 && f[i] > 0)
			{
				s[i] = s[i] + 8000;
			}
			if (b[i] > 85 && c[i] > 80)
			{
				s[i] = s[i] + 4000;
			}
			if (b[i] > 90)
			{
				s[i] = s[i] + 2000;
			}
			if (b[i] > 85 && e.charAt(i) == 'Y')
			{
				s[i] = s[i] + 1000;
			}
			if (c[i] > 80 && d.charAt(i) == 'Y')
			{
				s[i] = s[i] + 850;
			}
			k = k + s[i];
			if (s[i] > max)
			{
				v = i;
			 max = s[i];
			}
		}
		System.out.printf("%s\n",a.charAt(v));
		System.out.printf("%d\n",s[v]);
		System.out.printf("%d\n",k);





	}


}

