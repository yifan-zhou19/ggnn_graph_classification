//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public int no;
 public String wri = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] book = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(1000);

	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[] a = new int[26];
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
				book[i].no = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].wri = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;book[i].wri.charAt(j) != '\0';j++)
			{
				a[book[i].wri.charAt(j) - 'A']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] > a[0])
			{
			a[0] = a[i];
			k = i;
			}
		}
		System.out.printf("%c\n%d\n",'A' + k,a[0]);
		for (i = 0;i < n;i++)
		{
			for (j = 0;book[i].wri.charAt(j) != '\0';j++)
			{
				if (book[i].wri.charAt(j) == 'A' + k)
				{
				System.out.printf("%d\n",book[i].no);
				break;
				}
			}
		}
	}
}

