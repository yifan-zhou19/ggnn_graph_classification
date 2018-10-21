public class book
{
	public int no;
	public String auth = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		book head;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		book * BK = new book();
		int m;
		int n;
		int k;
		int i;
		int j;
		int t;
		int q;
		int p;
		int max;
		int[] a = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: BK=(struct book*)malloc(m *LEN);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		BK.copyFrom((book)malloc(m * LEN));
		head = BK;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				BK.no = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				BK.auth = tempVar3.charAt(0);
			}
			n = BK.auth.length();
			for (j = 0;j < n;j++)
			{
				k = BK.auth.charAt(j) - 'A';
				a[k] = a[k] + 1;
			}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: BK=BK+1;
			BK.copyFrom(BK + 1);
		}
		max = a[0];
		t = 0;
		for (i = 1;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				t = i;
			}
		}
		q = t + 'A';
		System.out.printf("%c\n%d\n",q,max);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: BK=head;
		BK.copyFrom(head);
		for (i = 0;i < m;i++)
		{
			p = 0;
			n = BK.auth.length();
			for (j = 0;j < n;j++)
			{
				if (BK.auth.charAt(j) == q)
				{
					p = 1;
					break;
				}
			}
			if (p == 1)
			{
				System.out.printf("%d\n",BK.no);
			}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: BK=BK+1;
			BK.copyFrom(BK + 1);
		}
	}
}

