public class student
{
	public String num = new String(new char[1000]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student[] s = tangible.Arrays.initializeWithDefaultstudentInstances(1000);
		student p;
		student pheader;
		int i = 0;
		int n;
		char ch;
		for (i = 0;;i++)
		{
			s[i].num = new Scanner(System.in).nextLine();
			if (strcmp(s[i].num,"end") == 0)
			{
				break;
			}
		}
		n = i;
		pheader = s[n - 1];
		for (i = n - 1;i >= 1;i--)
		{
			s[i].next = s[i - 1];
		}
		s[0].next = null;
		p = pheader;
		while (p != null)
		{
			System.out.println(p.num);
			p = p.next;
		}

		return 0;
	}
}

