public class linknode
 {
	   public String inf = new String(new char[500]);
	   public linknode next;
	   public linknode prev;
 }

package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int i;
		 int a1;
		 int a2;
		 int j;
		 int min;
		 int k;
		 linknode head;
		 linknode p1;
		 linknode p2;
		 linknode p3;

		 k = 0;
		 for (i = 1;i <= 5;i)
		 {
			 p1 = new linknode();
			 if (k == 0)
			 {
				 head = p1;
				 p2 = p1;
			 }
			 else
			 {
				 p2.next = p1;
				 p1.prev = p2;
			 }

			 p1.inf = new Scanner(System.in).nextLine();
			 if (p1.inf.charAt(0) != 'e')
			 {
				 p2 = p1;
				 k++;
			 }
			 else
			 {
				 p1 = p2;
				 i = 6;
			 }
		 }



		 for (i = 1;i <= k;i++)
		 {
			 System.out.printf("%s\n",p1.inf);
			 if (i != k)
			 {
				 p1 = p1.prev;
			 }

		 }

	 }

}
