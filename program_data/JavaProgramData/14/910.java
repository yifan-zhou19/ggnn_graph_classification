public class student
{
	public int n1;
	public int n2;
	public int n3;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student p;
		student head;
		student tail;
		int n;
		int i;
		int[] sum = new int[100000];
		int max1;
		int max2;
		int max3;
		int k1;
		int k2;
		int k3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = null;
		tail = null;
		for (i = 1;i <= n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (student)malloc(len);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.n1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.n2 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.n3 = Integer.parseInt(tempVar4);
			}
			if (head == null)
			{
				head = tail = p;
			}
			else
			{
				tail.next = p;
				tail = p;
			}
			sum[i] = p.n2 + p.n3;
		}
		max1 = sum[1];
		k1 = 1;
		for (i = 1;i <= n;i++)
		{
			if (sum[i] > max1)
			{
			max1 = sum[i];
			k1 = i;
			}
		}
		sum[k1] = 0;

			 max2 = sum[1];
			 k2 = 1;
			 for (i = 1;i <= n;i++)
			 {
			if (sum[i] > max2)
			{
			max2 = sum[i];
			k2 = i;
			}
			 }
		sum[k2] = 0;

		max3 = sum[1];
		k3 = 1;
		for (i = 1;i <= n;i++)
		{
			if (sum[i] > max3)
			{
			max3 = sum[i];
			k3 = i;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",k1,max1,k2,max2,k3,max3);
	}



}

