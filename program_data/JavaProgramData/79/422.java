/*
 *La vie est ailleurs
 *PROB: Joseph Problems
 *LANG: c
 *IDE: Dev-C++ 4.9.9.2
 *Compiler: gcc
 *ID: 00910049
 *Coding by Xu Zhendong
 */



public class Per
{
	public int num;
	public Per next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		//printf("Please input 'n' and 'm', seperated by space.\nExample: 6 2\n");
		Per head;
		Per p;
		while (true)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (n == 0 || m == 0)
		{
			break;
		}
		if (n == 1 || m == 1)
		{
			System.out.printf("%d\n", n);
			continue;
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (Per) malloc(LEN);
		p = head;
		//head -> num = 1;
		for (i = 1; i <= n; i++)
		{
			p.num = i;
			if (i == n)
			{
				p.next = head;
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p.next = (Per) malloc(LEN);
				p = p.next;
			}
		}
		p = head;
		/*
		for (i = 1; i <= n; i ++)
		{
			printf("%d",p -> num);
			p = p-> next;
		}
		*/

		while (p != p.next)
		{
			for (i = 1; i < m; i++)
			{
				if (i == (m - 1))
				{
					p.next = p.next.next;
					p = p.next;
				}
				else
				{
					p = p.next;
				}
			}
		}

		System.out.printf("%d\n",p.num);
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

