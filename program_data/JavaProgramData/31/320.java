public class student
{
	   public String id = new String(new char[400]);
	   public student pre;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 1;
		int n = 0;
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(1000);
		student head;
		student p;
		do
		{
							  a[i].id = new Scanner(System.in).nextLine();
							  i++;
							  n++;
		} while (a[i - 1].id.charAt(0) != 'e');
		head = a[n - 1];
		for (i = n - 1;i >= 2;i--)
		{
			a[i].pre = a[i - 1];
		}
		a[1].pre = null;
		p = head;
		for (i = 1;i <= n - 1;i++)
		{
						 System.out.println(p.id);
						 p = p.pre;
		}
		return 0;

	}

}

