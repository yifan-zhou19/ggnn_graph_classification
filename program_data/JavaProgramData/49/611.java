public class hw
{
	public int s;
	public int l;
}

package <missing>;

public class GlobalMembers
{
	public static hw[] queue = tangible.Arrays.initializeWithDefaulthwInstances(N);
	public static int Main()
	{
	  int len;
	  int q = 0;
	  int i;
	  int j;
	  String str = new String(new char[N]);
	  str = new Scanner(System.in).nextLine();
	  len = str.length();
	  for (i = 0;i < len - 1;i++)
	  {
	   if (str.charAt(i) == str.charAt(i + 1))
	   {
		 queue[q].s = i;
		 queue[q++].l = 2;
	   }
	  }
	  for (i = 0;i < q;i++)
	  {
		  for (j = 0;j < queue[i].l;j++)
		  {
		  System.out.printf("%c",str.charAt(queue[i].s + j));
		  }
		  System.out.print("\n");
		  if (str.charAt(queue[i].s - 1) == str.charAt(queue[i].s + queue[i].l))
		  {
		  queue[q].s = queue[i].s - 1;
		  queue[q++].l = queue[i].l + 2;
		  }
	  }
	}
}

