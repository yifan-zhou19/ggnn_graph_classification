public class student
{
  public String str = new String(new char[1000]);
  public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(1000);
	  student p;
	  student head;
	  int i;
	  int j;
	  int t;
	  for (i = 0;;i++)
	  {
		a[i].str = new Scanner(System.in).nextLine();


		if (a[i].str.charAt(0) == 'e')
		{
		break;
		}
	  }
	  for (j = i - 1;j >= 0;j--)
	  {
		 head = a[i - 1]; //???a[i-1]???a[i]????????
		 a[j].next = a[j - 1]; //????????end
		 a[0].next = null;
	  }


	  p = head;
	  do
	  {
		  System.out.printf("%s\n",p.str);
		  p = p.next;
	  } while (p != null);
	}

}

