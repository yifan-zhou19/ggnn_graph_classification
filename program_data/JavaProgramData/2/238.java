//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public int no;
	public String wr = new String(new char[26]);
}
//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass2:
public class AnonymousClass2
{
	public char name;
	public int num;
	public int[] book = new int[999];
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] book = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(999);
	public static AnonymousClass2[] a = tangible.Arrays.initializeWithDefaultAnonymousClass2Instances(26);



	public static int Main()
	{
		int n;
		int m;
		int t;
		int k;
		int d;
		int all = 0;
		for (t = 0;t < 26;t++)
		{
			a[t].name = 'A' + t;
			a[t].num = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (t = 0;t < m;t++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[t].no = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[t].wr = tempVar3.charAt(0);
			}
		}

		for (t = 0;t < m;t++)
		{
			k = String.valueOf(book[t].wr).length();
			for (n = 0;n < k;n++)
			{
				for (d = 0;d < 26;d++)
				{
					if (a[d].name == book[t].wr.charAt(n))
					{
						a[d].book[a[d].num] = book[t].no;
						a[d].num++;
						break;
					}
				}
			}
		}
		k = 0;


		for (t = 0;t < 26;t++)
		{
			if (k < a[t].num)
			{
				k = a[t].num;
			}
		}


		for (t = 0;;t++)
		{
			if (k == a[t].num)
			{
				System.out.printf("%c",a[t].name);
				System.out.printf("\n%d",a[t].num);
				for (d = 0;d < a[t].num;d++)
				{
				System.out.printf("\n%d",a[t].book[d]);
				}
				break;
			}
		}
	}
}

