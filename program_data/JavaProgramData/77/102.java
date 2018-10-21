public class ch
{
	public int k;
	public char a;
	public ch next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int t = 0;
		int n = 0;
		int N;
		int[][] z = new int[50][2];
		int temp;
		char boy;
		char girl;
		ch p1;
		ch p2;
		ch p3;
		ch head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (ch)malloc(LEN);
		boy = p1.a = System.in.read();
		p1.k = 0;
		head = null;
		for (i = 0;;i++)
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (ch)malloc(LEN);
			p1.a = System.in.read();
			p1.k = n;
			if (p1.a != '\n' && p1.a != boy)
			{
				girl = p1.a;
			}
			if (p1.a == '\n')
			{
				N = n = n - 1;
				break;
			}
		}
		p2.next = null;
		while (n > 1)
		{
			p1 = p2 = head,p3 = p2.next;
			while (p3 != null)
			{
				if (p2.a == boy && p3.a == girl)
				{
					if (p2 == head)
					{
						z[t][0] = p2.k,z[t][1] = p3.k,t = t + 1;
						if (p3.next != null)
						{
							head = (head.next).next,p1 = p2 = head,p3 = p2.next;
						}
						else
						{
							head = null;
						}
						n = n - 2;
					}
					else
					{
						z[t][0] = p2.k,z[t][1] = p3.k,t = t + 1;
						if (p3.next != null)
						{
							p1.next = p3.next,p2 = p3.next,p3 = p2.next;
						}
						else
						{
							p1.next = null;
						}
						n = n - 2;
					}
				}
				else
				{
					p1 = p2,p2 = p2.next,p3 = p2.next;
				}
			}
		}
		for (j = 0;j < t;j++)
		{
			for (i = 0;i < t - j - 1;i++)
			{
				if (z[i][1] > z[i + 1][1])
				{
					temp = z[i][0],z[i][0] = z[i + 1][0],z[i + 1][0] = temp;
					temp = z[i][1],z[i][1] = z[i + 1][1],z[i + 1][1] = temp;
				}
			}
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d %d\n",z[i][0],z[i][1]);
		}
		System.out.printf("0 %d\n",N);
	}
}
