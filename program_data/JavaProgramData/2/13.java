//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public String name = new String(new char[20]);
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] book = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(1000);

	public static int Main()
	{
		int n;
		int i;
		int j;
		int max = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] c = new int[26];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].name = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				tangible.StringFunctions.strChr(book[i].name,'A' + j)?c[j]++:0;
			}
		}
		for (j = 0;j < 26;j++)
		{
			if (c[j] > max)
			{
				max = c[j];
				m = j;
			}
		}
		System.out.printf("%c\n%d\n",'A' + m,c[m]);
		for (i = 0;i < n;i++)
		{
			tangible.StringFunctions.strChr(book[i].name,'A' + m)?System.out.printf("%d\n",book[i].num):0;
		}
		return 0;
	}



}

