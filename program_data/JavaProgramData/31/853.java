public class student
{
 public String inf = new String(new char[1000]);
 public student pNext;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int k;
	  int l;
	  int m;
	  int n;
	  int count = 0;
	  student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(1000);
	  student pHeader;
	  student p;
	  for (i = 0;;i++)
	  {
		a[i].inf = new Scanner(System.in).nextLine();
		count = count + 1;
		if (strcmp(a[i].inf,"end") == 0)
		{
		break;
		}
	  }
	  pHeader = a[count - 2];
	  for (i = count - 2;i >= 1;i--)
	  {
		a[i].pNext = a[i - 1];
	  }
	  a[0].pNext = null;
	  p = pHeader;
	  while (p != null)
	  {
		System.out.println(p.inf);
		p = p.pNext;
	  }
	}

}

