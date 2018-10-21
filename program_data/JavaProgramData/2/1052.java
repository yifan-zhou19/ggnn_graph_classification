public class author
{
public int sumbook;
public int[] id = new int[999];
}

package <missing>;

public class GlobalMembers
{
	public static author[] a = tangible.Arrays.initializeWithDefaultauthorInstances(26);

	public static int Main()
	{
		int n;
		int i;
		int j;
		int bookid = 0;
		int pos = 0;
		int maxbook = 0;
		int maxid = 0;
		String booka = new String(new char[26]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;++i)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bookid = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				booka = tempVar3.charAt(0);
			}
			for (j = 0;j < booka.length();++j)
			{
				pos = booka.charAt(j) - 'A';
				a[pos].id[a[pos].sumbook] = bookid;
				a[pos].sumbook++;
				if (maxbook < a[pos].sumbook)
				{
				   maxid = pos;
				   maxbook = a[pos].sumbook;
				}
			}
		}
		System.out.printf("%c\n%d\n",maxid + 'A',maxbook);
		for (i = 0;i < a[maxid].sumbook;i++)
		{
		 System.out.printf("%d\n",a[maxid].id[i]);
		}
	}

}

