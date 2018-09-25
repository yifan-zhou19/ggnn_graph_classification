public class Node
{
	   public int number;
	   public Node next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		Node linkhead;
		Node a;
		Node linktail;
		int n;
		int m;
		int i;
		int j;
		int count = 0;
		int[] king = new int[100];
		while (true)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if ((n == 0) && (m == 0))
		{
			break;
		}
		for (i = 1;i <= n;i++)
		{
			if (i == 1)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
				a = (Node)malloc(1 * sizeof(Node));
			 a.number = i;
			 linkhead = a;
			 linktail = a;
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
				a = (Node)malloc(1 * sizeof(Node));
				a.number = i;
				linktail.next = a;
				linktail = a;
			}
		}
		linktail.next = linkhead;
		linkhead = linktail;
		for (i = 1;i <= (n - 1);i++)
		{
		for (j = 0;j < (m - 1);j++)
		{
			linkhead = linkhead.next;
		}
		a = linkhead.next;
		linkhead.next = a.next;
		a = null;
		}
		king[count] = linkhead.number;
		count++;
		linkhead = null;
		}
		for (i = 0;i < count;i++)
		{
			System.out.printf("%d\n",king[i]);
		}
	}










}

