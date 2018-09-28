public class student
{
public String all = new String(new char[100]);
public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
	student head;
	student p;
	student q;
	int t = 0;

	head =  new student();
	head.all = new Scanner(System.in).nextLine();
	q = head;
	head.next = null;

	do
	{
		if (t > 0)
		{
			p.next = q;
			q = p;
		}

	p =  new student();
	p.all = new Scanner(System.in).nextLine();
	t++;
	}while (strcmp(p.all,"end") != 0);

	return (q);

	}

	public static void print(student head)
	{
	student p;
	p = head;

	do
	{
	System.out.printf("%s\n",p.all);
	p = p.next;
	}while (p != null);

	}

	public static void Main()
	{
	student headnew;

	headnew = creat();

	print(headnew);

	}

}
