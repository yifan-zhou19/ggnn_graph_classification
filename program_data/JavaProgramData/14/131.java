public class student
{
		   public int id;
		   public int ch;
		   public int math;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max = new int(int * p,int n);
		void shuchu(int * p,int n,int k,struct student student[100001]);
		student[] student = tangible.Arrays.initializeWithDefaultstudentInstances(100001);
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (int)calloc(100001,(Integer.SIZE / Byte.SIZE));
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
							student[i].id = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead(" ");
						if (tempVar3 != null)
						{
							student[i].ch = Integer.parseInt(tempVar3);
						}
						String tempVar4 = ConsoleInput.scanfRead(" ");
						if (tempVar4 != null)
						{
							student[i].math = Integer.parseInt(tempVar4);
						}
						(*(p + i)) = (student[i].ch + student[i].math);

		}
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		k = max(tempRef_p, n);
		p = tempRef_p.argValue;
	tangible.RefObject<Integer> tempRef_p2 = new tangible.RefObject<Integer>(p);
		shuchu(tempRef_p2, n, k, student);
		p = tempRef_p2.argValue;
	tangible.RefObject<Integer> tempRef_p3 = new tangible.RefObject<Integer>(p);
		k = max(tempRef_p3, n);
		p = tempRef_p3.argValue;
	tangible.RefObject<Integer> tempRef_p4 = new tangible.RefObject<Integer>(p);
		shuchu(tempRef_p4, n, k, student);
		p = tempRef_p4.argValue;
	tangible.RefObject<Integer> tempRef_p5 = new tangible.RefObject<Integer>(p);
		k = max(tempRef_p5, n);
		p = tempRef_p5.argValue;
	tangible.RefObject<Integer> tempRef_p6 = new tangible.RefObject<Integer>(p);
		shuchu(tempRef_p6, n, k, student);
		p = tempRef_p6.argValue;

		return 0;
	}

	public static int max(tangible.RefObject<Integer> p, int n)
	{
		int k = 0;
		int i;
		for (i = 0;i < n;i++)
		{
						if ((*(p.argValue + i)) > k)
						{
						k = (*(p.argValue + i));
						}
		}
		return (k);
	}

	public static void shuchu(tangible.RefObject<Integer> p, int n, int k, student[] student)
	{
		 int i;
		 for (i = 0;i < n;i++)
		 {
						 if ((*(p.argValue + i)) == k)
						 {

									   System.out.printf("%d %d\n",student[i].id,k);
									   (*(p.argValue + i)) = 0;
									   break;
						 }
		 }
	}
}

