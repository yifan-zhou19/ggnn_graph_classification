public class hz
{
	public int num;
public hz next;
}

package <missing>;

public class GlobalMembers
{
	public static hz[] hz = tangible.Arrays.initializeWithDefaulthzInstances(300);
	public static void Main()
	{
	hz head;
	hz p1;
	hz p2;
		int i;
		int j;
		int t = 0;
		int k;
	int[] n = new int[300];
	int[] m = new int[300];
	for (i = 0;i < 300;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n[i] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m[i] = Integer.parseInt(tempVar2);
	}
	t++;
	if (n[i] == 0 && m[i] == 0)
	{
	break;
	}
	}

	for (i = 0;i < t - 1;i++)
	{
	for (j = 0;j < n[i] - 1;j++)
	{
		hz[j].num = j + 1;
		hz[j].next = hz[j + 1];
	}
	hz[n[i] - 1].num = n[i];
	hz[n[i] - 1].next = hz[0];

	if (m[i] != 1)
	{
		head = hz[0];
		for (j = 0;j < n[i] - 1;j++)
		{
		p1 = head;

					for (k = 0;k < m[i] - 2;k++)
					{
	  p1 = p1.next;
					}

		 p2 = p1;
		 p1 = p1.next;
		 p2.next = p1.next;
		 head = p1.next;
		}
		System.out.printf("%d\n",head.num);
	}
	else
	{
	System.out.printf("%d\n",n[i]);
	}
	}


	}




}

