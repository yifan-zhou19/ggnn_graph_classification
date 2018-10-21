//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public int a;
	public String b = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] shu = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(1000);

	public static int Main()
	{
		int[] s = new int[27];
		int n;
		int i;
		int j;
		int o;
		int max;
		int t = 1;
		int x;
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
				shu[i].a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				shu[i].b = tempVar3.charAt(0);
			}
		}

		for (i = 1;i <= 26;i++)
		{
			s[i] = 0;
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(shu[i].b).length();j++)
			{
				o = shu[i].b.charAt(j) - 64;
				s[o]++;
			}
		}


		max = 0;
		for (i = 1;i <= 26;i++)
		{
			if (max < s[i])
			{
			max = s[i];
			t = i;
			}
		}
		System.out.printf("%c\n",t + 64);
		System.out.printf("%d\n",max);

		for (i = 0;i < n;i++)
		{
			x = String.valueOf(shu[i].b).length();
			for (j = 0;j < x;j++)
			{
				if (shu[i].b.charAt(j) == t + 64)
				{
					System.out.printf("%d\n",shu[i].a);
				}
			}
		}
		return 0;



	}
}

