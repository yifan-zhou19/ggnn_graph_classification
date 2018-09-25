public class book
{
	public int num;
	public String s = new String(new char[27]);
}

public class author
{
	public int num;
	public int[] bn = new int[1000];
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int l;
		int max = 0;

		char c;

		book[] bk = tangible.Arrays.initializeWithDefaultbookInstances(1000);
		author[] au = tangible.Arrays.initializeWithDefaultauthorInstances('Z' + 1);
		author t = new author();

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
	  for (j = 0;j < 'Z' + 1;j++)
	  {
			au[j].num = 0;
	  }
		for (i = 0;i < m;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bk[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bk[i].s = tempVar3.charAt(0);
			}

			l = String.valueOf(bk[i].s).length();


			for (j = 0;j < l;j++)
			{
			au[bk[i].s.charAt(j)].bn[au[bk[i].s.charAt(j)].num++] = bk[i].num;
			}
		}


		for (j = 0;j < 'Z' + 1;j++)
		{
			if (au[j].num > max)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=au[j];
				t.copyFrom(au[j]);
			c = j;
			max = au[j].num;
			}
		}

		System.out.printf("%c\n",c);
		System.out.printf("%d\n",t.num);

		for (i = 0;i < t.num;i++)
		{
			System.out.printf("%d\n",t.bn[i]);
		}

		return 0;
	}


}

