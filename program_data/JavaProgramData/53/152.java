public class linknode
 {
	   public int inf;
	   public linknode next;
	   public linknode prev;
 }

package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int i;
		 int j;
		 int l;
		 int k;
		 int n;
		 int syn;
		 linknode head;
		 linknode p1;
		 linknode p2;
		 linknode p3;

		 k = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 1;i <= n;i++)
		 {

			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 l = Integer.parseInt(tempVar2);
			 }
			 syn = 0;

			 if (i != 1)
			 {
			   p2 = head;
			   for (j = 1;j <= k;j++)
			   {
				   if (l == p2.inf)
				   {
					   syn = 1;
				   }
				 if (j != k)
				 {
					 p2 = (p2.next);
				 }
			   }
			 }

			 if (syn == 0)
			 {
				p1 = new linknode();
				p1.inf = l;
				if (k == 0)
				{
					head = p1;
					p2 = p1;
				}

				  else
				  {
					  p2.next = p1;
				  }
				k++;
			 }

		 }

		 p1 = head;


		 for (i = 1;i <= k;i++)
		 {

			 System.out.printf("%d",p1.inf);
			 if (i != k)
			 {
				 p1 = p1.next;
				 System.out.print(",");
			 }

		 }
		 System.out.print("\n");

	 }

}

