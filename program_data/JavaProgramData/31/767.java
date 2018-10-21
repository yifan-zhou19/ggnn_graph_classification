public class student
{
	public String str = new String(new char[100]);
	public student next;
	public student front;
}

package <missing>;

public class GlobalMembers
{
	public static student create()
	{
		student head;
		student pf;
		student pa;
		student end;
		int n = 1;
		int flag = 0;
		do
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			pa = (student) malloc(LEN);
			pa.str = new Scanner(System.in).nextLine();
			if (strcmp(pa.str,"end") == 0)
			{
				if (n == 1)
				{
					flag = 1;
				}
				break;
			}
			if (n == 1)
			{
				head = pa;
				pf = pa;
				pa.front = null;
				n++;
			}
			else
			{
				pf.next = pa;
				pa.front = pf;
				pf = pa;
			}
		}while (n != 0);
		if (flag == 0)
		{
			pf.next = null;
		end = pf;
		}
		else
		{
			head = pa;
			end = null;
		}
		return (end);
	}
	public static int Main()
	{
		student end;
		student pt;
		end = create();
		pt = end;
		while (pt != null)
		{
			System.out.printf("%s\n",pt.str);
			pt = pt.front;
		}

		return 0;
	}





}
