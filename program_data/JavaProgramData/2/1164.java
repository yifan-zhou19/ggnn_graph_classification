//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

///#define NULL 0
public class stu
{
	public int num;
	public String c = new String(new char[26]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu create(int m)
	{
		stu p1;
		stu p2;
		stu xhead;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (stu)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.c = tempVar2.charAt(0);
		}
		p2 = p1;
		xhead = p1;

		while (m - 1 != 0)
		{
			m--;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(LEN);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.c = tempVar4.charAt(0);
			}
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		return xhead;
	}

	public static int stas(int[] b)
	{
			int j;
			int max = 0;
			int indexx = 0;
			for (j = 0;j < 26;j++)
			{
			if (b[j] > max)
			{
				max = b[j];
				indexx = j;
			}
			}
		System.out.printf("%c\n%d\n",indexx + 65,max);
		//for(j=0;j<26;j++)
			//printf("%d ",b[j]);
		return indexx;
	}

	public static stu search(stu yhead, int y)
	{
		stu q;
		int sum = 0;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * i;
		String s = new String(new char[20]);
		final String s0 = "";
		q = yhead;
		while (q != null)
		{
			s = q.c;
			k = s.length();
			for (i = s;i < i + k;i++)
			{
				if (*i == y + 65)
				{
					sum++;
				}
			}
			s = s0;
			q = q.next;
		}
		System.out.printf("%d\n",sum);
		return 0;
	}

	public static stu print(stu zhead, int z)
	{
		stu q;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * i;
		String s = new String(new char[20]);
		final String s0 = "";
		q = zhead;
		while (q != null)
		{
			s = q.c;
			k = s.length();
			for (i = s;i < s.Substring(k);i++)
			{
				if (*i == z + 65)
				{
					System.out.printf("%d\n",q.num);
					break;
				}
			}
			s = s0;
			q = q.next;
		}
		return 0;
	}

	public static int Main()
	{
		int n;
		int index;
		int[] a = new int[26];
		int k;
		int t;
		int i;
		String s = new String(new char[20]);
		final String s0 = "";
		stu p;
		stu head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create(n);
		p = head;
		while (p != null)
		{
			s = p.c;
			//printf("%s ",s);
			k = s.length();
			//printf("%d ",k);
			for (i = 0;i < k;i++)
			{
				//printf("%c ",s[i]);
				t = s.charAt(i) - 65;
				a[t]++;
			}
			//for(t=0;t<26;t++)
				//printf("%d ",a[t]);

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


