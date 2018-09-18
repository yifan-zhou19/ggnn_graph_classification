public class book
{
	public int co;
	public String A = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int k;
		int max;
		int[] count = new int[26];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *cc;
		int cc;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		book bk = (book)malloc(sizeof(book) * m); //??????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		book * p = new book();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=bk;
		p.copyFrom(bk);
		for (i = 0;i < m;i++,p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p.co) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.A = tempVar3.charAt(0);
			}
		}
		cc = count; //??
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(count,0,(Integer.SIZE / Byte.SIZE)); //????
		for (i = 0;i < 26;i++,cc++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=bk;
			p.copyFrom(bk);
			for (k = 0;k < m;k++,p++)
			{
				if (tangible.StringFunctions.strChr(p.A,'A' + i))
				{
					cc++;
				}
			} //??
		}
		max = 0;
		for (i = 0;i < 26;i++)
		{
			if (count[i] > count[max])
			{
				max = i;
			}
		}
		System.out.printf("%c\n%d\n",'A' + max,count[max]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=bk;
		p.copyFrom(bk);
		for (i = 0;i < m;i++,p++)
		{
			if (tangible.StringFunctions.strChr(p.A,'A' + max))
			{
				System.out.printf("%d\n",p.co);
			}
		}
		bk = null;
		return 0;
	}
}

