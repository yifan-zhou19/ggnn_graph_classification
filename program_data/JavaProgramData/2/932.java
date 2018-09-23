//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
		public String z = new String(new char[30]);
		public int n;
}
//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass2:
public class AnonymousClass2
{
		public int name;
		public int nb;
		public int[] b = new int[1000];
		public int k;
}

package <missing>;

public class GlobalMembers
{
		public static AnonymousClass[] s = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(1000);
		public static AnonymousClass2[] r = tangible.Arrays.initializeWithDefaultAnonymousClass2Instances(93);

	public static int Main()
	{
		int m;
		int i;
		int j;
		int l;
		int q;

		for (i = 65;i <= 90;i++)
		{
			r[i].name = i;
			r[i].k = 1;
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i].z = tempVar3.charAt(0);
			}
			l = String.valueOf(s[i].z).length();
			for (j = 0;j < l;j++)
			{
				q = s[i].z.charAt(j);
				r[q].nb++;
				r[q].b[r[q].k] = s[i].n;
				r[q].k++;
			}
		}

		for (i = 65;i < 90;i++)
		{
			for (j = 90;j > i;j--)
			{
				if (r[j].nb > r[j - 1].nb)
				{
					r[92] = r[j];
					r[j] = r[j - 1];
					r[j - 1] = r[92];
				}
			}
		}
		System.out.printf("%c\n%d\n",r[65].name,r[65].nb);


		for (i = 1;i <= r[65].nb;i++)
		{
			System.out.printf("%d\n",r[65].b[i]);
		}
	}

}

