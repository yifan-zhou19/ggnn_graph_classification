public class student
{
		public int num;
		public int chinese;
		public int math;
		public int sum;
}

package <missing>;

public class GlobalMembers
{
		public static student[] work = tangible.Arrays.initializeWithDefaultstudentInstances(100001);
	public static void qsort(int left,int right)
	{
		if (left >= right)
		{
			return;
		}
		int pindex = left;
		int rindex = right;
	   work[0] = work[left];
	   while (pindex < rindex)
	   {
		while ((pindex < rindex) && (work[rindex].sum >= work[0].sum))
		{
		 rindex--;
		}
		if (pindex < rindex)
		{
			work[pindex] = work[rindex];
			pindex++;
		}
		while ((pindex < rindex) && (work[pindex].sum < work[0].sum))
		{
			 pindex++;
		}
		if (pindex < rindex)
		{
			work[rindex] = work[pindex];
			rindex--;
		}
	   }
	   work[pindex] = work[0];
	   qsort(left, pindex - 1);
	   qsort(pindex + 1, right);
	}
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		  work[i].num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  work[i].chinese = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  work[i].math = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  work[i].sum = work[i].chinese + work[i].math;
		}
		qsort(1, n);
		for (i = 0;i <= 2;i++)
		{
		System.out.print(work[n - i].num);
		System.out.print(" ");
		System.out.print(work[n - i].sum);
		System.out.print("\n");
		}
		return 0;
	}
}

