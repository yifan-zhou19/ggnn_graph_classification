//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//struct node;
public class node
{
  public int value;
  public node pnext;
}

package <missing>;

public class GlobalMembers
{
	public static void node_create(node[] pheader, int l, String a, int max)
	{
	  node p = pheader[0];
	  p.pnext = null;
	  for (int i = 0;i < l;i++)
	  {
		 node pnew = new node();
		 pnew.value = a[i] - '0';
		 pnew.pnext = p.pnext;
		 p.pnext = pnew;
		 p = pheader[0];
	  }
	  for (int i = 0;i < l;i++)
	  {
		  p = p.pnext;
	  }
	  for (int i = l - 1;i <= max;i++)
	  {
		 node pnew = new node();
		 pnew.value = 0;
		 pnew.pnext = p.pnext;
		 p.pnext = pnew;
		 p = p.pnext;
	  }
	}
	public static void node_plus(node pheader1, node pheader2, node[] pheader3, int max)
	{
	   int sum;
	   int num = 0;
	   node p1 = pheader1.pnext;
	   node p2 = pheader2.pnext;
	   node p3 = pheader3.pnext;
	   for (int i = 0;i <= max;i++)
	   {
			 sum = p1.value + p2.value + num;
			 if (sum < 10)
			 {
				 p3.value = sum;
				 num = 0;
			 }
			 else
			 {
				 p3.value = sum - 10;
				 num = 1;
			 }
			 p1 = p1.pnext;
			 p2 = p2.pnext;
			 p3 = p3.pnext;
	   }
	}

	public static void output(node pheader3, int l)
	{
	  int t;
	  node p = pheader3;
	  int[] a = new int[length];
	  for (int i = 0;i < l;i++)
	  {
		  p = p.pnext;
		  a[i] = p.value;
	  }
	  for (int i = l - 1;i >= 0;i--)
	  {
		  if (a[i] != 0)
		  {
			  t = i;
			  break;
		  }
	  }
	  for (int i = t;i >= 0;i--)
	  {
		  System.out.printf("%d",a[i]);
	  }
	}
	public static int Main()
	{
	   node header1 = new node();
	   node header2 = new node();
	   node header3 = new node();
	   node pheader1 = header1;
	   node pheader2 = header2;
	   node pheader3 = header3;
	   int l1;
	   int l2;
	   int max;
	   final String a1 = "";
	   final String a2 = "";
	   final String a3 = "";
	   for (int i = 0;i < length + 1;i++)
	   {
		   a3 = tangible.StringFunctions.changeCharacter(a3, i, '0');
	   }
	   a1 = new Scanner(System.in).nextLine();
	   l1 = a1.length();
	   a2 = new Scanner(System.in).nextLine();
	   l2 = a2.length();
	   if (l1 >= l2)
	   {
		   max = l1 + 1;
	   }
	   else
	   {
		   max = l2 + 1;
	   }
	   node_create(pheader1, l1, a1, max);
	   node_create(pheader2, l2, a2, max);
	   node_create(pheader3, max, a3, max);
	   node_plus(pheader1, pheader2, pheader3, max);
	   output(pheader3, max);

	   System.in.read();
	   System.in.read();
	}

}

