public class student
{
	   public String num = new String(new char[100]);
	   public student pNext;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int count = 0;
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(1000);
		student pheader;
		student p;
		for (i = 0;;i++)
		{
		   a[i].num = new Scanner(System.in).nextLine();
		   count++;
		   if (strcmp(a[i].num,"end") == 0)
		   {
			  break;
		   }
		}
		pheader = a[count - 2];
		for (i = count - 2;i >= 1;i--)
		{
		   a[i].pNext = a[i - 1];
		}
		a[0].pNext = null;
		p = pheader;
		while (p != null)
		{
			System.out.println(p.num);
			p = p.pNext;
		}
	}

}

